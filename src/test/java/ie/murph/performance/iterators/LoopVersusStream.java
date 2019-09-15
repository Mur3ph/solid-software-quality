package test.java.ie.murph.performance.iterators;

import org.openjdk.jmh.annotations.*;

public class LoopVersusStream {
	
//	https://dzone.com/articles/java-performance-for-looping-vs-streaming

	private static final int ITERATIONS = 10_000;

	@Benchmark
	public int forUp() {
		int sum = 0;
		for (int i = 0; i < ITERATIONS; i++) {
			sum += i;
		}
		return sum;
	}

}
