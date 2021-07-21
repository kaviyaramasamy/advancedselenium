package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		ArrayList <String> naukri=new ArrayList <String>(driver.getWindowHandles());
		 for(String Output:naukri) {
	    	  System.out.println(Output);
	      }
	    String mainwindow=driver.getTitle();
	    System.out.println(mainwindow);
	    driver.switchTo().window(naukri.get(1));
	    String secondwindow=driver.getTitle();
	    System.out.println(secondwindow);
	    

	}

}
