package dataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IRI_POM_Class {
	@FindBy(xpath="//input[@placeholder='from station']")
	 private WebElement Source;
	 @FindBy(xpath="//input[@placeholder='to station']")
	 private WebElement Destination;
	 @FindBy(xpath="(//div[@name='SrhDiv'])[2]")
	 private WebElement Go;
	 public IRI_POM_Class(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 public WebElement src()
	 {return Source;}
	 public WebElement dstn()
	 {return Destination;}
	 public WebElement search()
	 {return Go;
	 }
}
