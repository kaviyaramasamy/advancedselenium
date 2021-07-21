package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'confirm')]")).click();
		Thread.sleep(2000);
	    Alert confirm=driver.switchTo().alert();
	    String confirmpopup=confirm.getText();
	    System.out.println(confirmpopup);
	    confirm.accept();
	    String text=driver.findElement(By.id("demo")).getText();
	    System.out.println(text);

	}

}
