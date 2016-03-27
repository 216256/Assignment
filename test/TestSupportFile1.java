import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSupportFile1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		
		SupportFile1 sf1 = new SupportFile1();
		
		int k = sf1.addMethod(3, 5);
		
		if (k==8) {
			assertTrue(true);
		} else {
			fail("Result not matching the expected addition");
		}
		
		
	}
	
	@Test
	public void test2() {
		fail("Not yet implemented");
	}

}
