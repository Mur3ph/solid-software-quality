package test.java.ie.murph.performance.bigO;

public class BigONotationPerfermanceTest {
	
	public static void main(String[] args) {
		int n = 1000;
		System.out.println("Hey - your input is: " + n);

		System.out.println("Hey - your input is: " + n);
		System.out.println("Hmm.. I'm doing more stuff with: " + n);
		System.out.println("And more: " + n);
		
		
		for (int i = 1; i < n; i = i * 2){
		    System.out.println("Hey - I'm busy looking at: " + i);
		}
	}

}
