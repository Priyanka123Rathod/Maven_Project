package LibraryFile;






import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
//	WebDriver driver;
//public void openBrowser() throws InterruptedException, IOException
//{
//	 driver=new ChromeDriver();
//	 driver.manage().window().maximize();
//	
//	 
//	 
//	 driver.get(UtilityClass.getDataFromPF("URL"));
//	 
//		
//		
//}
public WebDriver driver;
	
	public  void intializeBrowaswser() throws IOException {
		
		driver=new ChromeDriver();
		
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get(UtilityClass.getdataFromPF("URL"));

}
}
