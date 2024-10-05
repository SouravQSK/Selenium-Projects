package javascriptExecutor;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DemoOrangeHR_task {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("admin123",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Add Employee']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Jonathan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("James");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button [@type='submit']")).click();
		Thread.sleep(2500);
		TakesScreenshot tss=(TakesScreenshot) driver;
		File source=tss.getScreenshotAs(OutputType.FILE);
		File target=new File("F:\\Selenium WebPages\\OrangeHRM.png");
		FileHandler.copy(source, target);
		driver.findElement(By.xpath("//a[.='Employee List']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='2']")).click();
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.xpath("//div[.='Jonathan ']"));
		Boolean presence=name.isDisplayed();
		if(presence)
		{
		Point position=name.getLocation();
		int x=position.getX();
		int y=position.getY();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		}
		else
		{
			System.out.println("Entry is not added");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Jonathan ']/../div[9]/div/button[2]")).click();
		Thread.sleep(2000);
		TakesScreenshot tc=(TakesScreenshot) driver;
		File src=tc.getScreenshotAs(OutputType.FILE);
		File tgt=new File("F:\\Selenium WebPages\\OrangeHRM1.png");
		FileHandler.copy(src, tgt);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='manda user']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		Thread.sleep(2000);
	}
}
