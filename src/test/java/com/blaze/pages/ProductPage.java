package com.blaze.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class ProductPage {

    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }



@FindBy(xpath = "//a[.='HTC One M9']")
    WebElement htcPhone;


@FindBy(xpath = "//a[.='Add to cart']")
    WebElement addCartBtn;

@FindBy(xpath = "//a[.='Cart']")
WebElement cartBtn;



public void addingProductToCart(WebDriver driver){
    BrowserUtils.click(this.htcPhone,driver);
    BrowserUtils.click(this.addCartBtn,driver);
    BrowserUtils.getTextFromAlert(driver);
    BrowserUtils.acceptAlert(driver);

    BrowserUtils.click(this.cartBtn,driver);

}










}
