package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W_SendKeys {
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
	Thread.sleep(2000);
	WebDriver pilot=new ChromeDriver();
	pilot.get("https://demoapps.qspiders.com/");
	pilot.manage().window().maximize();
	Thread.sleep(2000);
	pilot.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	Thread.sleep(3000);
	WebElement textbox=pilot.findElement(By.name("name"));
	textbox.sendKeys("Mango");
	Thread.sleep(2000);
	textbox.sendKeys(Keys.CONTROL+"ax"); //select all and cut
	WebElement mail=pilot.findElement(By.name("email"));
	mail.sendKeys(Keys.CONTROL+"v"); //paste the cut part
	Thread.sleep(1000);
	mail.sendKeys("108@mangomail.com");
	pilot.close();
}
}
