package StepDefinition;

import PageObjectModel.FlightHomePage;
import PageObjectModel.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.time.Duration;

public class Register_steps {
    FlightHomePage flightHomePage =new FlightHomePage();
    RegisterPage registerPage = new RegisterPage();
    private WebDriver driver;
    @Given("Navigate to Website")
    public void navigateToWebsite() throws Throwable {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.enuygun.com/ucak-bileti/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @And("click register button")
    public void clickRegisterButton() throws Throwable {
        registerPage.clickOnRegisterButton();

    }

    @And("type email {string}")
    public void typeEmail(String eMail) throws Throwable {

        registerPage.typeEmail(eMail);
    }

    @And("type password {string}")
    public void typePassword(String password) throws Throwable  {
        registerPage.typePassword(password);
    }

    @When("click on create an Account button")
    public void clickOnCreateAnAccountButton() throws Throwable  {
        registerPage.btnRegisterAcc();

    }

    @Then("verify to success for register {string}")
    public void verifyToSuccessForRegister(String VerifyName) throws Throwable {
        registerPage.controlLandAccount(VerifyName);
    }
}
