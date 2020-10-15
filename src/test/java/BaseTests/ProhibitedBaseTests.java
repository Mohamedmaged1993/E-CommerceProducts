package BaseTests;

import PageObjects.AbercrombieProductPage;
import PageObjects.SheinCartPage;
import PageObjects.SheinProductPage;
import Utilities.ObjectRepo;
import Utilities.PropertiesConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProhibitedBaseTests {
    WebDriver driver;
    WebDriverWait wait;
    SheinProductPage sheinProductPage;
    SheinCartPage sheinCartPage;
    AbercrombieProductPage abercrombieProductPage;
    PropertiesConfig propertiesConfig;
    int timeOut = 10;

    @BeforeClass
    public void beforeclass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, timeOut);
        sheinProductPage = new SheinProductPage(driver);
        sheinCartPage = new SheinCartPage(driver);
        abercrombieProductPage = new AbercrombieProductPage(driver);
        propertiesConfig = new PropertiesConfig();
        driver.get(propertiesConfig.getProperty("aberUrl"));
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.SizeSelection));
    }

    @Test(priority = 1)
    public void AddProduct() {
        abercrombieProductPage.selectProductSize();
        abercrombieProductPage.clickAddToBagBTN();
        abercrombieProductPage.naviagteToCheckout();
        abercrombieProductPage.clickOnCheckoutBTNLocator();
    }
    @BeforeClass
    public void afterClass() {
        driver.quit();
    }



}
