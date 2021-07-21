package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YourLogo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("nalanbasky20@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(5000);
		WebElement gender=driver.findElement(By.id("id_gender2"));	
		gender.click();
		driver.findElement(By.id("customer_firstname")).sendKeys("kaviya");
		driver.findElement(By.id("customer_lastname")).sendKeys("baskar");
		driver.findElement(By.id("passwd")).sendKeys("Nandhini@123");
		Select date=new Select(driver.findElement(By.id("days")));
		date.selectByVisibleText("15  ");
		Select month=new Select(driver.findElement(By.id("months")));
		month.selectByVisibleText("March ");
		Select year=new Select(driver.findElement(By.id("years")));
		year.selectByVisibleText("2019  ");
		WebElement sign=driver.findElement(By.id("newsletter"));
		sign.click();
		driver.findElement(By.id("firstname")).sendKeys("sandhiya");
		driver.findElement(By.id("lastname")).sendKeys("ramasamy");
		driver.findElement(By.id("address1")).sendKeys("1/118,Anbhu Nagar");
		driver.findElement(By.id("city")).sendKeys("Namakkal");
		Select state=new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("Florida");
		driver.findElement(By.id("postcode")).sendKeys("12345");
		driver.findElement(By.id("phone_mobile")).sendKeys("9876543234");
		driver.findElement(By.id("submitAccount")).click();
	}

}
