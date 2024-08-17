package fatec;

//Importa duas bibliotecas, List e Linked List

import java.util.LinkedList;
import java.util.List;

//Cria classe "Sala de aula"
public class SalaAula{
	
	//Cria objeto aluno como classe Aluno
	private List<Aluno> alunos = new LinkedList<Aluno>();
	
	//Puxou objeto aluno que pertence a classe Aluno
	public void cadastrarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public List<Aluno> buscarAlunoPorNome(String nome){
		
		List<Aluno> alunosEncontrados = new LinkedList<Aluno>();
		for(Aluno aluno:this.alunos) {
		
		//Aluno é uma variavel que aponta para uma variavel de tipo Aluno. Como eu tenho essa variavel, eu pego getNome que é um metodo da classe Aluno.
		//Isso me retorna uma String. Na classe String tem o método Equals que vai comparar a string que eu tenho com oque está em parenteses()
		
			if(aluno.getNome().equals(nome)) alunosEncontrados.add(aluno);
		
		}
		return alunosEncontrados;
		
	}
	
	public List<Aluno> getAlunos(){
		return alunos;
	}
}