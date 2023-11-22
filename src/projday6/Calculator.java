package projday6;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore; 

public class Calculator {
	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("Start Class");
	}
	
	
	@Before
	public void beforeTest() {
		System.out.println("Start Test");
	}
	
	@Test
	public void testAddition() {
		JunitEx ex = new JunitEx();
		System.out.println("Test 1");
		Assert.assertEquals(20, ex.calcAddition(10,10));
	}

	@Ignore  //to ignore any test
	@Test
	public void testSubtraction() {
		JunitEx ex = new JunitEx();
		System.out.println("Test 2");
		Assert.assertEquals(0, ex.calcSubtraction(10,10));
	}
	

	@After
	public void afterTest() {
		System.out.println("End Test");
	}
	
	@AfterClass
	public static void AfterClassTest() {
		System.out.println("End Class");
	}

	

}
