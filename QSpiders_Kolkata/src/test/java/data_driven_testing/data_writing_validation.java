package data_driven_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import generic_DDT.DDT_write;

public class data_writing_validation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Modern_Coach_Factory,_Raebareli");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	
		WebElement link=driver.findElement(By.tagName("a"));
		String link_text=link.getText();
		DDT_write.ddt(link_text, "BNCS_Links", 1, 0);
}
}
