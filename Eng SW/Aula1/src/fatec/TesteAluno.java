package fatec;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteAluno {

	@Test
	void test() {
		
		SalaAula fatec = new SalaAula();
		Aluno Luiz = new Aluno("Luiz", "12345");
		
		fatec.cadastrarAluno(Luiz);
		
		assertEquals(fatec.getAlunos().size(),1);

	}

}
