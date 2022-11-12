package Runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.AfterClass;
@CucumberOptions(
        plugin =
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html",
        features = {"src/test/java"},
        glue = {"StepDefinition"},
        dryRun = false,
        tags = {"@SmokeTests"}
)
public class _0_3_SmokeTests extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void afterClass(){
        Reporter.loadXMLConfig("src/main/java/XMLFiles/extendReportSet.xml");

        Reporter.setSystemInfo("QA Automation Tester : ", "Hasan Gunduz");
        Reporter.setSystemInfo("Application name : ", "Your Store Test  ");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA Automation");
        Reporter.setTestRunnerOutput("Test execution Cucumber Report");
    }
}