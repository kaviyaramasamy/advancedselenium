package testngFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerificationCommands {
	WebDriver driver;
	
    @Test 
    public void a_pageLoad() {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
    }
    @Test
    public void b_radioButton() {
    WebElement roundtrip=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
    roundtrip.click();
    System.out.println(roundtrip.isEnabled());
    }
    @Test
    public void c_checkbox() throws InterruptedException {
    WebElement student=driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
    student.click();
    Thread.sleep(2000);
    System.out.println(student.isSelected());
    }
    @Test
    public void d_text() {
    System.out.println(driver.findElement(By.id("ctl00_HyperLinkLogin")).isDisplayed());	
    }
}
