package test.java.ie.murph.modulus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.java.ie.murph.modulus.PrimeNumber;

public class PrimeNumberTest
{
	private PrimeNumber primeNumber;

	@Before
	public void setUp() throws Exception
	{
		primeNumber = new PrimeNumber();
	}

	@Test
	public void isPrimeTest()
	{
		assertEquals("Test will succeed. Two is the only even prime number, multiple of one and itself", true, primeNumber.isIntegerAPrimeNumber(2));
		
//		Boundary tests..
		assertTrue("This will succeed, boundary tests", primeNumber.isIntegerAPrimeNumber(1));
		assertTrue("This will succeed, boundary tests", primeNumber.isIntegerAPrimeNumber(2));
		assertFalse("This will succeed, boundary tests", primeNumber.isIntegerAPrimeNumber(4));
		assertFalse("This will succeed, boundary tests", primeNumber.isIntegerAPrimeNumber(0));
	}

}
