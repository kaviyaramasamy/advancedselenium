package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ouseActionRightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement right=driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		Actions act=new Actions(driver);
		act.contextClick(right).build().perform();
		driver.findElement(By.xpath("//span[text()='Cut']")).click();
		Alert aler=driver.switchTo().alert();
		String Text=aler.getText();
		System.out.println(Text);
		Thread.sleep(3000);
		aler.accept();
		
		
		
		

	}

}
