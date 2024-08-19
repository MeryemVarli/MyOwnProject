package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.TestBase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PianoTask extends TestBase {


  @Test
  public void pianoPrc() throws InterruptedException {
      driver.get("https://www.musicca.com/piano");

      List<WebElement> allKeys = driver.findElements(By.cssSelector("li[class='key']"));


      //all the notes that we need for specific music
      List<String> music= Arrays.asList("2g","2g","3d","3d","3e","3e","3d","3c","3c","3b","3b","3a","3a","2g");

      Map<String,WebElement> keyboard= new HashMap<>();

  for(WebElement key:allKeys){
      keyboard.put(key.getAttribute("data-note"),key );

  }

  for (String notes:music){
      WebElement key = keyboard.get(notes);
      key.click();
      Thread.sleep(300);

  }







  }





















}
