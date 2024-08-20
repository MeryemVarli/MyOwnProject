package com.blaze.scripts;

import com.blaze.pages.CartPage;
import com.blaze.pages.MainPage;
import com.blaze.pages.ProductPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.ConfigReader;
import utils.TestBase;

public class BlazeTest extends TestBase {



@Parameters({"name","country","city","card","month","year"})







@Test
    public void validatePurchaseExperience(String name,String country,String city,String card,String month,String year){
 driver.get(ConfigReader.readProperties("blazeurl"));
    MainPage mainPage=new MainPage(driver);
    mainPage.clickOnPhone();

    ProductPage productPage =new ProductPage(driver);
    productPage.addingProductToCart(driver);

    CartPage cartPage =new CartPage(driver);
    cartPage.purchase(name, country, city, card, month, year);

}












}
