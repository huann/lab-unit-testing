package taojava.labs.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest extends SampleMethods {
	
	@Test
	public void testSum() {
		int[] values = { 1, 2, 3 };
		assertEquals("sum values", 6, sum(values));
    }
	
	@Test
	public void testSum1() {
		int[] values = { -1, -2, -3 };
		assertEquals("sum values", -6, sum(values));
    }
	
	@Test
	public void testSum2() {
		int[] values = { -1, 2, -3 };
		assertEquals("sum values", -2, sum(values));
    }
	
	@Test
	public void testSum3() {
		int[] values = { 1*1, 2*1, -3 };
		assertEquals("sum values", 0, sum(values));
    }
	
	//This works when you take out static keyword. Why?
	@Test
	public void testExtremes() {
        int tmp = Integer.MAX_VALUE - 10;
        int[] values = { tmp, tmp, -tmp, -tmp };
        assertEquals("extreme test", 0, sum(values));
    } // testExtremes
	
}
