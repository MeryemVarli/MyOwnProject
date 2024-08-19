package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utils.TestBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DropDown extends TestBase {



@Test
    public void dropDownPractice() throws InterruptedException{
    driver.get("https://the-internet.herokuapp.com/");
    WebElement dropDownLink = driver.findElement(By.cssSelector("a[href='/dropdown']"));
    dropDownLink.click();

    //now we need to handle the dropdown itself
    WebElement dropDown = driver.findElement(By.cssSelector("select[id='dropdown']"));

    Select select=new Select(dropDown);
    //select.selectByVisibleText("Option 2");
   // select.selectByValue("2");

    Thread.sleep(3000);

    //or get all option and store in list<webelement>
    List<WebElement> selectOption = select.getOptions();

    for (int i=0;i<selectOption.size();i++){

        if (selectOption.get(i).getText().equals("Option 2")){
            selectOption.get(i).click();
        }

    }

}

@Test
    public void practice2(){
    driver.get("https://www.lambdatest.com/selenium-playground/table-pagination-demo");
    WebElement row = driver.findElement(By.cssSelector("#maxRows"));
    Select select=new Select(row);
    select.selectByValue("5");

    List<WebElement> lastNames = driver.findElements(By.xpath("//tr//td[3]"));
    List<WebElement> allEmails = driver.findElements(By.xpath("//tr//td[4]"));

    Map<String,String> map=new HashMap<>();

    for(int i=0;i< lastNames.size();i++){
        map.put(lastNames.get(i).getText(),allEmails.get(i).getText());

    }
    System.out.println(map);


}
















}
