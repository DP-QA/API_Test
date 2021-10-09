package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = "src/test/resources/features", glue = "StepDefinition")

public class TestRunner extends AbstractTestNGCucumberTests {
 
}