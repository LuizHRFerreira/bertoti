package fatec;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

import org.junit.jupiter.api.Test;

class TesteAluno {

	@Test
	void test() {
		
		SalaAula fatec = new SalaAula();
		Aluno Luiz = new Aluno("Luiz", "12345");

		Aluno Carlos = new Aluno("Carlos", "67891");
		
		fatec.cadastrarAluno(Luiz);
		fatec.cadastrarAluno(Carlos);
		
		assertEquals(fatec.getAlunos().size(),2);

		//Cria uma lista do tipo Aluno e a chama de "encontrarAluno" e importei de fatec o metodo buscarAlunoPorNome e coloquei o nome Luiz
		List<Aluno> encontrarAluno = fatec.buscarAlunoPorNome("Luiz");
		//
		assertEquals(encontrarAluno.get(0).getRa(), Luiz.getRa());
	}

}
