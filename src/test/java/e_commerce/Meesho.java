package e_commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Meesho {
  @Test
  public void meesho_test() 
  {  
	  Reporter.log("opening meesho",true);
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.meesho.com/ ");
		  driver.quit();  
	  
	
  }
}
