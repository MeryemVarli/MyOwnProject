package com.qa_fox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class RegisterPage {

  private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }



  @FindBy(css = "#input-firstname")
    WebElement firstname;


 @FindBy(css = "#input-lastname")
    WebElement lastname;


 @FindBy(css = "#input-email")
    WebElement email;

 @FindBy(css = "#input-telephone")
    WebElement phone;


 @FindBy(css = "#input-password")
    WebElement password;

 @FindBy(css = "#input-confirm")
    WebElement passwordConfirm;


@FindBy(xpath = "//label[@class='radio-inline']//input[@value='1']")
    WebElement yesBtn;

@FindBy(xpath = "//input[@name='agree']")
    WebElement agreeBtn;

@FindBy(xpath = "//input[@type='submit']")
    WebElement submitBtn;



public void createAccount(String firstname,String lastname,String email,String phone,String password){
    BrowserUtils.sendKeys(this.firstname,firstname);
    BrowserUtils.sendKeys(this.lastname,lastname);
    BrowserUtils.sendKeys(this.email,email);
    BrowserUtils.sendKeys(this.phone,phone);
    BrowserUtils.sendKeys(this.password,password);
    BrowserUtils.sendKeys(this.password,password);

    BrowserUtils.click(this.yesBtn,driver);
    BrowserUtils.click(this.agreeBtn,driver);
    BrowserUtils.click(this.submitBtn,driver);



}







}
