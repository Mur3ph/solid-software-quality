package main.java.ie.murph.modulus;


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
	
}
