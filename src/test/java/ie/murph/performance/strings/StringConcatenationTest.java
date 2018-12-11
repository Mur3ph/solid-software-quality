package test.java.ie.murph.performance.strings;

import java.text.MessageFormat;

public class StringConcatenationTest
{
	public static void stringPerformanceTest()
	{
		String str = "";
		long startTime = System.nanoTime();
		for(int i = 0; i < 10; i++)
		{
			str = str+i;
		}
		long endTime = System.nanoTime();
		System.out.println(MessageFormat.format("String cancatenation with plus(+) operator took {0} nano seconds", (endTime - startTime)));
	}
	
	public static void stringBuilderPerformanceTest()
	{
		StringBuilder stringBuilder = new StringBuilder();
		long startTime = System.nanoTime();
		for(int i = 0; i < 10; i++)
		{
			stringBuilder.append(i);
		}
		long endTime = System.nanoTime();
		System.out.println(MessageFormat.format("String cancatenation with StringBuilder() operator took {0} nano seconds", (endTime - startTime)));
	}
	
	public static void stringBufferPerformanceTest()
	{
		StringBuffer stringBuilder = new StringBuffer();
		long startTime = System.nanoTime();
		for(int i = 0; i < 10; i++)
		{
			stringBuilder.append(i);
		}
		long endTime = System.nanoTime();
		System.out.println(MessageFormat.format("String cancatenation with StringBuffer() operator took {0} nano seconds", (endTime - startTime)));
	}
}
