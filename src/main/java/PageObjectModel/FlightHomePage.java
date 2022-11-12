package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FlightHomePage extends AbstractClass{

    WebDriver driver;

    public FlightHomePage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this); //Parameters , Test , FindBy gibi methodların anahtar kelimesi bu. Bu olmadan çalısmaz.
    }

    @FindBy(id = "OriginInput")
    private WebElement btnOriginInput;

    @FindBy(id = "DestinationInput")
    private WebElement btnDestinationInput;

    @FindBy(xpath = "(//div[@class='suggestion_item'])[1]")
    private WebElement chooseSuggestionCity;

    @FindBy(xpath = "//*[@data-testid='formSubmitButton']")
    private WebElement formSubmitButton;


    public void originBox(String originCity){
        sendKeys(btnOriginInput,originCity);
    }
    public void destinationBox(String destinationCity){
       sendKeys(btnDestinationInput,destinationCity);
    }
    public void selectCity() throws InterruptedException {
        Thread.sleep(2000);
        click(chooseSuggestionCity);
    }

    public void btnFindCheapTicket(){
        click(formSubmitButton);
    }
}
