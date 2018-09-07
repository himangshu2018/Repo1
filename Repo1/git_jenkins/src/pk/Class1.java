package pk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\himesh\\Desktop\\selenium\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ripon.laskar2017@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Laskar2017");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();

	}

}
