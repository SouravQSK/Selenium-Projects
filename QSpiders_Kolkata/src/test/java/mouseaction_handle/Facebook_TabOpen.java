package mouseaction_handle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_TabOpen {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement lang=driver.findElement(By.xpath("//a[.='বাংলা']"));
	Actions act=new Actions(driver);
	act.contextClick(lang).build().perform();
	Thread.sleep(2000);
	Robot robo=new Robot();
	robo.keyPress(KeyEvent.VK_T);
	robo.keyRelease(KeyEvent.VK_T);
	driver.close();

}
}

