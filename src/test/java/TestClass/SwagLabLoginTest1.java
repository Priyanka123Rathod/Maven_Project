package TestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFile.BaseClass;
import LibraryFile.UtilityClass;
import PomClasses.SwagLabHomeOPage;
import PomClasses.SwagLabLoginPage1;
import PomClasses.SwagLabMenuPage;

//import POM.SwagLabHomeOPage;

public class SwagLabLoginTest1 extends BaseClass
{
	SwagLabLoginPage1 page;
	SwagLabHomeOPage home;
	SwagLabMenuPage menu;
	Sheet sh;
	
	int ID;
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException, InterruptedException
	{
		intializeBrowaswser();
		 page=new SwagLabLoginPage1(driver );
		 home=new SwagLabHomeOPage(driver);
		 menu=new SwagLabMenuPage(driver);
	}
	@BeforeMethod
	public void loginToapp() throws InterruptedException//preCondition
, EncryptedDocumentException, IOException
	{
		page.UserName1(UtilityClass.getdataFromPF("UN"));
		Thread.sleep(1000);
		page.Password(UtilityClass.getdataFromPF("Pass"));
		Thread.sleep(1000);
		page.Login();
		Thread.sleep(1000);
	}
	
	@Test
public void VerifyTitle() throws EncryptedDocumentException, IOException, InterruptedException//actual test case
{
	    ID=101;
		String ActTitle=home.VerifyTitle();
		String expTitle=UtilityClass.getTD(0, 2);
		Assert.assertEquals(ActTitle, expTitle);
		//org.testng.Assert.assertEquals(ActTitle, expTitle);
		//Assert.assertEquals(ActTitle, expTitle,"Filed: Both result Are failed");
}
	@AfterMethod
	public void LogoutApp() throws InterruptedException//Post condition
	{
		
		home.clickOnMenuBtn();
		Thread.sleep(2000);
		menu.ClickOnLogout();
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}
}
