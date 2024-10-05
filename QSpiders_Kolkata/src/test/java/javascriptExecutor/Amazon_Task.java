package javascriptExecutor;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazon_Task {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement clothes=driver.findElement(By.xpath("//div[@id='main-content']/div[2]"));
		Boolean clothing=clothes.isDisplayed();
		if(clothing)
		{
			Point position=clothes.getLocation();
			int x=position.getX();
			int y=position.getY();
			JavascriptExecutor js=(JavascriptExecutor) driver;
			Thread.sleep(2000);
			js.executeScript("window.scrollBy("+x+","+y+")");
		}
		else
		{
			System.out.println("Clothing is not present in the Webpage");
		}
		Thread.sleep(2000);
		TakesScreenshot tss=(TakesScreenshot) driver;
		File source=tss.getScreenshotAs(OutputType.FILE);
		File target=new File("F:\\Selenium WebPages\\screenshot.png");
		FileHandler.copy(source, target);
		Thread.sleep(5000);
		driver.quit();
}
}
