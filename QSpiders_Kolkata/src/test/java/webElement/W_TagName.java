package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W_TagName {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
	Thread.sleep(2000);
	WebDriver pilot=new ChromeDriver();
	pilot.get("https://demoapps.qspiders.com/");
	pilot.manage().window().maximize();
	Thread.sleep(2000);
	WebElement ele=pilot.findElement(By.xpath("//p[text()='UI Testing Concepts']"));
	String tag=ele.getTagName();
	System.out.println(tag);
	pilot.close();
}
}
