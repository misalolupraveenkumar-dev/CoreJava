package info.com;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TernaryOperatorTest {

	@Test
	void test() {
//		fail("Not yet implemented");
		
		
		 int exp1 = 0, exp2 = 0;
		    int result = 8 > 10 ? ++exp1 : ++exp2;

		    
		    assertEquals(exp1, 0);
		    
		    assertEquals(exp2, 0);
		    assertEquals(result, 1);
		    
		    
	}

}
