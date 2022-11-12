package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage extends AbstractClass {
    private WebDriver driver;
    public RegisterPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[contains(@class,'nav-link katalon__navbar--register')]")
    private WebElement btnRegister;

    @FindBy(xpath = "//*[contains(@class,'katalon__modal-email')]")
    private WebElement txtEmail;

    @FindBy(xpath = "(//*[contains(@class,'katalon__modal-password')])[1]")
    private WebElement txtPassword;

    @FindBy(xpath = "//*[contains(@class,'katalon__modal-register-button')]")
    private WebElement btnRegisterAccount;

    @FindBy(xpath = "//span[contains(@class,'NavbarUsername')]")
    private WebElement txtRegisterControl;


    public void clickOnRegisterButton(){
        click(btnRegister);
    }

    public void typeEmail(String eMail){
        sendKeys(txtEmail,eMail);
    }
    public void typePassword(String password){
        sendKeys(txtEmail,password);
    }

    public void btnRegisterAcc(){
        click(btnRegisterAccount);
    }

    public void controlLandAccount(String VerifyName){
        assertion(txtRegisterControl,VerifyName);
    }

}
