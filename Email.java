package Assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		// To set the property of the system
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\SeleniumAutomation\\Roli\\src\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		//To Manage and Maximize windows
		driver.manage().window().maximize();
		
		//To Ensure cookies does not disturb the test
		driver.manage().deleteAllCookies();
		
		//To Login to yahoo mail
		driver.get("https://login.yahoo.com/");
		
		//To give the system some seconds to load
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//To input user email
		driver.findElement(By.id("login-username")).sendKeys("godsplancrypto@yahoo.com");
		//To click on the next button
		driver.findElement(By.xpath("//*[@id=\'login-signin\']")).click();
		//To input user password
		driver.findElement(By.xpath("//*[@id=\'login-passwd\']")).sendKeys("Benize@10");
		//To click on the next button
		driver.findElement(By.xpath("//*[@id=\'login-signin\']")).click();
		
		// To click on email icon
		driver.findElement(By.xpath("//*[@id=\'root_1\']")).click();
		
		//To click on compose button
		driver.findElement(By.xpath("//*[@id=\'app\']/div[2]/div/div[1]/nav/div/div[1]/a")).click();
		
		//To input the receiver email address
		driver.findElement(By.xpath("//*[@id=\'message-to-field\']")).sendKeys("godsplancrypto@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\'mail-app-component\']/div/div/div/div[1]/div[3]/div/div/input")).sendKeys("hi");
		driver.findElement(By.xpath("//*[@id=\'editor-container\']/div[1]/div")).sendKeys("Automation test");
		driver.findElement(By.xpath("//*[@id=\'mail-app-component\']/div/div/div/div[2]/div[2]/div/button")).click();
		
		 
		
	
	
	
	
	
	
	}

}
