package taojava.labs.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class C2FTest extends SampleMethods {

	public void testC2f() {
		assertEquals(0,0);
	}
	
  /**
	@Test
	public void test2() {
		assertEquals("stupid test", 10, 3*5);
    } // test2()
   */

    
//Tests for cf2
	@Test
	public void testC2f1() {
		assertEquals("0C to F", 32, c2f(0));
    }
	
	@Test
	public void testC2f2() {
		assertEquals("100C to F", 212, c2f(100));
    }
	
	@Test
	public void testC2f3() {
		assertEquals("-10C to F", 14, c2f(-10));
    }
	
	@Test
	public void testC2f4() {
		assertEquals("-10C to F", 2*7, c2f(-5*2));
    }
	
}