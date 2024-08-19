package selenium.action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestBase;

public class DragAndDrop extends TestBase {


 @Test
    public void DragAndDropPractice() throws InterruptedException {
     driver.get("https://www.lambdatest.com/selenium-playground/drag-and-drop-demo");

     WebElement draggable1 = driver.findElement(By.xpath("//span[.='Draggable 1']"));
     WebElement draggable2 = driver.findElement(By.xpath("//span[.='Draggable 2']"));

     WebElement dropZone = driver.findElement(By.cssSelector("#mydropzone"));

     Actions actions=new Actions(driver);
     actions.dragAndDrop(draggable1,dropZone).build().perform();
     actions.dragAndDrop(draggable2,dropZone).build().perform();

     Thread.sleep(3000);
     WebElement drag = driver.findElement(By.xpath("//p[.='Drag me to my target']"));
     WebElement drop = driver.findElement(By.cssSelector("#droppable"));

     actions.dragAndDrop(drag,drop).build().perform();


 }





 @Test
    public void DragAndDropTask() throws InterruptedException {
     driver.get("https://demos.telerik.com/kendo-ui/dragdrop/area");

     WebElement blueBall = driver.findElement(By.cssSelector("div[id='draggable']"));
     WebElement blueDropZone = driver.findElement(By.xpath("//div[.='Drag the small circle here ...']"));

     Actions actions=new Actions(driver);
Thread.sleep(3000);
     actions.dragAndDrop(blueBall,blueDropZone).build().perform();

    // String actual = driver.findElement(By.xpath("//div[.='You did great!']")).getText();
    //String ecpected="You did great!";
    // Assert.assertEquals(actual,ecpected,"failed to validate");

  blueDropZone=   driver.findElement(By.cssSelector("div[class='test1']"));
     String actual = blueDropZone.getText();
     String expected= "You did great!";

     Assert.assertEquals(actual,expected);


 }


















}
