package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;
import utils.TestBase;

import java.util.List;

public class DropDown2 extends TestBase {

    @Test
    public void practice(){
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        WebElement oneWay = driver.findElement(By.cssSelector("input[value='oneway']"));
        BrowserUtils.click(oneWay);

        WebElement passenger = driver.findElement(By.cssSelector("select[name='passCount']"));
        Select passengerDropDown=new Select(passenger);
        passengerDropDown.selectByValue("2");

        WebElement departingMonth = driver.findElement(By.cssSelector("select[name='fromPort']"));
       BrowserUtils.selectBy(departingMonth,"Frankfurt","visibleText");

        WebElement departingDay = driver.findElement(By.cssSelector("select[name='fromDay']"));
       Select departingDayDropDown=new Select(departingDay);
       departingDayDropDown.selectByValue("5");

        WebElement arrivingCity = driver.findElement(By.cssSelector("select[name='toPort']"));
   BrowserUtils.selectOptionFromAllOptions(arrivingCity,"London");

        WebElement returnMonth = driver.findElement(By.xpath("//select[@name='toMonth']"));
      BrowserUtils.selectBy(returnMonth,"June","visibleText");

        WebElement returnDay =  driver.findElement(By.xpath("//select[@name='toDay']"));
    Select returnOptions=new Select(returnDay);
    returnOptions.selectByValue("3");

        WebElement serviceClass = driver.findElement(By.xpath("//input[@value='First']"));
      BrowserUtils.click(serviceClass);


        WebElement airline = driver.findElement(By.cssSelector("select[name='airline']"));
     Select airlineDropDown=new Select(airline);
        List<WebElement> options = airlineDropDown.getOptions();

        for (WebElement element:options){

            if (element.getText().equalsIgnoreCase("No Preference")){
                element.click();
            }
        }


        WebElement continueButton = driver.findElement(By.cssSelector("input[type='image']"));
      BrowserUtils.click(continueButton);




    }



}
