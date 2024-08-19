package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;
import utils.TestBase;

import java.util.Set;

public class JSMethods extends TestBase {




 @Test
 public void getTitleWithJSMethod(){
     driver.get("https://www.abt.com/");

     JavascriptExecutor js= (JavascriptExecutor) driver;
     js.executeScript("window.open('https://www.abt.com/')");
     String actualTitle = js.executeScript("return document.title").toString();
     String expectedTitle="Abt: Appliances and Electronics Store | Refrigerators, Appliances, TVs";
     Assert.assertEquals(actualTitle,expectedTitle,"failed to validate the title");

 }



 @Test
    public void clickWithJS(){
     driver.get("https://codefish.io/");
     WebElement aboutUsBtn = driver.findElement(By.xpath("//button[.='About us']"));

     JavascriptExecutor js= (JavascriptExecutor) driver;
     js.executeScript("arguments[0].click",aboutUsBtn);
 }








 @Test
    public void scrollWithJS(){
     driver.get("https://codefish.io/");
     WebElement facebook = driver.findElement(By.cssSelector("a[href='https://www.facebook.com/codefish.camp']"));

JavascriptExecutor js= (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView(true)",facebook);


 }





 @Test
    public void getURLWithJS(){

     JavascriptExecutor js= (JavascriptExecutor) driver;

     js.executeScript("window.open('https://codefish.io/')");
     js.executeScript("window.open('https://www.google.com/')");
     js.executeScript("window.open('https://www.costco.com/')");


     Set<String> allWindows = driver.getWindowHandles();
     for (String id:allWindows){
         driver.switchTo().window(id);

         if (driver.getCurrentUrl().equals("https://www.google.com/")){
             break;
         }
     }
     System.out.println(driver.getTitle());

 }








 @Test
    public void scrollWithPointClass(){
     driver.get("https://the-internet.herokuapp.com/");
     WebElement elementalSelenium = driver.findElement(By.linkText("Elemental Selenium"));

     JavascriptExecutor js= (JavascriptExecutor) driver;
     Point point =elementalSelenium.getLocation();
     int x= point.getX();
     int y= point.getY();
     js.executeScript("window.scrollTo("+x+","+y+")");


 }



}
