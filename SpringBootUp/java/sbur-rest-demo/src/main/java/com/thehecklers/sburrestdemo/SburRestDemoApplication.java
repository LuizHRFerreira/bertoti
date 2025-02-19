package com.thehecklers.sburrestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class SburRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SburRestDemoApplication.class, args);
	}

}

@RestController
@RequestMapping("/PlayStations")
class RestApiDemoController {
	private List<PlayStation> playstations = new ArrayList<>();

	public RestApiDemoController() {
		playstations.addAll(List.of(
				new PlayStation("Play Station 1"),
				new PlayStation("Play Station 2"),
				new PlayStation("Play Station 3"),
				new PlayStation("Play Station 4"),
				new PlayStation("Play Station 5")
		));
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
}

class PlayStation {
	private final String id;
	private String name;

	public PlayStation(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public PlayStation(String name) {
		this(UUID.randomUUID().toString(), name);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}