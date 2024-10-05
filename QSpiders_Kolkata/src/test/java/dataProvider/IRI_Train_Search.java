package dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class IRI_Train_Search extends IRI_BaseClass{
@Test
	public void IRI() throws FileNotFoundException, IOException, InterruptedException {
	Properties data=new Properties();
	data.load(new FileInputStream("./Train.properties"));
	String source=data.getProperty("Source");
	System.out.println(source);
	String destination=data.getProperty("Destination");
	System.out.println(destination);
	IRI_POM_Class run=new IRI_POM_Class(driver);
	run.src().sendKeys(source);
	Thread.sleep(2000);
	run.src().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	Thread.sleep(2000);
	run.dstn().sendKeys(destination);
	Thread.sleep(2000);
	run.dstn().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	run.search().click();
	Thread.sleep(5000);
}
}
