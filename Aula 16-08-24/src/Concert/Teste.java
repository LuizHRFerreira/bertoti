package Concert;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Teste {
	
	@Test
	void test() {
		
		Band Wings = new Band();
		
		Member Paul = new Member("Paul", "Bass");
		Member Linda = new Member("Linda", "Kayboard");
		Member Danny = new Member("Danny", "Guitar");
		
		Wings.registerMember(Paul);
		Wings.registerMember(Linda);
		Wings.registerMember(Danny);
		
		assertEquals(Wings.getMember().size(), 3);
		
		List<Member> Formation = Wings.serchMemberByName("Paul");
		assertEquals(Formation.get(0).getInstrument(), Paul.getInstrument());		
	}
	
	

}
