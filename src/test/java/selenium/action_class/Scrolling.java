package selenium.action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.TestBase;

public class Scrolling extends TestBase {


  @Test
  public void scrollingPractice(){
      driver.navigate().to("https://www.lambdatest.com/selenium-playground/hover-demo");

      Actions actions=new Actions(driver);

      WebElement buttomOfPage = driver.findElement(By.xpath("//div[.='Products & Features']"));

      actions.scrollToElement(buttomOfPage).build().perform();


      WebElement topTitle = driver.findElement(By.xpath("//h2[.='CSS Hover Effects on Button']/preceding-sibling::h2"));

      actions.moveToElement(topTitle).build().perform();

  }

















}
