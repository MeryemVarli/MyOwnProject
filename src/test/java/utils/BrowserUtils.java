package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class BrowserUtils {

    //all methods are static


   public static String getText(WebElement element){


       return element.getText().trim();

   }

   public static void sendKeys(WebElement element,String keys){
       element.clear();
       element.sendKeys(keys);
   }

   //reusable method for dropdowns
    public static void selectBy(WebElement element,String option,String methodName){
        Select select=new Select(element);

        switch (methodName){

            case "visibleText":
                select.selectByVisibleText(option);
                break;
            case "ByValue":
                select.selectByValue(option);
                break;
            case "index":
                select.selectByIndex(Integer.parseInt(option));
                break;
            default:
                System.out.println("please check your method name,the method name you have chosen is not available");
                break;

        }

   }

   //returns list of webelement from select. It retrieves all the options from the dropdown
    public static List<WebElement> getAllSelectOptions(WebElement element){
       Select select=new Select(element);

       return select.getOptions();

   }


   public static void selectOptionFromAllOptions(WebElement element,String option){
       Select select=new Select(element);
       for (WebElement e:select.getOptions()){

           if (BrowserUtils.getText(e).equalsIgnoreCase(option)){
               e.click();
               break;
           }

       }

   }


   public static void selectOptionFromAllOptions(List<WebElement> elementList,String option){

       for (WebElement e:elementList){

           if (BrowserUtils.getText(e).equalsIgnoreCase(option)){
               e.click();
               break;
           }
       }

   }


   public static void click(WebElement element){
       element.click();
   }



   public static void click(WebElement element,WebDriver driver){
    //timeoutException
       try {
           WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
           wait.until(ExpectedConditions.visibilityOf(element));

           JavascriptExecutor js= (JavascriptExecutor) driver;
           js.executeScript("arguments[0].click()",element);
       }catch (TimeoutException | ElementNotInteractableException e){
           System.err.println("Javascript method did not work on click "+e.getMessage());
           WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
           wait.until(ExpectedConditions.visibilityOf(element));
           Actions actions = new Actions(driver);
           actions.click(element).build().perform();
       }








   }



public static void switch2Windows(WebDriver driver){

String currentID= driver.getWindowHandle();
    Set<String> allIDs = driver.getWindowHandles();

    for (String id:allIDs){

        if (!id.equals(currentID)){
            driver.switchTo().window(id);
            break;
        }
    }


   }


public static  void switchWindowWithTitle(WebDriver driver,String title){

    Set<String> ids = driver.getWindowHandles();

    for (String id:ids){
        driver.switchTo().window(id);

        if (driver.getTitle().equals(title)){
           break;
        }
    }


}


public void switchWindowWithURL(WebDriver driver,String Url){

    Set<String> ids = driver.getWindowHandles();

    for (String id:ids){
        driver.switchTo().window(id);

        if (driver.getCurrentUrl().equals(Url)){
            break;
        }
    }


}




















}
