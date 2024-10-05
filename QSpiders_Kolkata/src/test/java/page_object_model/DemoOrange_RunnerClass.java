package page_object_model;

import org.testng.annotations.Test;

public class DemoOrange_RunnerClass extends DemoOrange_BaseClass{
@Test
public void run()
{
	DemoOrange_PomClass POM=new DemoOrange_PomClass(driver);
	POM.UN().sendKeys("Admin");
	POM.PWD().sendKeys("admin123");
	POM.Login().click();
}
}
