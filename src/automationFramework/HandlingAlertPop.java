package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[2]")).click();
		Thread.sleep(3000);
		Alert confirm=driver.switchTo().alert();
		String ConfirmText=confirm.getText();
		System.out.println(ConfirmText);
		confirm.dismiss();
		//confirm.accept();

	}

}
