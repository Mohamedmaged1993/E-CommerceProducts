package Utilities;

import org.openqa.selenium.By;

public class ObjectRepo {

    //shein
    public static By InnerSizeSelection = By.xpath("//span[contains(text(), \"EUR35\")]");
    public static By AddToBagBTNLocator = By.xpath("//button[contains(text(),'Add To Bag')]");
    public static By NavigateToCheckoutBTN = By.xpath("//i[contains(@class, 'iconfont-critical icon-gouwudai')]");
    public static By SecurityCheckOutBTNLocator = By.xpath("//button[contains(@class, 'she-btn-black she-btn-xl j-cart-check')]");
    public static By emailField = By.name("email");
    public static By passwordField = By.name("password");
    public static By confirmPasswordField = By.name("confirmpassword");
    public static By RegistrationBTNLocator = By.xpath("//button[contains(text(),'Register')]");


    //Identify Locators  for Products Page (Abercrombie Website)
    public static By SizeSelection = By.xpath("//span[contains(text(), \"M/L\")]");
    public static By AddToCartBTNLocator = By.xpath("//span[contains(text(),'Add To Bag')]/..");
    public static By ClickOnItems = By.xpath("//a[@class='rs-nav-icon rs-nav-icon--shopping-bag-alt rs-nav-icon--r hide-lg']/@href");
    public static By ClickOnCheckoutBTNLocator = By.xpath(".//a[contains(@href,'Checkout')]");


    public static By NoThanksCurrency = By.xpath("//span[contains(text(), \"No Thanks\")]");
    public static By SneakersSelection = By.xpath("//BUTTON[@data-qa='sneakers-toggle'][text()='Sneakers']/../..//IMG[@src='https://image.goat.com/750/attachments/product_template_pictures/images/041/243/756/original/631937_00.png.png']");


}
