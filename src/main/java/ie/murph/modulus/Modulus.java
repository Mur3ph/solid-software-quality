package main.java.ie.murph.modulus;

public class Modulus
{
	
	public int getLastDigit(int number)
	{
		return number % 10;
	}
	
	public boolean isNumberEven(int number)
	{
		return number % 2 == 0;
	}
	
//	number % 2 == 1; was not allowing negative odd numbers
	public boolean isNumberOdd(int number)
	{
		return number % 2 != 0;
	}
	
}
