package test.java.ie.murph.performance.random;

public class RandomTest {

	public static void main(String args[]) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++) {
			Math.random();
		}
		System.out.println("Math.random() Time: " + (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		int simpleMathFunctionPerformanceTest = 0;
		for (long i = 0; i < 8000000000L; i++) {
			// perform random math functions to use CPU
			simpleMathFunctionPerformanceTest = 4 * 67 + 87 / 45 * 2345;
		}
		System.out.println("Simple Math Time: " + (System.currentTimeMillis() - start) + "ms. Answer: " + simpleMathFunctionPerformanceTest);
	}

}
