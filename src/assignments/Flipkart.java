package assignments;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Forgot?']/preceding::button[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Explore')]/following::input[1]")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//a[contains(text(),'Explore')]/following::button")).click();
		Thread.sleep(7000);
	    driver.findElement(By.xpath("(//div[contains(text(),'POCO M3 ')])[1]")).click();
	    ArrayList <String> mobiles = new ArrayList <String>(driver.getWindowHandles());
	    driver.switchTo().window(mobiles.get(1));
	    String title= driver.getTitle();
	    System.out.println(title);
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	    String Name=driver.findElement(By.xpath("//span[contains(text(),'POCO M3 (Power Black, 64 GB)')]")).getText();
	    System.out.println(Name);
	    String price=driver.findElement(By.xpath("//span[contains(text(),'Review')]/following::div[5]")).getText();
	    System.out.println(price);
	    driver.findElement(By.id("pincodeInputId")).sendKeys("637017");
	    driver.findElement(By.xpath("//span[contains(text(),'Check')]")).click();
	    

	}

}
