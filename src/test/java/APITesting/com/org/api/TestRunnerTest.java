package APITesting.com.org.api;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/cucumberFeatureFiles",
		monochrome = true,
		plugin = {"pretty", "html:target/TestReport"}
		)

public class TestRunnerTest {

}
