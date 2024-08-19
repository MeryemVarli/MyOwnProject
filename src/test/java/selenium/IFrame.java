package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.TestBase;

import java.util.Set;

public class IFrame extends TestBase {


   @Test
   public void showCase(){
       driver.get("https://www.lambdatest.com/selenium-playground/iframe-demo/");
//switching driver to iframe bc my element is in iframe
     //  driver.switchTo().frame("iFrame1"); //switched with ID and you can also use name

  //or locate the the iframe and use webElement to switch
       WebElement iframe = driver.findElement(By.cssSelector("#iFrame1"));
driver.switchTo().frame(iframe);

       WebElement iframeEditor = driver.findElement(By.cssSelector("div[class='rsw-ce']"));
iframeEditor.clear();
iframeEditor.sendKeys("whatsup!");

   }





 @Test
 public void nestedIFrame(){
       driver.get("https://the-internet.herokuapp.com/nested_frames");
       driver.switchTo().frame("frame-top"); //switch the first all top
     driver.switchTo().frame("frame-left"); //switch to top left now
     //print out the text of left top
     System.out.println(driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText());


// Switch back to the main content (default content)
     driver.switchTo().defaultContent();
     //switching to bottom iframe
     driver.switchTo().frame("frame-bottom");
     System.out.println(driver.findElement(By.xpath("//body[contains(.,'BOTTOM')]")).getText());

     driver.switchTo().defaultContent();



 }







 @Test
    public void practiceIFrame(){
       driver.get("https://skpatro.github.io/demo/iframes/");

       driver.switchTo().frame("Frame1");
       driver.findElement(By.linkText("Category1")).click();

     String mainID = driver.getWindowHandle();
     Set<String> all2Windows = driver.getWindowHandles();

     for(String id:all2Windows){

         if (!id.equals(mainID)){
             driver.switchTo().window(id);
         }
     }
 //print out the text on second webpage
     System.out.println(driver.findElement(By.xpath("//h1")).getText());

     driver.switchTo().window(mainID);

     driver.switchTo().frame("Frame2");
     driver.findElement(By.linkText("Category3")).click();

     Set<String> all3Windows = driver.getWindowHandles();

     for (String id:all3Windows){

         driver.switchTo().window(id);

         if (driver.getTitle().equals("SoftwareTesting Archives - qavalidation")){
             break;
         }

     }

     System.out.println(driver.findElement(By.xpath("//h1")).getText());
     driver.switchTo().window(mainID);
     System.out.println(driver.getTitle()+" is title of main window");


 }









}
