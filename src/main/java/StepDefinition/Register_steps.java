package StepDefinition;

import PageObjectModel.FlightHomePage;
import PageObjectModel.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_steps {
    FlightHomePage flightHomePage =new FlightHomePage();
    RegisterPage registerPage = new RegisterPage();
    @Given("Navigate to Website")
    public void navigateToWebsite() throws Throwable {
    flightHomePage.navigateToUrl("https://www.enuygun.com/ucak-bileti/");
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

    @After
    public void quitDriver() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Then("verify to success for register {string}")
    public void verifyToSuccessForRegister(String VerifyName) throws Throwable  {
        registerPage.controlLandAccount(VerifyName);
    }
}
