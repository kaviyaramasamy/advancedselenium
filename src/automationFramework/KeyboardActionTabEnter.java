package automationFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionTabEnter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("rkaviyasandhiya02@gmail.com");
		Actions act= new Actions(driver);
		act.sendKeys(Keys.TAB,"Afygfukeytg@12").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		
		
		

	}

}
