package testngFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
	WebDriver driver;
	@Test
	public void a_pageLoad() {
        System.setProperty("webdriver.chrome.driver","E:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void b_googlesearch() throws InterruptedException{
		driver.findElement(By.name("q")).sendKeys("sachin Tedulkar");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		//Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'Sachin Tendulkar - Wikipedia')]")));
		driver.findElement(By.xpath("//h3[contains(text(),'Sachin Tendulkar - Wikipedia')]")).click();
	}
}
