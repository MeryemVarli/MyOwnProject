package com.sauce_labs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class ProductPage {


    public ProductPage(WebDriver driver){
        // Initialize web elements using PageFactory
        PageFactory.initElements(driver,this);
    }



 @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    WebElement addToCartBtn;



@FindBy(css = "a[class='shopping_cart_link']")
    WebElement cartBtn;


public void addBag(WebDriver driver){
    BrowserUtils.click(this.addToCartBtn,driver);
    BrowserUtils.click(this.cartBtn,driver);
}




}
