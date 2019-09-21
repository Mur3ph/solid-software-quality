package test.java.ie.murph.performance.iterators;

public class LoopVersusStream {
	
//	https://dzone.com/articles/java-performance-for-looping-vs-streaming

	private static final int ITERATIONS = 10_000;
	
	public static void main(String[] args) {
		LoopVersusStream loopVersusStream = new LoopVersusStream();
		System.out.println(loopVersusStream.forUp());
	}

//	@Benchmark
	public int forUp() {
		int sum = 0;
		for (int i = 0; i < ITERATIONS; i++) {
			sum += i;
		}
		return sum;
	}

}
