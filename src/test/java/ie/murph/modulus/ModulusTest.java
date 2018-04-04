package test.java.ie.murph.modulus;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.java.ie.murph.modulus.Modulus;


public class ModulusTest
{
	private Modulus modulus;
	
	@Before
	public void setUp() throws Exception
	{
		modulus = new Modulus();
	}

	@Test
	public void getLastDigit()
	{
		int numberTest = 12345;
		int lastDigitTest = numberTest%10;
		
		assertEquals(lastDigitTest, modulus.getLastDigit(12345));
		
		System.out.println("Test Result: " + lastDigitTest + "\n" + "Method Result:" + modulus.getLastDigit(12345));
	}
	
}
