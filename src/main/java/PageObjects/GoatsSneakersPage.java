package PageObjects;

import Utilities.ObjectRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoatsSneakersPage {
    WebDriver driver;
    WebDriverWait wait;

    public GoatsSneakersPage (WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);
    }

    public void noThanksLocator(){

        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.NoThanksCurrency));
        WebElement selectNoBTN = driver.findElement(ObjectRepo.NoThanksCurrency);
        selectNoBTN.click();
    }
    public void selectSneakers(){

        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.SneakersSelection));
        WebElement selectSneakersBTN = driver.findElement(ObjectRepo.SneakersSelection);
        selectSneakersBTN.click();
    }
}
