package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabAddProduct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("remove-sauce-labs-backpack")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("first-name")).sendKeys("Kaviya");
		driver.findElement(By.id("last-name")).sendKeys("Ramasamy");
		driver.findElement(By.id("postal-code")).sendKeys("637017");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Finish')]")).click();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String Text=driver.findElement(By.xpath("//h2[contains(text(),'THANK')]")).getText();
		System.out.println(Text);
		String tag=driver.findElement(By.xpath("//h2[contains(text(),'THANK')]/following::img[1]")).getTagName();
		System.out.println(tag);
		String css=driver.findElement(By.xpath("//h2[contains(text(),'THANK')]/following::img[1]")).getCssValue("margin");
		System.out.println(css);
		String Attribute=driver.findElement(By.id("back-to-products")).getAttribute("class");
		System.out.println(Attribute);
				

	}

}
