package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
	Thread.sleep(2000);
	WebDriver pilot=new ChromeDriver();
	pilot.get("https://www.instagram.com/");
	pilot.manage().window().maximize();
	Thread.sleep(2000);
	WebElement un=pilot.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
	Thread.sleep(2000);
	un.click();
	Thread.sleep(2000);
	un.sendKeys("Rail_Tales");
	WebElement pwd=pilot.findElement(By.xpath("//input[@aria-label='Password']"));
	Thread.sleep(2000);
	pwd.click();
	Thread.sleep(2000);
	pwd.sendKeys("HowrahWAP7");
	Thread.sleep(2000);
	pilot.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);	
	pilot.findElement(By.xpath("//*[name()='svg' and @aria-label='Search']")).click();
	Thread.sleep(1000);	
	pilot.findElement(By.xpath("//input[@aria-label='Search input']")).sendKeys("Arupesh Sarkar");
	Thread.sleep(2000);	
	pilot.findElement(By.xpath("//span[contains(.,'Arupesh Sarkar')]")).click();
	Thread.sleep(2000);
	WebElement pic=pilot.findElement(By.xpath("//img[@src='https://instagram.fccu20-1.fna.fbcdn.net/v/t51.29350-15/434302541_385971244261464_4356171401602892045_n.webp?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xMDgweDEwODAuc2RyLmYyOTM1MCJ9&_nc_ht=instagram.fccu20-1.fna.fbcdn.net&_nc_cat=100&_nc_ohc=l8ka_ZBePjgQ7kNvgGbrYhQ&edm=AEhyXUkBAAAA&ccb=7-5&ig_cache_key=MzMzMDk0MDA0MDgzODM3MDgzNg%3D%3D.2-ccb7-5&oh=00_AYBJHYJbDD8kPvpRpcushXfsY_iYjJEOa1xid_jMzhNgaA&oe=66ACFE93&_nc_sid=8f1549']"));
	Thread.sleep(2000);
	Actions open=new Actions(pilot);
	open.moveToElement(pic).perform();
	Thread.sleep(2000);
	
	open.doubleClick(pic).perform();
//	pilot.findElement(By.xpath("//div[@role='button']")).click();	
//	pilot.switchTo().alert().accept();
//	al.accept();
//	pilot.findElement(By.xpath("//button[text()='Not Now']")).click();

	
	}

}
