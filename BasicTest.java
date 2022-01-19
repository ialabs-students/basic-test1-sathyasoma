import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BasicTest {
	
	Basic basic= new Basic();
	
	@Test
	public void addtest() {
		int result=basic.addition(4,3);
		assertEquals(7,result);
	}
	@Test
	public void subtest() {
		int result=basic.subtraction(90,20);
		assertEquals(70,result);
	}
	@Test
	public void multest() {
		int result=basic.multiplication(5,7);
		assertEquals(35,result);
	}
	@Test
	public void divtest() {
		int result=basic.division(40,4);
		assertEquals(10,result);
	}
}

