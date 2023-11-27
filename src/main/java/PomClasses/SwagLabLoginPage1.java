package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage1 
//POM class1
{
@FindBy(xpath="//input[@type='text']") private WebElement UN;

@FindBy(xpath="//input[@type='password']") private WebElement Pass;

@FindBy(xpath="//input[@type='submit']") private WebElement login;

//Step2=Initialization

public SwagLabLoginPage1 (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//Step3=Usage
public void UserName1(String UserName)
{
	UN.sendKeys( UserName);
}
public void Password(String Password)
{
	Pass.sendKeys(Password);
}
public void Login()
{
	login.click();
}

}
