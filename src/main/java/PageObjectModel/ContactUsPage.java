package PageObjectModel;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage extends AbstractClass{

    WebDriver driver;

    public ContactUsPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this); //Parameters , Test , FindBy gibi methodların anahtar kelimesi bu. Bu olmadan çalısmaz.
    }

    @FindBy(xpath = "//a[@title='Contact Us']")
    private WebElement contactUsButton;


    public void clickContactUsButton(){
        click(contactUsButton);
    }
}
