package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomeOPage 
{
@FindBy(xpath="//button[text()='Open Menu']") private WebElement menu;
 WebDriver driver;

public SwagLabHomeOPage (WebDriver driver)
{
	this.driver =driver;
	//globalVariable=localVariable -> assign local driver info into global driver
	PageFactory.initElements(driver, this);
}
public String VerifyTitle()
{
	String actTitle=driver.getTitle();
	return actTitle;
//	String expTitle="Swag Labs";
//	if(actTitle.equals(expTitle))
//	{
//		System.out.println("pass");
//	}
//	else
//	{
//		System.out.println("fail");
//	}
}
	public void clickOnMenuBtn()
	{
		menu.click();  
	}
}

