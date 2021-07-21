package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffMail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[1]")).sendKeys("GandhiMathi");
		driver.findElement(By.xpath("//td[contains(text(),'Choose a Rediffmail ID')]/following::input[1]")).sendKeys("lemonjuicejack12");
		driver.findElement(By.xpath("//td[contains(text(),'Choose a Rediffmail ID')]/following::input[2]")).click();
		driver.findElement(By.xpath("//td[contains(text(),'Alternate')]/preceding::input[2]")).sendKeys("Icecream@13");
		driver.findElement(By.xpath("//td[contains(text(),'Alternate')]/preceding::input[1]")).sendKeys("Icecream@13");
		driver.findElement(By.xpath("//td[contains(text(),'Alternate')]/following::input[1]")).sendKeys("tommyhilgfer1@gmail.com");
		driver.findElement(By.xpath("//td[contains(text(),'Date')]/preceding::input[1]")).sendKeys("9994423779");
		Select date=new Select(driver.findElement(By.xpath("//td[contains(text(),'Date')]/following::select[1]")));
		date.selectByVisibleText("05");
		Select month=new Select(driver.findElement(By.xpath("//td[contains(text(),'Date')]/following::select[2]")));
		month.selectByVisibleText("FEB");
		Select year=new Select(driver.findElement(By.xpath("//td[contains(text(),'Date')]/following::select[3]")));
		year.selectByVisibleText("2007");
		WebElement gender=driver.findElement(By.xpath("//td[contains(text(),'Gender')]/following::input[2]"));
		gender.click();
		Select country=new Select(driver.findElement(By.xpath("//td[contains(text(),'I live in')]/following::select[1]")));
		country.selectByVisibleText("India");
		Select city=new Select(driver.findElement(By.xpath("//td[text()='City  ']/following::select")));
		city.selectByVisibleText("Tiruchirapalli");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='Register']")).click();
	}

}
