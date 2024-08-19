package selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utils.ConfigReader;
import utils.TestBase;

import java.util.List;

public class Practice1 extends TestBase {



   @Test
   public void practice1()throws InterruptedException{
    driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
 driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("jeff");
driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("ore");
driver.findElement(By.cssSelector("#sex-0")).click();
driver.findElement(By.cssSelector("#exp-6")).click();
driver.findElement(By.cssSelector("#datepicker")).sendKeys("07/03/2024");
Thread.sleep(200);
driver.findElement(By.cssSelector("#tool-2")).click();
Thread.sleep(2000);

       WebElement continents = driver.findElement(By.cssSelector("#continents"));
       Select select=new Select(continents);
       select.selectByVisibleText("Africa");

       Thread.sleep(3000);

       WebElement seleniumCommands = driver.findElement(By.cssSelector("#selenium_commands"));
       Select select2=new Select(seleniumCommands);
       select2.selectByVisibleText("Navigation Commands");


       WebElement uploadPhoto = driver.findElement(By.cssSelector("#photo"));
       Thread.sleep(2000);
       uploadPhoto.sendKeys("/Users/meryemvarli/Desktop/B22-HTML/image.jpg");
driver.findElement(By.cssSelector("#submit")).click();

   }





   @Test
    public void createAccount(){
       driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
driver.findElement(By.cssSelector("#input-firstname")).sendKeys(ConfigReader.readProperties("name"));
driver.findElement(By.cssSelector("#input-lastname")).sendKeys(ConfigReader.readProperties("lastname"));
driver.findElement(By.cssSelector("#input-email")).sendKeys(ConfigReader.readProperties("email"));
driver.findElement(By.cssSelector("#input-telephone")).sendKeys(ConfigReader.readProperties("phone"));
driver.findElement(By.cssSelector("#input-password")).sendKeys("1234567");
driver.findElement(By.cssSelector("#input-confirm")).sendKeys("1234567");

       List<WebElement> yesNo = driver.findElements(By.cssSelector("label[class='radio-inline']"));

       for (WebElement str:yesNo){

          if (str.getText().equalsIgnoreCase("yes")){
              str.click();
          }


       }

       driver.findElement(By.cssSelector("input[name='agree']")).click();
       driver.findElement(By.cssSelector("input[value='Continue']")).click();

   }








   @Test
    public void testDiary(){
       driver.get("http://www.testdiary.com/training/selenium/selenium-test-page/");
       WebElement seleniumBox = driver.findElement(By.cssSelector("#seleniumbox"));

       if (!seleniumBox.isSelected()){
           seleniumBox.click();
       }


       WebElement java = driver.findElement(By.cssSelector("#java1"));

      if (!java.isSelected()){
          java.click();
       }
driver.findElement(By.linkText("Test Diary")).click();
       String text1 = driver.findElement(By.xpath("//h1")).getText();
       System.out.println(text1+" is first text");

       driver.navigate().back();

driver.findElement(By.linkText("Test Diary Selenium Learning")).click();
       String text2 = driver.findElement(By.xpath("//h1")).getText();
       System.out.println(text2+" is second text");
       driver.navigate().back();

       WebElement shirts = driver.findElement(By.cssSelector("#Shirts"));
       Select select=new Select(shirts);
       select.selectByValue("yellow");

       WebElement skirts = driver.findElement(By.cssSelector("#Skirts"));
       Select select2=new Select(skirts);
       select2.selectByVisibleText("Yellow Skirt");


  driver.findElement(By.cssSelector("input[name='your-name']")).sendKeys("joe");
  driver.findElement(By.cssSelector("input[name='your-email']")).sendKeys("wer@gmail.com");
  driver.findElement(By.cssSelector("input[name='your-subject']")).sendKeys("subject");
  driver.findElement(By.cssSelector("textarea[name='your-message']")).sendKeys("blaaaaa");
  driver.findElement(By.cssSelector("input[type='submit']")).click();

   }















}
