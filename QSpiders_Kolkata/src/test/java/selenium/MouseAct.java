package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAct
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
	Thread.sleep(2000);
	WebDriver pilot=new ChromeDriver();
	pilot.get("https://www.drayanbasak.com/");
	pilot.manage().window().maximize();
	Thread.sleep(2000);
	WebElement online=pilot.findElement(By.xpath("//p[.='Online Consultation']"));
	Thread.sleep(2000);
	online.click();
	Actions act=new Actions(pilot);
	Thread.sleep(2000);
	act.moveToElement(online).perform();
	pilot.findElement(By.xpath("//span[.='BOOK NOW']")).click();
	}

}
