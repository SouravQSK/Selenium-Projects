package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Banknotecoinstamp1 {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://banknotecoinstamp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("(//input[@class='tt-search-input'])[2]"));
		search.sendKeys("World Coins");
		Thread.sleep(2000);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='2']")).click();
		List<WebElement> coins=driver.findElements(By.xpath("//h2[@class='tt-title prod-thumb-title-color']"));//coin names
		List<WebElement> prices=driver.findElements(By.xpath("//div[@class='tt-price']"));//coin prices
		String path="F:\\TestData.xlsx";
		FileInputStream fis=new FileInputStream(path);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh= null;
		try {
			sh=book.createSheet("BankNoteCoinStamp");
		}
		catch(Exception e)
		{
			sh=book.getSheet("BankNoteCoinStamp");
		}
		int size=coins.size();
		for(int i=0;i<=size-1;i++)
		{
			//printing coin names
			Row r=sh.createRow(i+11);
			WebElement name=coins.get(i);
			String coin_name=name.getText();
			Cell c=r.createCell(1);
			c.setCellValue(coin_name);
			//printing coin prices
			WebElement price=prices.get(i);
			String coin_price=price.getText();
			Cell c1=r.createCell(2);
			c1.setCellValue(coin_price);
			System.out.println(coin_price);
		}
		FileOutputStream fos=new FileOutputStream(path);
		book.write(fos);
		Thread.sleep(5000);
		driver.close();
}
}
