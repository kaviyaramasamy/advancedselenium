package testngassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Medical {
	WebDriver driver;
    @Test 
    public void a_pageLoad() {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
    driver=new ChromeDriver();
	driver.get("https://demo.openmrs.org/openmrs/login.htm");
	driver.manage().window().maximize();
    }
    @Test
    public void b_logIn() {
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.id("password")).sendKeys("Admin123");
    driver.findElement(By.id("Pharmacy")).click();
    driver.findElement(By.id("loginButton")).click();
    }
    @Test
    public void c_register() {
    driver.findElement(By.xpath("//h4[contains(text(),'Super')]/following::a[3]")).click();	
    }
    @Test
    public void d_name() {
    driver.findElement(By.name("givenName")).sendKeys("Rahesh");
    driver.findElement(By.name("middleName")).sendKeys("Malliga");
   	driver.findElement(By.name("familyName")).sendKeys("Nalan");
   	driver.findElement(By.id("next-button")).click();
    }
    @Test
    public void e_gender() {
    driver.findElement(By.xpath("//option[text()='Female']")).click();
    driver.findElement(By.id("next-button")).click();
    }
    @Test
    public void f_birthDay() {
    driver.findElement(By.id("birthdateDay-field")).sendKeys("02");
    Select month=new Select(driver.findElement(By.id("birthdateMonth-field")));
    month.selectByVisibleText("February");
    driver.findElement(By.id("birthdateYear-field")).sendKeys("1996");
    driver.findElement(By.id("next-button")).click();
    }
    @Test
    public void g_address() {
    driver.findElement(By.id("address1")).sendKeys("1/115,anbhu nagar");
    driver.findElement(By.id("address2")).sendKeys("n2-eb colony");
    driver.findElement(By.id("cityVillage")).sendKeys("Namakkal");
    driver.findElement(By.id("stateProvince")).sendKeys("TamilNadu");
    driver.findElement(By.id("country")).sendKeys("India");
    driver.findElement(By.id("postalCode")).sendKeys("627012");
    driver.findElement(By.id("next-button")).click();
    }
    @Test
    public void h_phoneNumber() {
    driver.findElement(By.name("phoneNumber")).sendKeys("9634146627");
    driver.findElement(By.id("next-button")).click();
    }
    @Test
    public void i_relatives() {
    Select name=new Select(driver.findElement(By.id("relationship_type")));
    name.selectByVisibleText("Parent");
    driver.findElement(By.xpath("//h3[contains(text(),'Who')]/following::input[1]")).sendKeys("kaviya");
    driver.findElement(By.id("next-button")).click();
    }
    @Test
    public void j_confirm() {
    driver.findElement(By.id("submit")).click();	
    }
}
