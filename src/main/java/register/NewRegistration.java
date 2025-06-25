package register;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewRegistration {
	public static void main(String[] args) throws InterruptedException {
		//Launch the Browser
				ChromeDriver driver=new ChromeDriver();
				//Launch the URL
				driver.get("https://live-uat.d2l5ex60a7etci.amplifyapp.com/rfp");
				//Maximize the window
				driver.manage().window().maximize();
				//add  implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//3. Click on "Register" button
				driver.findElement(By.xpath("//span[text()='Register']")).click();
				//Register an Account 
				//1. Enter First Name
				driver.findElement(By.id("firstName")).sendKeys("sankareswari");
				//2. Enter Last Name
				driver.findElement(By.id("lastName")).sendKeys("Ayyappan");
				//3.Enter Email Address
				driver.findElement(By.id("email")).sendKeys("sankareswari@gmail.com");
				//4. Enter Job Title
				driver.findElement(By.id("jobTitle")).sendKeys("Intern");
				//5. Enter Phone Number
				driver.findElement(By.id("phone")).sendKeys("3851");
				//6. Enter Company Name
				driver.findElement(By.id("company")).sendKeys("Qeagle");
				//7. Enter Website URL
				driver.findElement(By.id("website")).sendKeys("qeagle.com");
				//8. Select anyone option in the Industry dropdown
				driver.findElement(By.xpath("//span[text()='Industry']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[text()='Banking']")).click();
				//9. Click on "I have read and accept the ArenaCX terms and Conditions" checkbox
				driver.findElement(By.className("p-checkbox-box")).click();
				//10. Click on "Continue Registration"
				driver.findElement(By.xpath("//span[text()='Continue Registration']")).click();
				Thread.sleep(2000);
				//Create Secure Password
				//11.Enter Password
				driver.findElement(By.xpath("//input[@label='Password']")).sendKeys("Sankari@12");
				//12.Enter Confirm Password
				driver.findElement(By.xpath("//input[@label='Confirm Password']")).sendKeys("Sankari@12");
				//13.click on "Complete Registration"
				driver.findElement(By.xpath("//span[text()='Complete Registration']")).click();
	}

}
