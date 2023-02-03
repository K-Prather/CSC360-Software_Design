package sayHi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
	
	Person S;
	Person K;
	Person P;
	int SAge = 16;
	int KAge = 20;
	int PAge = 47;

	@BeforeEach
	void setUp() throws Exception {
		S = new Person("Seri", "Orhan", SAge);
		K = new Person("Karli", "Prather", KAge);
		P = new Person("Pedro", "Pascal", PAge);
	}

	@Test
	void testToString() {
		assertEquals("Person: Seri Orhan, " + SAge, S.toString());
		//fail("Not yet implemented");
	}
	
	@Test
	void testPerson(){
		
		assertThrows(UnderageException.class, 
				()->{
					S.makePerson(K);
				});
		
	
		Person child;
		try {
			child = P.makePerson(K);
			assertEquals(P.getFname(), child.getFname());
			assertEquals(K.getLname(), child.getLname());
			assertEquals(0, child.getAge());
			
		} catch (UnderageException e) {
			
			e.printStackTrace();
			fail("Threw exception.");
			
		}
	
	}

}
