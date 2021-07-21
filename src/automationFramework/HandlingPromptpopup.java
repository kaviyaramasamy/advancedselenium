package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPromptpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
		Thread.sleep(3000);
		Alert prompt=driver.switchTo().alert();
		String Prompttext=prompt.getText();
		System.out.println(Prompttext);
		prompt.sendKeys("Kaviya");
		prompt.accept();
		String Text=driver.findElement(By.xpath("//p[contains(text(),'Kaviya')]")).getText();
		System.out.println(Text);
	

	}

}
