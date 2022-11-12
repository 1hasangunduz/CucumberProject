package StepDefinition;


import PageObjectModel.FlightHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.time.Duration;

public class SelectRoute_Steps {

    private WebDriver driver;
    FlightHomePage lib = new FlightHomePage();

    @Given("navigate to Website")
    public void navigate_to_website() throws Throwable {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.enuygun.com/ucak-bileti/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }


    @Given("click on origin text box")
    public void click_on_origin_text_box() throws Throwable {

        lib.originBox("istanbul");

    }

    @Given("select origin city")
    public void select_origin_city() throws Throwable {
        lib.selectCity();
    }

    @Given("click on destination text box")
    public void click_on_destination_text_box() throws Throwable {
        lib.destinationBox("Ankara");
    }

    @Given("select destination city")
    public void select_destination_city() throws Throwable {
        lib.selectCity();
    }

    @When("click find cheapest ticket button")
    public void click_find_cheapest_ticket_button() throws Throwable {
        lib.btnFindCheapTicket();

    }

    @Then("verify to success message")
    public void verify_to_success_message() throws Throwable {
        lib.controlBookPage();

    }


}
