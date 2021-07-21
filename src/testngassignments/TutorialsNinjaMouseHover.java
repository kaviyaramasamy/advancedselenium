package testngassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TutorialsNinjaMouseHover {
	WebDriver driver;
	
    @Test 
    public void a_pageLoad() {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
    }	
    @Test  
    public void b_mac() throws InterruptedException {
    Thread.sleep(5000);	
    WebElement find=driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"));
    Actions pick=new Actions(driver);
    pick.moveToElement(find).build().perform();
    Thread.sleep(9000);
    driver.findElement(By.xpath("//a[contains(text(),'Mac (1)')]")).click();
    }
    @Test
    public void c_addToCart() throws InterruptedException {
    driver.findElement(By.xpath("//span[contains(text(),'Add')]")).click();
    Thread.sleep(2000);
    }
    @Test
    public void d_text() {
    String print=driver.findElement(By.xpath("//aside[@id='column-left']/preceding::div[1]")).getText();
    System.out.println(print);
    }
    @Test
    public void e_removeFromCart() {
    driver.findElement(By.id("cart-total")).click();
    driver.findElement(By.xpath("//strong[contains(text(),'View')]/preceding::button[1]")).click();
    }

}
