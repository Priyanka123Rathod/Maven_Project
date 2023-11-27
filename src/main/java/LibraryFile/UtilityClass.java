package LibraryFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{
	Sheet sh;
public static String getTD(int rowIndex,int colIndex) throws EncryptedDocumentException, IOException, InterruptedException
{
	//this method is use to get data from excel sheet
	FileInputStream file=new FileInputStream("D:\\Notes\\Automation-Selenium\\worksheet.xlsx");
    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
    String value=sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
    
   
    return value;
}
public static String getdataFromPF(String Key) throws IOException
{
	FileInputStream file=new FileInputStream("R:\\eclipse\\eclipse-workspace\\Java_Project\\propertyFile.properties");
	Properties p=new Properties();
	p.load(file);
	String value = p.getProperty(Key);
	return value;
}
}
