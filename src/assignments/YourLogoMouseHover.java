package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class YourLogoMouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	    WebElement pick=driver.findElement(By.xpath("//div[@id='columns']/preceding::a[5]"));
	    Actions act=new Actions(driver);
	    act.moveToElement(pick).build().perform();
	    driver.findElement(By.xpath("(//div[@id='columns']/preceding::a[5])/following::a[3]")).click();
	    Select Chose=new Select(driver.findElement(By.id("selectProductSort")));
	    Chose.selectByVisibleText("In stock");
	}

}
