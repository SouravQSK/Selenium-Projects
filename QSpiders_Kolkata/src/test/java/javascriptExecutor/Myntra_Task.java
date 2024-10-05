package javascriptExecutor;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_Task {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Hrx Shoes",Keys.ENTER);
		
		WebElement ele = driver.findElement(By.xpath("//span[.='Recommended']"));
		Actions move = new Actions(driver);
		move.moveToElement(ele).build().perform();
		WebElement ele1 = driver.findElement(By.xpath("(//label[@class='sort-label '])[2]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele1);
		driver.findElement(By.xpath("//ul[@class='results-base']/li[1]")).click();
		Set<String> window = driver.getWindowHandles();
		for (String w : window) {
			driver.switchTo().window(w);
		}
		driver.findElement(By.xpath("(//button[@class='size-buttons-size-button size-buttons-size-button-default'])[2]")).click();
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")).click();
		driver.findElement(By.xpath("(//button[.='REMOVE'])[1]")).click();
		driver.findElement(By.xpath("(//button[.='REMOVE'])[2]")).click();

	}
}
