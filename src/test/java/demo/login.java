package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login 
{

	WebDriver driver;
	@Test(priority=1)
	public void test()
	{
		
		System.out.println("Start the test");
		System.setProperty("webdriver.chrome.driver","E:\\Selenium All Driver\\chrome\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
	}
	
	@Test(priority=2)
	public void closeBrowser()
	{
		driver.quit();
		
	}

}
