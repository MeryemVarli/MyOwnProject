package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.TestBase;

import java.util.List;

public class GetAttribute extends TestBase {


  @Test
  public void getAttributePrc(){
      driver.get("https://www.lambdatest.com/selenium-playground/ajax-form-submit-demo");

    WebElement messageBox = driver.findElement(By.cssSelector("#description"));
    String rows = messageBox.getAttribute("rows");

    if (rows.contains("5")){
      messageBox.sendKeys("TEST TEST ");
    }


    WebElement name = driver.findElement(By.cssSelector("#title"));
    String attributeName = name.getAttribute("name");
    System.out.println(attributeName);

    if (attributeName.equals("title")){
      name.sendKeys("meryem");
    }
  }








  @Test
    public void getAttributePrc2()throws InterruptedException{
      driver.get("https://www.w3.org/TR/2019/NOTE-wai-aria-practices-1.1-20190814/examples/checkbox/checkbox-1/checkbox-1.html");
  driver.findElement(By.xpath("//button")).click();

    List<WebElement> sandwichCondiments = driver.findElements(By.cssSelector("div[role='checkbox']"));

    for (WebElement e:sandwichCondiments){

      if (e.getAttribute("aria-checked").equals("false")){
        Thread.sleep(2000);
        e.click();
      }
    }


  }
























}
