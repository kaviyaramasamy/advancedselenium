package testngassignments;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipkartTestNg {
WebDriver driver;
     @Test 
     public void a_pageLoad() {
     System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
     driver=new ChromeDriver();
     driver.get("https://www.flipkart.com/");
     driver.manage().window().maximize();
     }	
     @Test
     public void b_closeLogin() {
     driver.findElement(By.xpath("//span[text()='Forgot?']/preceding::button[1]")).click();
     }
     @Test 
     public void c_searchMobile() throws InterruptedException {
  	 driver.findElement(By.xpath("//a[contains(text(),'Explore')]/following::input[1]")).sendKeys("Redmi");
  	 Actions act=new Actions(driver);
  	 act.sendKeys(Keys.ENTER).build().perform();
  	 Thread.sleep(5000);
     }
     @Test
     public void d_selectitem() {
     driver.findElement(By.xpath("(//div[contains(text(),'SonicBass')])[1]")).click();
     }
     @Test
     public void e_switchTab() {
     ArrayList<String> change=new ArrayList<String>(driver.getWindowHandles());
     driver.switchTo().window(change.get(1));
     }
     @Test
     public void f_productDetails() { 
     String title=driver.getTitle();
     System.out.println(title);
     String url=driver.getCurrentUrl();
     System.out.println(url);
     String name=driver.findElement(By.xpath("//span[contains(text(),'SonicBass')]")).getText();
     System.out.println(name);
     String price=driver.findElement(By.xpath("//div[contains(text(),'Available')]/preceding::div[4]")).getText();
     System.out.println(price);
     }

}
