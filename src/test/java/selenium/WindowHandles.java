package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.TestBase;

import java.util.Set;

public class WindowHandles extends TestBase {


 @Test
 public void switchWindowHandle(){
     driver.get("https://the-internet.herokuapp.com/windows");
  driver.findElement(By.cssSelector("a[href='/windows/new']")).click(); //new window pops up!

     String currentWindow = driver.getWindowHandle();
     Set<String> allWindowsID = driver.getWindowHandles();
     System.out.println(allWindowsID);

     for (String id:allWindowsID){

         if (!id.equals(currentWindow)){
             driver.switchTo().window(id);
             break;
         }
     }

     WebElement newWindowTest= driver.findElement(By.xpath("//h3"));
     System.out.println(newWindowTest.getText());


 }







 @Test
    public void task() throws InterruptedException {
     driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
     //clicks on button2
     Thread.sleep(2000);
    driver.findElement(By.cssSelector("button[id='newTabBtn']")).click();
     String currentID = driver.getWindowHandle();
     Set<String> allWindowsID = driver.getWindowHandles();

     for (String id:allWindowsID){

         if (!currentID.equals(id)){
             driver.switchTo().window(id);
         }

     }

     //clicks on alert box/click me
     driver.findElement(By.cssSelector("#alertBox")).click();
     Alert alert=driver.switchTo().alert();
     System.out.println(alert.getText());
     alert.accept();

     //clicks on another alert box
     driver.findElement(By.cssSelector("#promptBox")).click();
     alert.sendKeys("alert alert test");
     alert.accept();

     //clicks on another alert box
     driver.findElement(By.cssSelector("#confirmBox")).click();
     System.out.println(alert.getText());
     alert.dismiss();


     driver.switchTo().window(currentID);
     Thread.sleep(3000);
     driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click(); //clicks on button1





 }








 @Test
    public void multipleWindows() throws InterruptedException {
     driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");

//click on twitter
     driver.findElement(By.xpath("//a[contains(.,'Twitter')]")).click();
     Thread.sleep(2000);
 //click on facebook
     driver.findElement(By.xpath("//a[contains(.,'Facebook')]")).click();
     Thread.sleep(2000);
 //click on linkedin
     driver.findElement(By.xpath("//a[contains(.,'Linkedin')]")).click();


     String currentID = driver.getWindowHandle();
     String facebookTitle="LambdaTest | San Francisco CA | Facebook";

     Set<String> allWindows = driver.getWindowHandles();
String linkLinkedIn="https://www.linkedin.com/company/lambdatest/";

     for (String window:allWindows){ //you can do with title and url to switch the window you want to deal with

         driver.switchTo().window(window);
       //  String title = driver.getTitle();

        // if (title.equals(facebookTitle)){
         //    break;
       //  }

         String currentUrl = driver.getCurrentUrl();

         if (linkLinkedIn.equals(currentUrl)){
             break;
         }



     }

     System.out.println(driver.getTitle()+" is your current window title");


 }























}
