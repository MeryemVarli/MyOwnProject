package selenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestBase;

public class DataProvider extends TestBase {



@Test(dataProvider = "testData",dataProviderClass = DataProviderLocation.class)
    public void dataProviderExample(String name,String title){
    System.out.println(name+" is "+title);

}



@Test(dataProvider = "testData2",dataProviderClass = DataProviderLocation.class)
    public void dataProviderExample2(String email,String password,String expectedMessage){
    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
    driver.findElement(By.cssSelector("input-email")).sendKeys(email);
    driver.findElement(By.cssSelector("#input-password")).sendKeys(password);
    driver.findElement(By.cssSelector("input[value='Login']")).click();

    String actualMessage=driver.findElement(By.xpath("//div[.='Warning: No match for E-Mail Address and/or Password.']")).getText();

    Assert.assertEquals(actualMessage,expectedMessage,"failed to validate the message");
}




















}
