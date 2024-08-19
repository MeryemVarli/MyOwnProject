package selenium.action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestBase;

public class ClickAndHold extends TestBase {

   @Test
   public void  clickAndHold(){
       driver.get("https://demoqa.com/droppable");

       Actions actions=new Actions(driver);



   }


   @Test
    public void ClickAndHoldTask() throws InterruptedException {
       driver.get("https://demoqa.com/droppable");
       WebElement draggable = driver.findElement(By.cssSelector("#draggable"));
       WebElement dropZone = driver.findElement(By.cssSelector("#droppable"));

      Actions actions=new Actions(driver);
Thread.sleep(2000);
      actions.clickAndHold(draggable).moveToElement(dropZone).release(dropZone).build().perform();
Thread.sleep(2000);
       String actualText = driver.findElement(By.xpath("//p[.='Dropped!']")).getText();
      String expected="Dropped!";
       Assert.assertEquals(actualText,expected,"failed to validate the message");

   }
























}
