package testcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
@Test
	public void runLogin(){
		// Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		// Launch the URL
		driver.get("https://live-uat.d2l5ex60a7etci.amplifyapp.com/rfp");
		// Maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// 1. Enter the Email Address
		driver.findElement(By.xpath("//input[@label='Email']")).sendKeys("sankar.govindharaj@qeagle.com");
		// 2.Enter the Password
		driver.findElement(By.xpath("//input[@label='Password']")).sendKeys("Qeagle@123");
		// 3. Click on the "Login" button
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}

}
