package main.java.ie.murph.modulus;


public class PrimeNumber
{
	public boolean isPrime1(int n) {
	    // Two is the only even prime number, multiple of one and itself
	    if (n%2==0) return true;
	    
	    //if not, then just check the odds
	    for(int i=3;i<=n; i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
//	Faster than above method
	public boolean isPrime2(int n) {
	    // Two is the only even prime number, multiple of one and itself
	    if (n%2==0) return true;
	    
	    //if not, then just check the odds
	    for(int i=3;i<=n/2; i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
//	Even Faster than above method
	public boolean isPrime3(int n) {
	    // Two is the only even prime number, multiple of one and itself
	    if (n%2==0) return true;
	    
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
//	Yet Even Faster than above method, not fully tested
	public boolean isPrime(int n) {
	    // Two is the only even prime number, multiple of one and itself
	    if (n%2==0) return true;
	    
	    //if not, then just check the odds
	    for(int i=3;i*i<=n/2;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
//	boolean[] primes=new boolean[10000]; 
//	//set up the primesieve
//	public void fillSieve() {
//	    Arrays.fill(primes,true);        // assume all integers are prime.
//	    primes[0]=primes[1]=false;       // we know 0 and 1 are not prime.
//	    for (int i=2;i<primes.length;i++) {
//	        //if the number is prime, 
//	        //then go through all its multiples and make their values false.
//	        if(primes[i]) {
//	            for (int j=2;i*j<primes.length;j++) {
//	                primes[i*j]=false;
//	            }
//	        }
//	    }
//	}
//
//	public boolean isPrime(int n) {
//	    return primes[n]; //simple, huh?
//	}
}
