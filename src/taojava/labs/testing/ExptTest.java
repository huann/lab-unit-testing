package taojava.labs.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExptTest extends SampleMethods {

	@Test
	public void testExpt() {
		for (int power = 0; power < 6; power++) {
			assertEquals("", 2^power, expt(2, power));
			}
	}
	
	@Test
	public void testExpt1() {
		for (int power = 0; power < 6; power++) {
			assertEquals("", 3^power, expt(3, power));
			}
	}

	@Test
	public void testExpt2() {
		for (int base = 0; base < 500; base++) {
			assertEquals("", base*base*base, expt(base, 3));
			}
	}
	
	@Test
	public void testExpt3() {
		for (int base = 0; base < 500; base++) {
			assertEquals("", base*base, expt(base, 2));
			}
	}
}
