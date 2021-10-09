package Runner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.*;


@CucumberOptions(
        features = "classpath:features",
        glue = {"StepDefinition"},
        plugin = {"pretty"})
//        tags = {"~@Ignore"},
//        format = {
//                "pretty",
//                "html:target/cucumber-reports/cucumber-pretty",
//                "json:target/cucumber-reports/CucumberTestReport.json",
//                "rerun:target/cucumber-reports/rerun.txt"
//        })

public class TestRunner extends AbstractTestNGCucumberTests {


// private TestNGCucumberRunner testNGCucumberRunner;
// @BeforeClass(alwaysRun = true)
// public void setUpCucumber() {
//  testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
// }
//
// @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
//  public void feature(CucumberFeatureWrapper cucumberFeature) {
//   testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//  }
//
//  @DataProvider(name="features")
//  public Object[][] features() {
//  if(testNGCucumberRunner == null){
//   testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//  }
//   return testNGCucumberRunner.provideFeatures();
//  }
//
//  @AfterClass(alwaysRun = true)
//  public void tearDownClass() throws Exception {
//   testNGCucumberRunner.finish();
//  }}}
}