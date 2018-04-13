package main.java.ie.murph.modulus;

import java.util.stream.IntStream;

public class PrimeNumber
{
	public boolean isIntegerAPrimeNumber(int numberToCheck) {
	    // Two is the only even prime number, multiple of one and itself
	    if (lessThanTwo(numberToCheck)) return false;
	    
	    for(int iteration = 2; iteration <= numberToCheck/2; iteration++) {
	        if(numberToCheck % iteration == 0) {
	        	 return false;
	        }
	    }
	    return true;
	}
	
    private boolean lessThanTwo(int numberToCheck)
	{
		return numberToCheck < 2;
	}

//	Faster than above method
	public boolean isIntegerAPrimeNumberFaster(int numberToCheck) {
		if (lessThanTwo(numberToCheck)) return false;
	    for(int iteration = 2; iteration*iteration <= numberToCheck; iteration++) {
	        if(numberToCheck % iteration == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public boolean isIntegerAPrimeNumberJava8(int numberToCheck) {
		if (lessThanTwo(numberToCheck)) return false;
	    return IntStream.rangeClosed(2, (int) (Math.sqrt(numberToCheck)))
	      .filter(n -> (n & 0X1) == 0)
	      .allMatch(n -> numberToCheck % n != 0);
	}
	
}
