package test.java.ie.murph.performance;

import test.java.ie.murph.performance.strings.StringConcatenationTest;

public class RunPerformanceTest
{
	public static void main(String[] arguments)
	{
		StringConcatenationTest.stringPerformanceTest();
		StringConcatenationTest.stringBuilderPerformanceTest();
		StringConcatenationTest.stringBufferPerformanceTest();
	}
}
