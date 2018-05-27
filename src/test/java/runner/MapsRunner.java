package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/sreejon/eclipse-workspace/Cucumber_Framework1/features4/DataMaps.feature",
        glue= {"stepDefination4"},
        monochrome= true,
        dryRun= false)
public class MapsRunner {

}
