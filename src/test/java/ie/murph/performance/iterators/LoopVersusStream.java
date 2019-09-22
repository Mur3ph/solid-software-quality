package test.java.ie.murph.performance.iterators;

import java.util.stream.IntStream;

import org.openjdk.jmh.annotations.Benchmark;

public class LoopVersusStream {

	// https://dzone.com/articles/java-performance-for-looping-vs-streaming
	// https://www.baeldung.com/java-microbenchmark-harness

	private static final int ITERATIONS = 10_000;

//	public static void main(String[] args) {
//		LoopVersusStream loopVersusStream = new LoopVersusStream();
//		System.out.println(loopVersusStream.forUp());
//	}

	@Benchmark
	public int forUp() {
		int sum = 0;
		for (int i = 0; i < ITERATIONS; i++) {
			sum += i;
		}
		return sum;
	}

	@Benchmark
	public int forDown() {
		int sum = 0;
		for (int i = ITERATIONS; i-- > 0;) {
			sum += i;
		}
		return sum;
	}
	
	@Benchmark
	public int stream() {
	    return IntStream.range(0, ITERATIONS)
	        .sum();
	}
	
	@Benchmark
	public int math() {
	    return ITERATIONS * (ITERATIONS + 1) / 2;
	}
	
	

}
