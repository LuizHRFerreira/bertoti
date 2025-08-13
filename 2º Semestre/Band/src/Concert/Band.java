package Concert;


//Importa as bibliotecas List e LinkedList
import java.util.LinkedList;
import java.util.List;

//Criada a classe Band
public class Band {
	
	// Criada uma lista com membros da banda e chamada de members
	private List<Member> members = new LinkedList<Member>();

	// Construtor que vai adicionar um objeto member na lista members
	public void registerMember(Member member) {
		members.add(member);
	}
	
	// Criado um método chamado serchMemberByName na lista Member que utilizaremos para localizar uma string 
	// no atributo name do objeto Member
	public List<Member> serchMemberByName(String name){
		// Criada o objeto membersFound e vinculada a lista Member a ele
		List<Member> membersFound = new LinkedList<Member>();
		//  Vai procurar o atributo member do objeto Member na lista members
		for(Member member:members) {
			//Se o metodo getName do objeto member for igual ao nome, ele vai adicionar esse nome a lista
			if(member.getName().equals(name)) 
				membersFound.add(member);
		}
		//retorna a lista mambersFound
		return membersFound;
	}
	
	// Criação do metodo getMember que vai retornar a lista members
	public List<Member> getMember() {
		return members;
	}
	
}