package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.ConfigReader;

import java.time.Duration;

public class KatalonPrc {

WebDriver driver;

    @BeforeMethod
    public void startDriver(){
  driver=new ChromeDriver();
  driver.get("https://katalon-demo-cura.herokuapp.com/");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void bookingFunctional() throws InterruptedException{
        WebElement makeAppButton=driver.findElement(By.id("btn-make-appointment")) ;
        makeAppButton.click();

        Thread.sleep(2000);

     WebElement userName= driver.findElement(By.xpath("//input[@name='username']"))   ;
     userName.sendKeys(ConfigReader.readProperties("username"));

Thread.sleep(1000);

     WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
     password.sendKeys(ConfigReader.readProperties("password"));

     Thread.sleep(1000);

     WebElement logInButton=driver.findElement(By.id("btn-login"));
     logInButton.click();

     Thread.sleep(2000);

     //checkbox for applying hsptl

        WebElement checkBox=driver.findElement(By.xpath("//label[@class='checkbox-inline']"));
        if (!checkBox.isSelected()){
            checkBox.click();
        }
        Thread.sleep(1000);

        WebElement datePicker=driver.findElement(By.xpath("//input[@id='txt_visit_date']"));
        datePicker.sendKeys("07/10/2024");

        Thread.sleep(1000);

        WebElement comment=driver.findElement(By.xpath("//textarea[@name='comment']"));
       comment.sendKeys("5 star hotel pls");
        Thread.sleep(1000);

        WebElement bookAppButton=driver.findElement(By.id("btn-book-appointment"));
        bookAppButton.click();

        Thread.sleep(2000);

        WebElement facility=driver.findElement(By.id("facility"));
        if (facility.isDisplayed()){
            System.out.println(facility.getText()+" facility text is present");
        }

        Thread.sleep(1000);
         WebElement applyforAddd=driver.findElement(By.xpath("//p[@id='hospital_readmission']"));
         if (applyforAddd.isDisplayed()){
             System.out.println(applyforAddd.getText()+" readmission text is present");
         }

         Thread.sleep(1000);
         WebElement hprogram=driver.findElement(By.xpath("//p[@id='program']"));
         if (hprogram.isDisplayed()){
             System.out.println("medicare text is present "+hprogram.getText());
         }
         Thread.sleep(1000);

         WebElement visitDay=driver.findElement(By.id("visit_date"));
         if (visitDay.isDisplayed()){
             System.out.println(visitDay.getText()+" visit date is present");
         }

         WebElement comment2=driver.findElement(By.xpath("//p[@id='comment']"));
         if (comment2.isDisplayed()){
             System.out.println(comment2.getText()+" is present");
         }

         Thread.sleep(1000);
         WebElement goHomePage=driver.findElement(By.xpath("//a[contains(text(),'Go')]"));
         goHomePage.click();



    }

@AfterMethod
    public void tearDown(){
        driver.quit();
}











}
