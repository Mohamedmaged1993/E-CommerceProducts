package Utilities;

import org.openqa.selenium.By;

public class ObjectRepo {


    public static By InnerSizeSelection = By.xpath("//span[contains(text(), \"EUR35\")]");
    public static By AddToBagBTNLocator = By.xpath("//button[contains(text(),'Add To Bag')]");
    public static By NavigateToCheckoutBTN = By.xpath("//span[@class='cart-num she-v-cloak-none']");
    public static By ViewBagBTNLocator = By.linkText("view bag");



    //Identify Locators  for Products Page (Abercrombie Website)
    public static By SizeSelection = By.xpath("//span[contains(text(), \"M/L\")]");
    public static By AddToCartBTNLocator = By.xpath("//span[contains(text(),'Add To Bag')]/..");
    public static By ClickOnItems = By.xpath("//a[@class='rs-nav-icon rs-nav-icon--shopping-bag-alt rs-nav-icon--r hide-lg']/@href");
    public static By ClickOnCheckoutBTNLocator = By.xpath(".//a[contains(@href,'Checkout')]");



}
