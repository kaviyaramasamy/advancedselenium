package testngassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PetStore {
	WebDriver driver;
	    @Test (priority=1)
	    public void pageLoad() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.manage().window().maximize();
	    }
	    @Test (priority=2)
	    public void userInfo() {
		driver.findElement(By.name("username")).sendKeys("saroja");
		driver.findElement(By.name("password")).sendKeys("Mango@123");
		driver.findElement(By.xpath("//td[contains(text(),'Repeat')]/following::input[1]")).sendKeys("Mango@123");
	    }
	    @Test (priority=3)
	    public void accountInfo() {
		driver.findElement(By.xpath("//td[contains(text(),'Last name:')]/preceding::input[1]")).sendKeys("Kaviya");
		driver.findElement(By.name("account.lastName")).sendKeys("Baskar");
		driver.findElement(By.name("account.email")).sendKeys("jackfruit01itsumek12@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("9876543290");
		driver.findElement(By.name("account.address1")).sendKeys("1/115,mohanur");
		driver.findElement(By.xpath("//input[@name='account.address2']")).sendKeys("206,Thanganagar");
		driver.findElement(By.xpath("//td[contains(text(),'City:')]/following::input[1]")).sendKeys("Chennai");
		driver.findElement(By.name("account.state")).sendKeys("goa");
		driver.findElement(By.name("account.zip")).sendKeys("675644");
		driver.findElement(By.name("account.country")).sendKeys("India");
	    }
	    @Test (priority=4)
	    public void personalInfo() {
		Select language=new Select(driver.findElement(By.xpath("//td[contains(text(),'Language')]/following::select[1]")));
		language.selectByVisibleText("japanese");
		Select favourite=new Select(driver.findElement(By.xpath("//td[contains(text(),'Favourite')]/following::select[1]")));
		favourite.selectByVisibleText("BIRDS");
		driver.findElement(By.name("account.listOption")).click();
		driver.findElement(By.name("account.bannerOption")).click();
		driver.findElement(By.name("newAccount")).click();
		driver.close();
	    }

	}

