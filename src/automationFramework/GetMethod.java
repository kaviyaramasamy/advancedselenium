package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
 		String Pagetitle=driver.getTitle();
 		System.out.println(Pagetitle);
 		String pageurl=driver.getCurrentUrl();
 		System.out.println(pageurl);
 		String tagname=driver.findElement(By.id("searchTerm")).getTagName();
 		System.out.println(tagname);
 		String tagname1=driver.findElement(By.xpath("//strong[contains(text(),'Online')]")).getTagName();
 		System.out.println(tagname1);
 		String attributes=driver.findElement(By.id("searchTerm")).getAttribute("placeholder");
 		System.out.println(attributes);
 		String cssvalue=driver.findElement(By.id("searchTerm")).getCssValue("font-family");
 		System.out.println(cssvalue);
 		String text=driver.findElement(By.xpath("//strong[contains(text(),'Online')]")).getText();
 		System.out.println(text);
 		String pragraph=driver.findElement(By.xpath("(//p[starts-with(text(),'Use Zero')])[1]")).getText();
 		System.out.println(pragraph);
 		driver.close();
	}

}
