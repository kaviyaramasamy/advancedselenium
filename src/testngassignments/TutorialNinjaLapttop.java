package testngassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TutorialNinjaLapttop {
WebDriver driver;
	
    @Test 
    public void a_pageLoad() {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
    }	
    @Test
    public void b_search() throws InterruptedException {
    driver.findElement(By.name("search")).sendKeys("laptop");
    Actions act=new Actions(driver);
    act.sendKeys(Keys.ENTER).build().perform();
    Thread.sleep(3000);
    }
    @Test
    public void c_title() {
    String title=driver.getTitle();
    System.out.println(title);
    }
    @Test
    public void d_url() {
    String url= driver.getCurrentUrl();
    System.out.println(url);
    }
    @Test
    public void e_text() {
    String text=driver.findElement(By.xpath("//h1[contains(text(),'laptop')]")).getText();
    System.out.println(text);
    }
    @Test
    public void f_starttag() {
    String tagname=driver.findElement(By.xpath("//h1[contains(text(),'laptop')]")).getTagName();
    System.out.println(tagname);
    }
    @Test
    public void g_attribute() {
    String attribute=driver.findElement(By.name("category_id")).getAttribute("form-control");
    System.out.println(attribute);
    }
    @Test
    public void h_cssvalue() {
    String css=driver.findElement(By.name("category_id")).getCssValue("display");
    System.out.println(css);
    }
}