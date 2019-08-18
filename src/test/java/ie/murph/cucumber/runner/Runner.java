package test.java.ie.murph.cucumber.runner;

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="Features",glue={"classpath:com/runner", "classpath:com/stepdefinition"})						
public class Runner 				
{		

}
