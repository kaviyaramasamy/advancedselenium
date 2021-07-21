package testngFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	WebDriver driver;
	@Test
	public void a_pageLoad() {
        System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
	}
    @Test
    public void b_assertEquals() {
    String element=driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
    System.out.println(element);
    Assert.assertEquals(element, "ONLINE BANKING");
    System.out.println("AssertEquals pass");
    }
    @Test
    public void c_assertnotequals() {
    String element=driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
    Assert.assertNotEquals(element, "online banking");
    System.out.println("Assertnotequals pass");
    }
    @Test
    public void d_assertTrue() {
    Assert.assertTrue("ONLINE BANKING".equals(driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText()));
    System.out.println("Asserttrue pass");
    }
    @Test
    public void e_assertfalse() {
    String element=driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
    Assert.assertFalse("Online Banking".equals(element));
    System.out.println("AssertFalse pass");
    }
    @Test
    public void f_assertnotnull() {
    Object obj=driver.getTitle();
    Assert.assertNotNull(obj);
    System.out.println("Assertnotnull pass");
    }
    @Test
    public void g_assertnull() {
    Object obj=null;
    Assert.assertNull(obj);
    System.out.println("Assertnull pass");
    }
}
