package Runner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.*;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepDefinition"},
        tags = {"~@Ignore"},
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        },plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class TestRunner {


 private TestNGCucumberRunner testNGCucumberRunner;
 @BeforeClass(alwaysRun = true)
 public void setUpCucumber() {
  testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
 }
 @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
  public void feature(CucumberFeatureWrapper cucumberFeature) {
   testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
  }

  @DataProvider
  public Object[][] features() {
   return testNGCucumberRunner.provideFeatures();
  }

  @AfterClass(alwaysRun = true)
  public void tearDownClass() throws Exception {
   testNGCucumberRunner.finish();
  }}