package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.TestBase;

public class JSAlert extends TestBase {


   @Test
   public void popUpHandle(){
   driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       WebElement JSAlert = driver.findElement(By.xpath("//button[contains(.,'JS Alert')]"));
  JSAlert.click();

       Alert alert=driver.switchTo().alert();
       System.out.println(alert.getText().trim());
       alert.accept();


       //find JS Confirm and click
   driver.findElement(By.xpath("//button[contains(.,'JS Confirm')]")).click();
       System.out.println("alert text " +alert.getText().trim());
       alert.accept();

       driver.findElement(By.xpath("//button[contains(.,'JS Prompt')]")).click();
       System.out.println(alert.getText().trim());
       alert.sendKeys("send text to alert");
       alert.accept();


   }








 @Test
 public void normalAlertHandle(){
   driver.get("https://sweetalert.js.org/");
   driver.findElement(By.xpath("//h5[contains(.,' Normal alert')]//following-sibling::button")).click();

   Alert alert=driver.switchTo().alert();
     System.out.println(alert.getText().trim());
     alert.accept();


     driver.findElement(By.xpath("//h5[contains(.,'SweetAlert')]//following-sibling::button")).click();
     WebElement okBtn = driver.findElement(By.cssSelector("button[class='swal-button swal-button--confirm']"));
   okBtn.click();
     System.out.println(okBtn.getText());
 }









}
