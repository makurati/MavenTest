package helllo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class HelloTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class executed");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		System.out.println("After class executed");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before test executed");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After test executed");
	}

	@Test
	//@Ignore
	public void test() {
		Hello h=new Hello();
		//System.out.println(s);
		System.out.println("Inside test");
		assertEquals("Hello",h.sayHello());
		//fail("Not yet implemented");
	}
	
	@Test
	public void test1() {
		Hello h=new Hello();
		//System.out.println(s);
		System.out.println("Inside test-1");
		assertEquals("Hello",h.sayHello());
		//fail("Not yet implemented");
	}

}
