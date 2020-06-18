package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.yaml.snakeyaml.introspector.GenericProperty;

import Genericlibs.GenericPropLib;
import Genericlibs.Getphoto;
import Genericlibs.IAutoConstants;

public class Basetest implements IAutoConstants
{
	WebDriver driver;
	static
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
	}
	@BeforeMethod
	public void openApp()
	{
		String appURL=GenericPropLib.getDataFromPropertyfile(CONFIG_PATH, "url");
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		driver.get(appURL);
	}
	@AfterMethod
	public void closeApp(ITestResult result)
	{
		int status = result.getStatus();
		String name = result.getName();
		
		if (status==1) {
			
			Reporter.log("PASSED "+name,true);
		}
		else
		{
			Reporter.log("FAILED "+name,true);
			Getphoto.getphoto(driver, name);
			
		}
		driver.quit();
	}

}
