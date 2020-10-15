package PageObjects;


import Utilities.ObjectRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbercrombieProductPage {
    WebDriver driver;
    WebDriverWait wait;


    public AbercrombieProductPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);
    }

    public void selectProductSize() {

        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.SizeSelection));
        WebElement selectProduct = driver.findElement(ObjectRepo.SizeSelection);
        selectProduct.click();
    }

    public void clickAddToBagBTN() {
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.AddToCartBTNLocator));
        WebElement addToBagLocatorBTN = driver.findElement(ObjectRepo.AddToCartBTNLocator);
        addToBagLocatorBTN.click();
    }

    public void naviagteToCheckout() {

        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.ClickOnItems));
        WebElement checkoutNavigation = driver.findElement(ObjectRepo.ClickOnItems);
        checkoutNavigation.click();
    }

    public void clickOnCheckoutBTNLocator() {

        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.ClickOnCheckoutBTNLocator));
        WebElement checkoutBTNLocator = driver.findElement(ObjectRepo.ClickOnCheckoutBTNLocator);
        checkoutBTNLocator.click();
    }

}
