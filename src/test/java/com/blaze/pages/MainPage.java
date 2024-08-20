package com.blaze.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class MainPage {

    WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


@FindBy(xpath = "//a[.='Phones']")
    WebElement phoneBtn;



public void clickOnPhone(){
    BrowserUtils.click(this.phoneBtn,driver);

}













}
