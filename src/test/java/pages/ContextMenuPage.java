package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage {
    WebElement hot_spot = driver.findElement(By.id("hot-spot"));
//
//    public ContextMenuPage(WebDriver driver) {
//        super(driver);
//    }

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public void rightClickToHotSpot() {
        Actions actions = new Actions(driver);
        actions.moveToElement(hot_spot).contextClick().build().perform();
    }

    public void contextOpen() {
        driver.get("http://the-internet.herokuapp.com/context_menu");
    }

}
