package com.sauce_labs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class LoginPage {


  public LoginPage(WebDriver driver){
      PageFactory.initElements(driver,this);

  }

@FindBy(css = "#user-name")
    WebElement username;


@FindBy(css = "#password")
    WebElement password;

@FindBy(css = "#login-button")
    WebElement loginBtn;


public void login(WebDriver driver,String username,String password){
    BrowserUtils.sendKeys(this.username,username);
    BrowserUtils.sendKeys(this.password,password);
    BrowserUtils.click(loginBtn,driver);

}





}
