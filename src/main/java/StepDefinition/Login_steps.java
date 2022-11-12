package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_steps {

    @Given("Go to Amazon website")
    public void go_to_amazon_website() throws Throwable {

        System.out.println("Amazon sitesine gidildi.");
    }

    @Given("entry name")
    public void entry_name() throws Throwable {
        System.out.println("Isim girildi.");
    }

    @Given("entry password")
    public void entry_password() throws Throwable {
        System.out.println("Sifre girildi.");

    }

    @When("while clicked submit button")
    public void while_clicked_submit_button() throws Throwable {
        System.out.println("Submit butonuna tiklandi.");

    }

    @Then("verify to succes message")
    public void verify_to_succes_message() throws Throwable {
        System.out.println("Login islemi basariyla tamamlandi.");

    }
}
