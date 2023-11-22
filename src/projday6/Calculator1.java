package projday6;

import org.junit.Assert;
import org.junit.Test;

public class Calculator1 extends Calculator{
	@Test(expected = ArithmeticException.class)
	public void testDivide() {
		JunitEx ex = new JunitEx();
		System.out.println("Test 3");
		int res = ex.calcDivide(10, 0);
		Assert.assertEquals(1, res);
	}

}
