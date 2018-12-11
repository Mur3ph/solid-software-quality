package test.java.ie.murph.unit.basic.math;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.ie.murph.basic.math.Add;

public class AddTest
{

	private Add add;
	
	@Before
	public void setUp() throws Exception
	{
		add = new Add();
	}

	@Test
	public void testAdd()
	{
		int testResult = 2 + 2;
		assertEquals(testResult, add.integer(2, 2));
	}

}
