package test.java.ie.murph.selenium.domain;

public enum EWebURLLink
{
	GECKO_WEB_DRIVER_PROPERTY("webdriver.gecko.driver"),
	GECKO_WEB_DRIVER_EXE_JAR_PATH("C:\\dev\\jars\\geckodriver.exe"),
	GURU99_TOURS_BASE_URL("http://demo.guru99.com/test/newtours/"),
	STACK_TRACE("Stack Trace Error: ");
	
	private final String text;

    private EWebURLLink(final String text) 
    {
        this.text = text;
    }

    @Override
    public String toString() 
    {
        return this.text;
}
}
