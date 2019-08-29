package test.java.ie.murph.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"})
public class UserTest {
//	https://examples.javacodegeeks.com/core-java/junit/junit-cucumber-example/
}
