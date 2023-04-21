package testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObject.loginPageObject;

public class LoginTest {
		
		WebDriver driver;
		@Test
		public void TestMethod() {
			//Logger logger=Logger.getLogger("testCases");
			
			System.setProperty("WebDriver.chrome.driver", "C:\\Users\\RD\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver(); 
			 loginPageObject lpo= new loginPageObject(driver);
			 
			 driver.get("https://demo.guru99.com/test/newtours/register.php");
			 lpo.firtName("Chandi");
			 lpo.lastName("Dubey");
			 lpo.phone("8289017480");
			 lpo.emalid("dubey12163@gmail.com");
			 lpo.adress("Devipur");
			 lpo.City("Delhi");
			 lpo.State("Delhi");
			 lpo.postalcode("273310");
			 lpo.selectcon();
			 lpo.Username("Ramchand Dubey");
			 lpo.Password("Dubey@15300");
			 lpo.ConfPass("Dubey@15300");
			// lpo.submit();
			
			 
		}

	
	
		
	

}
