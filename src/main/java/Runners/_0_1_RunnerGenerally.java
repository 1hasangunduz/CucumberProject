package Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(

        features = {"src/test/java"},
        glue = {"StepDefinition"},
        dryRun = false
)

    public class _0_1_RunnerGenerally extends AbstractTestNGCucumberTests {
}