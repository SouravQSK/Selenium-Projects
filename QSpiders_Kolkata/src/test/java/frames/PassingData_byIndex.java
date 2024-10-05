package frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassingData_byIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
}
}
