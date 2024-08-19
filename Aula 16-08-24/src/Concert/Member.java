package Concert;

/** Criada a classe BandMember aonde adicionei os atributos name que terá o nome do integrante da banda e 
 * o atributo instrument que é o instrumento que o integrante toca*/
public class Member{
	
	// Todos os atributos são texto
	private String name;
	private String instrument;
	
	//Criação do construtor que quando chamado, colocará os valores nos atributos dos objetos de classe BandMember
	public Member(String name, String instrument) {
		this.name = name;
		this.instrument = instrument;
	}
	
	//Criação de construtor que quando chamado, vincula o texto digitado ao atributo name
	public void setName(String name) {
		this.name = name;
	}

	//Criado o método que quando chamado, imprime o nome do integrante
		public String getName() {
			return name;
		}
	
	//Criação de construtor que quando chamado, vincula o texto digitado ao atributo instrument
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	//Criado o método que quando chamado, imprime o instrumento que o integrante da banda toca
	public String getInstrument() {
		return instrument;
	}

}
