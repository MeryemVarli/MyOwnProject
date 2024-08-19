package com.qa_fox.scripts;

import com.qa_fox.pages.MainPage;
import com.qa_fox.pages.RegisterPage;
import org.testng.annotations.Test;
import utils.ConfigReader;
import utils.TestBase;

public class Qa_Fox_Script extends TestBase {




@Test(dataProvider = "dataTest",dataProviderClass = DataProviderLocation.class)
    public void validateCreateAccount(String name,String lastname,String email,String phone,String password){
    driver.get(ConfigReader.readProperties("qa_fox"));

    MainPage mainPage= new MainPage(driver);
    mainPage.goToRegister(driver);

    RegisterPage registerPage=new RegisterPage(driver);
    registerPage.createAccount(name, lastname, email, phone, password);

}


@Test
    public void navigateToGoogle(){
    driver.get("https://www.google.com/");
}



}
