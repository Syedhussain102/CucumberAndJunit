package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(
		features="features",
        glue= {"stepDefination"},
        plugin= {"html:target/cucumber-html-reprt"})
public class FacebookRunner {
}
