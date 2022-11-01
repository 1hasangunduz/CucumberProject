package stepDefinition;


import PageObjectModel.ContactUsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.time.Duration;

public class ContactUs_Steps {

    private WebDriver driver;
    ContactUsPage contactUsPage= new ContactUsPage();
    @Given("navigate to Website")
    public void navigate_to_website() {
    driver= Driver.getDriver();
    driver.manage().window().maximize();
    driver.get("http://automationpractice.com/index.php");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    @Given("click on contact us button")
    public void click_on_contact_us_button() {

        contactUsPage.clickContactUsButton();

    }
    @Given("select Subject Heading")
    public void select_subject_heading() {

    }
    @Given("type Email")
    public void type_email() {

    }
    @Given("type a message")
    public void type_a_message() {

    }
    @When("click on send button")
    public void click_on_send_button() {

    }
    @Then("verify to success message")
    public void verify_to_success_message() {

    }

}
