package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/sreejon/eclipse-workspace/Cucumber_Framework1/features3/DataTable.feature",
        glue= {"stepDefination3"})

public class DataTableTest {

}
