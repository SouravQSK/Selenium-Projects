package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Height_Width_Element {

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
		WebElement DropDown=pilot.findElement(By.id("options"));
		Dimension size=DropDown.getSize();
		System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		pilot.close();
	}
}
