package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndiaRailInfo {
	
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./Resource/chromedriver.exe");
	WebDriver pilot=new ChromeDriver();
	pilot.get("https://indiarailinfo.com/");
	pilot.manage().window().maximize();
	Thread.sleep(2000);
	WebElement source=pilot.findElement(By.xpath("//input[@placeholder='train']"));
	source.sendKeys("12301");
	Thread.sleep(2000);
	WebElement go=pilot.findElement(By.xpath("//span[text()='Howrah - New Delhi Rajdhani Express (Via Gaya)']"));
	go.click();
	Thread.sleep(3000);
	WebElement slc=pilot.findElement(By.xpath("//div[contains(.,'Go')]"));
	slc.click();
	
	}

}
