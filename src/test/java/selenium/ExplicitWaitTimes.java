package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.TestBase;

import java.time.Duration;

public class ExplicitWaitTimes extends TestBase {




 @Test
 public void explicitWaitExample(){
     driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
driver.findElement(By.xpath("//button[.='Start']")).click();
     WebElement text = driver.findElement(By.xpath("//h4[.='Hello World!']"));

     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
     wait.until(ExpectedConditions.visibilityOf(text));
     System.out.println(text.getText());


 }











}
