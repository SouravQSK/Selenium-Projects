package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMap 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
	Thread.sleep(2000);
	WebDriver pilot=new ChromeDriver();
	pilot.get("https://www.google.com/maps");
	pilot.manage().window().maximize();
	Thread.sleep(2000);
	WebElement direction=pilot.findElement(By.xpath("//button[@aria-label='Directions']"));
	direction.click();
	Thread.sleep(2000);
	WebElement source=pilot.findElement(By.xpath("//input[@aria-label='Choose starting point, or click on the map...']"));
	source.click();
	source.sendKeys("Kolkata,West Bengal", Keys.ENTER);
	Thread.sleep(2000);
	WebElement destination=pilot.findElement(By.xpath("//input[@aria-label='Choose destination, or click on the map...']"));
	Thread.sleep(2000);
	destination.sendKeys("Tawang, Arunachal Pradesh", Keys.ENTER);
	Thread.sleep(2000);
	//JavascriptExecutor js=(JavascriptExecutor) pilot;
	TakesScreenshot ss=(TakesScreenshot) pilot;
	ss.getScreenshotAs(OutputType.FILE);
	// FileUtils.copyfile(ss,new File("F:\\"));
	//pilot.close();

	
	}

}
