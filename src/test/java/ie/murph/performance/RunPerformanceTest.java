package test.java.ie.murph.performance;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import test.java.ie.murph.performance.strings.StringConcatenationTest;

public class RunPerformanceTest
{
	private static final Logger LOGGER = LogManager.getLogger(RunPerformanceTest.class.getName());
	public static void main(String[] arguments)
	{
		LOGGER.info("++main()");
		StringConcatenationTest.stringPerformanceTest();
		StringConcatenationTest.stringBuilderPerformanceTest();
		StringConcatenationTest.stringBufferPerformanceTest();
	}
}
