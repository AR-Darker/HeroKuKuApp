package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class DynamicControlsPage extends BasePage{

    String url = "https://the-internet.herokuapp.com/dynamic_controls";
    public static final By REMOVE_BUTTON = By.xpath("//button[@type='button' and text()='Remove']");
    public static final By ADD_BUTTON = By.xpath("//button[@type='button' and text()='Add']");
    public static final By ENABLE_BUTTON = By.xpath("//button[@autocomplete='off' and text()='Enable']");
    public static final By DISABLE_BUTTON = By.xpath("//button[text()='Disable']");
    public By inputDisabled = By.xpath("//input[@type='text' and @disabled]");
    public By inputEnable = By.xpath("//input[@type='text']");
    String messageItIsDisabled = "//p[@id='message']";
    String messageIsGone = "//p[@id='message']";
    String messageItIsEnabled = "//p[@id='message']";


    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }
    public void openPage(){
        driver.get(url);
    }

    public void clickRemoveButton(){
        driver.findElement(REMOVE_BUTTON).click();
    }

    public String waitingMessage(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(messageIsGone))).getText();
    }

    public boolean checkPresenceOfAddButtonOnPage(){
        boolean  isDisplayed = driver.findElement(ADD_BUTTON).isDisplayed();
        return isDisplayed;
    }

    public boolean checkPresenceOfEnableButtonOnPage(){
        boolean  isDisplayed = driver.findElement(ENABLE_BUTTON).isDisplayed();
        return isDisplayed;
    }

    public void findInputDisabled(){
        driver.findElement(inputDisabled);
    }

    public void findInputEnable(){
        driver.findElement(inputEnable);
    }

    public void clickEnableButton(){
        driver.findElement(ENABLE_BUTTON).click();
    }

    public void clickDisabledButton(){
        driver.findElement(DISABLE_BUTTON).click();
    }

    public String waitingForTextItIsEnabled(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(messageItIsEnabled))).getText();

    }

    public String waitingMessageItIsDisabled(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(messageItIsDisabled))).getText();
    }
    public boolean checkPresenceOfDisableButtonOnPage(){
        boolean  isDisplayed = driver.findElement(DISABLE_BUTTON).isDisplayed();
        return isDisplayed;
    }
    public void inputTextInFieldInput(){
        driver.findElement(inputEnable).sendKeys("Ввод работает");

    }



}