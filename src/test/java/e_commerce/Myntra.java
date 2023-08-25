package e_commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myntra {
  @Test
  public void myntra_test() {
	  
	  
	  Reporter.log("opening myntra",true);
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.myntra.com/ ");
		  driver.quit();
  }
}
