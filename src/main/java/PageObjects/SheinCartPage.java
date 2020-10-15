package PageObjects;

import Utilities.ObjectRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Utilities.ObjectRepo.*;
import static Utilities.ObjectRepo.confirmPasswordField;

public class SheinCartPage {
    WebDriver driver;
    WebDriverWait wait;

    public SheinCartPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);
    }
    public void securlyCheckout() {
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.SecurityCheckOutBTNLocator));
        WebElement checkoutBTN = driver.findElement(ObjectRepo.SecurityCheckOutBTNLocator);
        checkoutBTN.click();
    }
    public void fillSignUpDataAndSubmit( String mail_Address, String pass, String confirmPass) {

        driver.findElement(emailField).sendKeys(mail_Address);
        driver.findElement(passwordField).sendKeys(pass);
        driver.findElement(confirmPasswordField).sendKeys(confirmPass);
    }

}
