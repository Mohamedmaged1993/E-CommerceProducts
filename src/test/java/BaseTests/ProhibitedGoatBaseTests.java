package BaseTests;

import PageObjects.GoatsSneakersPage;
import Utilities.ObjectRepo;
import Utilities.PropertiesConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProhibitedGoatBaseTests {


    WebDriver driver;
    WebDriverWait wait;
    GoatsSneakersPage goatsSneakersPage;
    PropertiesConfig propertiesConfig;
    int timeOut = 10;

    @BeforeClass
    public void beforeclass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, timeOut);
        goatsSneakersPage = new GoatsSneakersPage(driver);
        propertiesConfig = new PropertiesConfig();
        driver.get(propertiesConfig.getProperty("goatURL"));
    }

    @Test(priority = 1)
    public void AddProductToCart() {
        goatsSneakersPage.noThanksLocator();
        goatsSneakersPage.selectSneakers();

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}