package selenium.action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.TestBase;

import java.util.List;

public class MoveByOffset extends TestBase {


 @Test
 public void moveByOffsetShowCase(){
     driver.navigate().to("https://the-internet.herokuapp.com/horizontal_slider");
     WebElement slider = driver.findElement(By.cssSelector("input[type='range']"));

     Actions actions=new Actions(driver);
     actions.clickAndHold(slider).moveByOffset(30,0).build().perform();

 }





 @Test
 public void MoveByOffsetTask(){
     driver.get("https://www.lambdatest.com/selenium-playground/drag-drop-range-sliders-demo");

     List<WebElement> allRanges = driver.findElements(By.cssSelector("input[type='range']"));

     Actions actions=new Actions(driver);

     for (WebElement e:allRanges){

         actions.clickAndHold(e).moveByOffset(60,0).build().perform();
     }


 }





 @Test
    public void moveByOffSetYAndX(){
     driver.navigate().to("https://www.lambdatest.com/selenium-playground/drag-and-drop-demo");

     WebElement draggable2 = driver.findElement(By.xpath("//span[.='Draggable 2']"));

Actions actions=new Actions(driver);
actions.clickAndHold(draggable2).moveByOffset(70,20);
 }










}
