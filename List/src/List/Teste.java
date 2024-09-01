package List;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		
		SalaAula fatec = new SalaAula();
		
		Aluno joao = new Aluno("Joao", "54321");
		Aluno jose = new Aluno("Jose", "12345");
		
		fatec.cadastrarAluno(joao);
		fatec.cadastrarAluno(jose);
		
		assertEquals(fatec.getAlunos().size(), 2);
		
		List<Aluno> joseses = fatec.buscarAlunoPorNome("Jose");
		assertEquals(joseses.get(0).getRa(), jose.getRa());
		
		
	}}