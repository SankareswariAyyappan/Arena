package chatbot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChatBotFunctionality {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		// Launch the URL
		driver.get("https://live-uat.d2l5ex60a7etci.amplifyapp.com/rfp");
		// Maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// To open a ChatBot
		driver.switchTo().frame("launcher");
		driver.findElement(By.xpath("//div[contains(@class,'sc-1q9fwvy-0 gHHEeh')]")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("Messaging window");
		// driver.findElement(By.xpath("//button[@aria-label=\"Options// menu\"]")).click();
		driver.findElement(By.xpath("//textarea[@placeholder=\"Type a message\"]")).sendKeys("HI");
		driver.findElement(By.xpath("//button[@aria-label=\"Send message\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='ArenaCX Chat Support']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='Options menu']")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @class='StyledToggleSvg-sc-162xbyx-0 iSdMcd']")).click();
		//driver.findElement(By.xpath("//button[@aria-label='Upload file']")).click();
		driver.findElement(By.xpath("//input[@type='file' and @class='sc-fcxw62-0 kGDiPU']")).sendKeys("D:\\ArenaCX\\Manual.xls");

	}

}
