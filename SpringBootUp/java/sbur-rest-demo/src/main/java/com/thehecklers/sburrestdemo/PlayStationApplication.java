package com.thehecklers.sburrestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication

	public class PlayStationApplication {

		// Método main que inicia a aplicação
		public static void main(String[] args) {
			SpringApplication.run(PlayStationApplication.class, args);
		}

	}

	// Classe responsavel por gerenciar as requisições HTTP e retorna respostas no formato JSON
	// (por padrão no Spring Boot).
	@RestController

	// Endereço pelo qual abre o acesso para cliente, no caso vai sempre começar com /PlayStation
	@RequestMapping("/PlayStations")
	@CrossOrigin(origins = "*")

			// Cria classe que vai
	class RestApiDemoController {
		private final List<PlayStation> playstations = new ArrayList<>();

		public RestApiDemoController() {
			playstations.addAll(List.of(
					new PlayStation("Play Station 1", "1.299,00"),
					new PlayStation("Play Station 2", "749,00"),
					new PlayStation("Play Station 3", "1.599,00"),
					new PlayStation("Play Station 4", "2.499,00"),
					new PlayStation("Play Station 5", "3.300,00")
			));
		}

		@Configuration
		public class WebConfig implements WebMvcConfigurer {

			@Override
			public void addCorsMappings(CorsRegistry registry) {
				// Configuração global para permitir todas as origens durante o desenvolvimento
				registry.addMapping("/**")
						.allowedOrigins("http://localhost:3000")  // Alterar para o endereço do seu frontend
						.allowedMethods("GET", "POST", "PUT", "DELETE")
						.allowedHeaders("*");
			}
		}


		@GetMapping
		Iterable<PlayStation> getplaystations() {
			return playstations;
		}

		@GetMapping("/{id}")
		Optional<PlayStation> getPlayStationById(@PathVariable String id) {
			for (PlayStation c: playstations) {
				if (c.getId().equals(id)) {
					return Optional.of(c);
				}
			}

			return Optional.empty();
		}

		@PostMapping
		PlayStation postPlayStation(@RequestBody PlayStation playstation) {
			if (playstation.getId() == null || playstation.getId().isEmpty()) {
				playstation = new PlayStation(playstation.getName(),playstation.getPreco());
			}
			playstations.add(playstation);
			return playstation;
		}

		@PutMapping("/{id}")
		ResponseEntity<PlayStation> putPlayStation(@PathVariable String id,
										 @RequestBody PlayStation playstation) {
			int playstationIndex = -1;

			for (PlayStation c: playstations) {
				if (c.getId().equals(id)) {
					playstationIndex = playstations.indexOf(c);
					playstations.set(playstationIndex, playstation);
				}
			}

			return (playstationIndex == -1) ?
					new ResponseEntity<>(postPlayStation(playstation), HttpStatus.CREATED) :
					new ResponseEntity<>(playstation, HttpStatus.OK);
		}

		@DeleteMapping("/{id}")
		void deletePlayStation(@PathVariable String id) {
			playstations.removeIf(c -> c.getId().equals(id));
		}

		@PatchMapping("/{id}")
		public ResponseEntity<PlayStation> editPlayStation(@PathVariable String id, @RequestBody PlayStation newData) {
			for (PlayStation c : playstations) {
				if (c.getId().equals(id)) {
					if (newData.getName() != null && !newData.getName().isEmpty()) {
						c.setName(newData.getName());
					}
					if (newData.getPreco() != null && !newData.getPreco().isEmpty()) {
						c.setPreco(newData.getPreco());
					}
					return new ResponseEntity<>(c, HttpStatus.OK);
				}
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

		// Criação da classe PlayStation (tem só o id e o nome)
		class PlayStation {
		private final String id;
		private String name;
		private String preco;


		// Construtor
		public PlayStation() {
			this.id = UUID.randomUUID().toString();
		}

		public PlayStation(String id, String name, String preco) {
			this.id = id;
			this.name = name;
			this.preco = preco;
		}


		public PlayStation(String name, String preco) {
			this(UUID.randomUUID().toString(), name, preco);
		}


		// Métodos get e set
		public String getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public String getPreco() {return preco;}
		public void setName(String name) {this.name = name;}
		public void setPreco(String preco) {this.preco = preco;}

		}


