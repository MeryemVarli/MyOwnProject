package com.qa_fox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class MainPage {

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


 @FindBy(xpath = "//li[@class='dropdown']//a[@title='My Account']")
    WebElement myAccountBtn;


@FindBy(xpath = "//a[.='Register']")
    WebElement register;


public void goToRegister(WebDriver driver){
    BrowserUtils.click(this.myAccountBtn,driver);
    BrowserUtils.click(this.register,driver);



}

















}
