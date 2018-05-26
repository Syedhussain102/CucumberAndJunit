package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/sreejon/eclipse-workspace/Cucumber_Framework1/features/facebookLogin.feature", // the path of the feature files 
        glue= {"stepDefination"},// the path of the step defination files 
        plugin= {"html:target/cucumber-html-reprt"}
        //monochrome = true // display the console output in a proper readable format ( new cucumber youdont need mono chrome it comes with monochrome so no need to add it i belive)
        //dryRun= true // display the scenario and tests compearing next to each other 
        //strict = true //if any of the step is missing will throw error
	
		)
      
public class FacebookRunner {
}
