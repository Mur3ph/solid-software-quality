package test.java.ie.murph.modulus;

import static org.junit.Assert.assertEquals;

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
		assertEquals("Both are true, this will succeed", true, primeNumber.isPrime(2));
	}

}
