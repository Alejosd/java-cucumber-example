package alejo.sd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/java/resources/features",
		plugin = {"pretty", "html:target/cucumber"}
		)
public class RunCukesTest {
}