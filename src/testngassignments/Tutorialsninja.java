package testngassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tutorialsninja {
	WebDriver driver;

        @Test (priority=1)
        public void pageLoad() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		Thread.sleep(5000);
        }
        @Test (priority=2)
        public void personalInfo() {
		driver.findElement(By.id("input-firstname")).sendKeys("kaviya");
		driver.findElement(By.id("input-lastname")).sendKeys("Ramasamy");
		driver.findElement(By.id("input-email")).sendKeys("rkaviya5sangfg82@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9629145527");
        }
        @Test (priority=3)
        public void password() {
		driver.findElement(By.name("password")).sendKeys("1234567@ice90");
		driver.findElement(By.id("input-confirm")).sendKeys("1234567@ice90");
        }
        @Test (priority=4)
        public void newsletter() {
		WebElement newsletter=driver.findElement(By.name("newsletter"));
		newsletter.click();
		driver.findElement(By.name("agree")).click();
        }
        @Test (priority=5)
        public void signin() {
		driver.findElement(By.xpath("//input[@name='agree']/following::input")).click();
        }

	}

