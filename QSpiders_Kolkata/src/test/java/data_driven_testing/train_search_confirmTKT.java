package data_driven_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import generic_DDT.DDT_read;

public class train_search_confirmTKT {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.railyatri.in/train-ticket");
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.xpath("//input[@name='fromStation']"));
		source.sendKeys(DDT_read.ddt("IRCTC", 6, 0));
		Thread.sleep(2000);
		source.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(2000);
		WebElement destination=driver.findElement(By.xpath("//input[@name='toStation']"));
		destination.sendKeys(DDT_read.ddt("IRCTC", 17, 1));
		Thread.sleep(2000);
		destination.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Search Trains']")).click();
		

}
}
