package e_commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void amazon_test() throws InterruptedException 
  {
	 Reporter.log("opening amazon",true);
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 System.out.println("this is amazon shopping app");
	 Thread.sleep(1000);
	  driver.quit();
  }
}
