package selenium.action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.TestBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HoverOver extends TestBase {


 @Test
 public void hoverOverPractice(){
     driver.get("https://the-internet.herokuapp.com/hovers");

     List<WebElement> allFigures = driver.findElements(By.cssSelector("div[class='figure']"));

     List<WebElement> allUsers = driver.findElements(By.xpath("//h5"));

     List<String> list=new ArrayList<>();

     Actions actions =new Actions(driver);

     for (int i = 0; i <allFigures.size() ; i++) {

         actions.moveToElement(allFigures.get(i)).build().perform();

         list.add(allUsers.get(i).getText());

     }
     System.out.println(list);


 }







@Test
public void menuTask(){
     driver.get("https://demos.telerik.com/kendo-ui/fx/expand");

    List<WebElement> allMenu = driver.findElements(By.cssSelector("div[class='product k-listview-item']"));

    List<WebElement> allFoodNames = driver.findElements(By.xpath("//h3"));

    List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class='product-description']//p"));

    Actions actions=new Actions(driver);
    Map<String,String> map=new HashMap<>();

    for (int i = 0; i < allFoodNames.size(); i++) {

      actions.moveToElement(allMenu.get(i)).build().perform();

      map.put(allFoodNames.get(i).getText(),allPrices.get(i).getText().replace("$",""));



    }

    System.out.println(map);




 }








}
