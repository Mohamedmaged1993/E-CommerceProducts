package PageObjects;

import Utilities.ObjectRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SheinProductPage {


    WebDriver driver;
    WebDriverWait wait;


    public SheinProductPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);
    }

    //access to SelectSizeLocator

    public void selectSizeLocator() {
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.InnerSizeSelection));
        WebElement selectSize = driver.findElement(ObjectRepo.InnerSizeSelection);
        selectSize.click();
    }
    //access to AddToBagBTNLocator

    public void addToBag() {
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.AddToBagBTNLocator));
        WebElement addTOBagClick = driver.findElement(ObjectRepo.AddToBagBTNLocator);
        addTOBagClick.click();
    }

    //access to clickOnCartItemsBTNLocator

    public void clickOnCartItemsIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.NavigateToCheckoutBTN));
        WebElement cartItemsIcon = driver.findElement(ObjectRepo.NavigateToCheckoutBTN);
        cartItemsIcon.click();
    }

    //access to ViewBagBTNLocator

    public void viewBagLocator() {
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.ViewBagBTNLocator));
        WebElement viewBag = driver.findElement(ObjectRepo.ViewBagBTNLocator);
        viewBag.click();
    }

}
