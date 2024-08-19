package selenium.action_class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.TestBase;

public class BasicAction extends TestBase {

@Test
    public void actionShowCase(){
    driver.get("https://the-internet.herokuapp.com");
    Actions actions=new Actions(driver);
    actions.contextClick();

    WebElement abTesting = driver.findElement(By.linkText("A/B Testing"));
    actions.click(abTesting).perform();



}






@Test
    public void actionPractice(){
    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
    Actions actions=new Actions(driver);

    WebElement rightClickMe = driver.findElement(By.xpath("//span[contains(.,'right click me')]"));
    actions.contextClick(rightClickMe).perform();

    WebElement delete = driver.findElement(By.xpath("//span[contains(.,'Delete')]"));
     actions.click(delete).perform();

    Alert alert=driver.switchTo().alert();
    System.out.println(alert.getText());
    alert.accept();


    WebElement doubleClickMe = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me')]"));
   actions.doubleClick(doubleClickMe).perform();


    System.out.println(alert.getText()+" is second alert after double click");
    alert.accept();

}















}
