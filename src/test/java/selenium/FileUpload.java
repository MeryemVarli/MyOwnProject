package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestBase;

public class FileUpload extends TestBase {



   @Test
   public void uploadFile(){
       driver.get("https://the-internet.herokuapp.com/upload");
       driver.findElement(By.cssSelector("#file-upload")).sendKeys("/Users/meryemvarli/Desktop/B22-HTML/jeffrey.webp");
       driver.findElement(By.cssSelector("#file-submit")).click();
       WebElement uploded = driver.findElement(By.cssSelector("#uploaded-files"));
         String actual= uploded.getText();
         String aexpected="jeffrey.webp";

       Assert.assertEquals(actual,aexpected,"failed to validate the message");
   }






@Test
public void uploadAFilePrc(){
       driver.get("https://www.lambdatest.com/selenium-playground/");
       driver.findElement(By.linkText("Upload File Demo")).click();
        driver.findElement(By.cssSelector("#file")).sendKeys("/Users/meryemvarli/Desktop/B22-HTML/image.jpg");

    WebElement finalText = driver.findElement(By.cssSelector("#error"));
    String actual=finalText.getText();
    String expected="File Successfully Uploaded";
    Assert.assertEquals(actual,expected,"failed dto validate the message");


}
















}
