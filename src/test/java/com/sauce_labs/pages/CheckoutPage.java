package com.sauce_labs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import javax.management.StringValueExp;

public class CheckoutPage {


 public CheckoutPage(WebDriver driver){
     PageFactory.initElements(driver,this);
 }


@FindBy(css = "#checkout")
    WebElement checkoutBtn;


 @FindBy(css = "#first-name")
    WebElement firstname;

 @FindBy(css = "#last-name")
    WebElement lastname;


@FindBy(css = "#postal-code")
    WebElement zipcode;


@FindBy(css = "#continue")
    WebElement continueBtn;


@FindBy(css = "#finish")
    WebElement finisBtn;


public void checkOut(WebDriver driver,String firstname,String lastname,int zipcode){

    BrowserUtils.click(this.checkoutBtn,driver);
    BrowserUtils.sendKeys(this.firstname,firstname);
    BrowserUtils.sendKeys(this.lastname,lastname);
    BrowserUtils.sendKeys(this.zipcode,String.valueOf(zipcode) );
    BrowserUtils.click(this.continueBtn,driver);
    BrowserUtils.click(this.finisBtn,driver);
}







}
