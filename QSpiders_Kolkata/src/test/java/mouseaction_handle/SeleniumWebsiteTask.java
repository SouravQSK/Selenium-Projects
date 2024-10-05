package mouseaction_handle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWebsiteTask {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		WebElement menu=driver.findElement(By.id("main_navbar"));
		Select se=new Select(menu);
		List<WebElement> all_options=se.getOptions();
		ArrayList<String>l= new ArrayList<String>();
		for(WebElement options:all_options)
		{
			String text=options.getText();
			l.add(text);
		}
		Collections.sort(l);
		for(String l1:l)
		{
			System.out.println(l1);
		}
		driver.close();
	}
}
