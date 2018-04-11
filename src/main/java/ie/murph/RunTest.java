package main.java.ie.murph;

import main.java.ie.murph.modulus.PrimeNumber;

public class RunTest
{
	private static PrimeNumber primeNumber;

	public static void main(String[] args)
	{
		int number = 12345;
		int lastDigit = number%10;
		System.out.println("Result: " + lastDigit);
		
		boolean isOdd = -1 % 2 == 1;
		
		System.out.println("Is number even " + 3 % 2);
		System.out.println("Is number odd " + isOdd);
		
		primeNumber = new PrimeNumber();
		System.out.println("Prime number 101: " + primeNumber.isPrime(101));
		System.out.println("Prime number 4: " + primeNumber.isPrime(4));
	}
	
}
