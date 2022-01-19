import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountingTest {
	
	@Test
	public void test() {
		
		CountingEx obj= new CountingEx();
		
		int output=obj.countA("sathya");
		
		assertEquals(2,output);
	}

}
