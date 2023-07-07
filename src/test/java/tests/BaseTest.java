package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ContextMenuPage;
import pages.DynamicControlsPage;
import pages.FileUploadPage;
import pages.FramesPage;


import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    ContextMenuPage contextMenuPage;
    DynamicControlsPage dynamicControlsPage;
    FileUploadPage fileUploadPage;
    FramesPage framesPage;


    @BeforeMethod

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//todo не забудь иницализировать страницы
        contextMenuPage = new ContextMenuPage(driver);
        dynamicControlsPage = new DynamicControlsPage(driver);
        fileUploadPage = new FileUploadPage(driver);
        framesPage = new FramesPage(driver);


    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        driver.quit();
    }
}