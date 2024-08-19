package com.sauce_labs.tests;

import com.sauce_labs.pages.CheckoutPage;
import com.sauce_labs.pages.LoginPage;
import com.sauce_labs.pages.ProductPage;
import org.testng.annotations.Test;
import utils.TestBase;

public class Sauce_labsTest extends TestBase {

@Test
    public void purchase(){
    driver.get("https://www.saucedemo.com/");
    LoginPage loginPage=new LoginPage(driver);
    loginPage.login(driver,"standard_user","secret_sauce");

    ProductPage productPage=new ProductPage(driver);
    productPage.addBag(driver);

    CheckoutPage checkoutPage=new CheckoutPage(driver);
    checkoutPage.checkOut(driver,"meryem","varli",19145);






}

















}
