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
//		System.out.println("Prime number 101: " + primeNumber.isIntegerAPrimeNumber(101));
		System.out.println("Prime number 4: " + primeNumber.isIntegerAPrimeNumber(4));
		System.out.println("Prime number 7: " + primeNumber.isIntegerAPrimeNumber(7));
		System.out.println("Prime number 10: " + primeNumber.isIntegerAPrimeNumber(10));
		System.out.println("Prime number 12: " + primeNumber.isIntegerAPrimeNumber(12));
		
		System.out.println("isIntegerAPrimeNumberFaster: 0 " + primeNumber.isIntegerAPrimeNumberFaster(0));
		System.out.println("isIntegerAPrimeNumberFaster: 1 " + primeNumber.isIntegerAPrimeNumberFaster(1));
		System.out.println("isIntegerAPrimeNumberFaster: 2 " + primeNumber.isIntegerAPrimeNumberFaster(2));
		System.out.println("isIntegerAPrimeNumberFaster: 4 " + primeNumber.isIntegerAPrimeNumberFaster(4));
		
		System.out.println("isIntegerAPrimeNumberFaster: 5 " + primeNumber.isIntegerAPrimeNumberFaster(5));
		System.out.println("isIntegerAPrimeNumberFaster: 6 " + primeNumber.isIntegerAPrimeNumberFaster(6));
		System.out.println("isIntegerAPrimeNumberFaster: 7 " + primeNumber.isIntegerAPrimeNumberFaster(7));
		System.out.println("isIntegerAPrimeNumberFaster: 10 " + primeNumber.isIntegerAPrimeNumberFaster(10));
		System.out.println("isIntegerAPrimeNumberFaster: 11 " + primeNumber.isIntegerAPrimeNumberFaster(11));
		System.out.println("isIntegerAPrimeNumberFaster: 14 " + primeNumber.isIntegerAPrimeNumberFaster(14));
		System.out.println("isIntegerAPrimeNumberFaster: 101 " + primeNumber.isIntegerAPrimeNumberFaster(101));
		System.out.println("isIntegerAPrimeNumberFaster: 102 " + primeNumber.isIntegerAPrimeNumberFaster(102));
	}
	
}
