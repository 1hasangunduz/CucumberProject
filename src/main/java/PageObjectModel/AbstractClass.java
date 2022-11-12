package PageObjectModel;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public abstract class AbstractClass {

    private WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    public void navigateToUrl(String url){
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void click(WebElement clickElem) {
        wait.until(ExpectedConditions.elementToBeClickable(clickElem)).click();
    }

    public void sendKeys(WebElement webElement, String value) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.sendKeys(value);
    }

    public void selectComboBox(WebElement dropDown, String element) {
        Select select = new Select(dropDown);
        select.selectByVisibleText(element);
    }

    public void selectElementFromDropdown(WebElement dropdown, String element) {
        Select slc = new Select(dropdown);
        slc.selectByVisibleText(element);
    }

    public void assertion(WebElement actual, String expected) {
        wait.until(ExpectedConditions.visibilityOf(actual));
      if(actual.getText() == expected)  System.out.println("My message : " + actual.getText());
      else   System.out.println("There is not matched.  " + actual.getText());
    }


}
