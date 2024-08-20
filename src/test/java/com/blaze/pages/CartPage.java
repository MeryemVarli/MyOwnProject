package com.blaze.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class CartPage {


    WebDriver driver;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }



 @FindBy(xpath = "//button[.='Place Order']")
    WebElement placeOrderBtn;



@FindBy(css = "#name")
    WebElement name;


@FindBy(css = "#country")
    WebElement country;

@FindBy(css = "#city")
    WebElement city;

@FindBy(css = "#card")
    WebElement card;

@FindBy(css = "#month")
    WebElement month;

@FindBy(css = "#year")
    WebElement year;

@FindBy(xpath = "//button[.='Purchase']")
    WebElement purchaseBtn;


public void purchase(String name,String country,String city,String card,String month,String year){

    BrowserUtils.click(this.placeOrderBtn,driver);
    BrowserUtils.sendKeys(this.name,name);
    BrowserUtils.sendKeys(this.country,country);
    BrowserUtils.sendKeys(this.city,city);
    BrowserUtils.sendKeys(this.card,card);
    BrowserUtils.sendKeys(this.month,month);
    BrowserUtils.sendKeys(this.year,year);
    BrowserUtils.click(this.purchaseBtn,driver);
}

















}
