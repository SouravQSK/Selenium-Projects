package page_object_model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoOrange_BaseClass 
{
		public WebDriver driver;
	@BeforeMethod
	public void open_browser()
	{
	WebDriverManager.chromedriver().setup();	
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@AfterMethod
	public void close_browswer()
	{
	driver.close();
	}
}
