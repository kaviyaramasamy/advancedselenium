package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[1]")).click();
		Thread.sleep(3000);
	    Alert popup=driver.switchTo().alert();
	   // String Alerttext=popup.getText();
	   // System.out.println(Alerttext);
	    System.out.println(popup.getText());
	    popup.accept();

	}

}
