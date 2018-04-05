package test.java.ie.murph.modulus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

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
		int lastDigitOfNumber = 5;
		int getLastDigitOfNumberTest = numberTest%10;
		
		assertEquals(getLastDigitOfNumberTest, modulus.getLastDigit(12345));
		assertEquals(lastDigitOfNumber, modulus.getLastDigit(12345));
		
		System.out.println("Test Result: " + getLastDigitOfNumberTest + "\n" + "Method Result:" + modulus.getLastDigit(12345));
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
		
		assertEquals("Both are true, this will succeed", ifEvenNumberTrue, modulus.isNumberEven(evenNumber));
		assertEquals("Both are false, this will succeed", ifOddNumberFalse, modulus.isNumberEven(oddNumber));
		
		assertEquals("Both are true, this will succeed", isNumberEven1, modulus.isNumberEven(evenNumber));
		assertEquals("Both are false, this will succeed", isNumberEven2, modulus.isNumberEven(oddNumber));
		
		assertTrue("This will succeed, it is an even number being passed", modulus.isNumberEven(evenNumber));
		assertFalse("This will succeed, it is an odd number being passed", modulus.isNumberEven(oddNumber));
		
		assertSame(isNumberEven1, modulus.isNumberEven(evenNumber));
		assertNotSame(isNumberEven2, modulus.isNumberEven(evenNumber));
		
//		Boundary tests..
		assertTrue("This will succeed, boundary tests", modulus.isNumberEven(0));
		assertTrue("This will succeed, boundary tests", modulus.isNumberEven(1000000000));
		assertTrue("This will succeed, boundary tests", modulus.isNumberEven(-1000000000));
		assertFalse("This will succeed, boundary tests", modulus.isNumberEven(-1));
		assertFalse("This will succeed, boundary tests", modulus.isNumberEven(999999999));
		assertFalse("This will succeed, boundary tests", modulus.isNumberEven(-999999999));
	}
	
	@Test
	public void isNumberOddTest()
	{
		int evenNumber = 8;
		int oddNumber = 7;
		
		boolean ifOddNumberTrue = true;
		boolean ifEvenNumberFalse = false;
		
		boolean isNumberOdd1 = oddNumber % 2 == 1;
		boolean isNumberOdd2 = evenNumber % 2 == 1;
		
		assertEquals("Both are true, this will succeed", ifEvenNumberFalse, modulus.isNumberOdd(evenNumber));
		assertEquals("Both are false, this will succeed", ifOddNumberTrue, modulus.isNumberOdd(oddNumber));
		
		assertEquals("Both are true, this will succeed", isNumberOdd1, modulus.isNumberOdd(oddNumber));
		assertEquals("Both are false, this will succeed", isNumberOdd2, modulus.isNumberOdd(evenNumber));
		
		assertTrue("This will succeed, it is an odd number being passed", modulus.isNumberOdd(oddNumber));
		assertFalse("This will succeed, it is an even number being passed", modulus.isNumberOdd(evenNumber));
		
		assertSame(isNumberOdd1, modulus.isNumberOdd(oddNumber));
		assertNotSame(isNumberOdd2, modulus.isNumberOdd(oddNumber));
		
//		Boundary tests..
		assertTrue("This will succeed, boundary tests", modulus.isNumberOdd(-1));
		assertTrue("This will succeed, boundary tests", modulus.isNumberOdd(999999999));
		assertTrue("This will succeed, boundary tests", modulus.isNumberOdd(-999999999));
		assertFalse("This will succeed, boundary tests", modulus.isNumberOdd(0));
		assertFalse("This will succeed, boundary tests", modulus.isNumberOdd(1000000000));
		assertFalse("This will succeed, boundary tests", modulus.isNumberOdd(-1000000000));
	}
	
}
