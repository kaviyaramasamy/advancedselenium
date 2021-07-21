package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimilarElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Sachin_Tendulkar");
		driver.manage().window().maximize();
		int linkscount=driver.findElements(By.tagName("a")).size();
		System.out.println(linkscount);
		int image=driver.findElements(By.tagName("img")).size();
		System.out.println(image);
		driver.close();

	}

}
