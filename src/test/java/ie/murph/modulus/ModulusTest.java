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
	public void getLastDigitTest()
	{
		int numberTest = 12345;
		int lastDigitTest = numberTest%10;
		
		assertEquals(lastDigitTest, modulus.getLastDigit(12345));
		
		System.out.println("Test Result: " + lastDigitTest + "\n" + "Method Result:" + modulus.getLastDigit(12345));
	}
	
	@Test
	public void isNumberEvenTest()
	{
		int evenNumber = 8;
		int oddNumber = 7;
		
		boolean ifEvenNumberTrue = true;
		boolean ifOddNumberFalse = false;
		
		boolean isNumberEven1 = evenNumber % 2 == 0;
		boolean isNumberEven2 = oddNumber % 2 == 0;
		
		assertEquals(ifEvenNumberTrue, modulus.isNumberEven(evenNumber));
		assertEquals(ifOddNumberFalse, modulus.isNumberEven(oddNumber));
		
		assertEquals(isNumberEven1, modulus.isNumberEven(evenNumber));
		assertEquals(isNumberEven2, modulus.isNumberEven(oddNumber));
	}
	
}
