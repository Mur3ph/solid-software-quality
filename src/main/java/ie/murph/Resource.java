package main.java.ie.murph;

public enum Resource
{
	PRIME_NUMBER_RESOURCE("http://www.baeldung.com/java-generate-prime-numbers");

	private final String text;

	private Resource(final String text)
	{
		this.text = text;
	}

	@Override
	public String toString()
	{
		return this.text;
	}

}
