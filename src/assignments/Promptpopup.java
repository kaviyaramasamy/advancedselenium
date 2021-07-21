package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promptpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Textbox')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'prompt')]")).click();
		Thread.sleep(3000);
	    Alert prompt=driver.switchTo().alert();
	    String promptpopup=prompt.getText();
	    System.out.println(promptpopup);
	    prompt.sendKeys("Nalan");
	    prompt.accept();
	    String text=driver.findElement(By.id("demo1")).getText();
	    System.out.println(text);
	  


	}

}
