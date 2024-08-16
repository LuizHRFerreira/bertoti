package fatec;

import java.util.LinkedList;
import java.util.List;

public class SalaAula{
	
	private List<Aluno> alunos = new LinkedList<Aluno>();
	
	public void cadastrarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public List<Aluno> getAlunos(){
		return alunos;
	}
}