package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavagationCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.flipkart.com/");
	    Thread.sleep(3000);
	    driver.navigate().back();
	    Thread.sleep(3000);
	    driver.navigate().forward();
	    Thread.sleep(3000);
	    driver.navigate().refresh();
	    
	}

}
