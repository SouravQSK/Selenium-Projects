package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoOrange_PomClass {
 @FindBy(name="username")
 private WebElement UN_textfield;
 @FindBy(name="password")
 private WebElement Pwd_textfield;
 @FindBy(xpath="//button[@type='submit']")
 private WebElement Login_button;
 public DemoOrange_PomClass(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 public WebElement UN()
 {return UN_textfield;}
 public WebElement PWD()
 {return Pwd_textfield;}
 public WebElement Login()
 {return Login_button;
 }
}
