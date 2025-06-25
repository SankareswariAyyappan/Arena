package create_rfp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewRfp {

	public static void main(String[] args) throws InterruptedException {
		//Launch the Browser
				ChromeDriver driver=new ChromeDriver();
				//Launch the URL
				driver.get("https://live-uat.d2l5ex60a7etci.amplifyapp.com/rfp");
				//Maximize the window
				driver.manage().window().maximize();
				//add  implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//1. Enter the Email Address
				driver.findElement(By.xpath("//input[@label='Email']")).sendKeys("sankar.govindharaj@qeagle.com");
				//2.Enter the Password 
				driver.findElement(By.xpath("//input[@label='Password']")).sendKeys("Qeagle@123");
				//3. Click on the "Login" button
				WebElement Loginbt = driver.findElement(By.xpath("//span[text()='Login']"));
				driver.executeScript("arguments[0].click();",Loginbt);
				//Click on the "Start a new RFP" button
				WebElement newRfpElement = driver.findElement(By.xpath("//span[text()='Start a New RFP']"));
				driver.executeScript("arguments[0].click();",newRfpElement );
				//1. Click on the "Talent RFP" checkbox
				WebElement TalentRFP = driver.findElement(By.xpath("//h4[text()='Talent RFP']"));
				driver.executeScript("arguments[0].click();",TalentRFP );
				Thread.sleep(3000);
				//2. Click on the "Next Service Needed" button
				WebElement nextservice = driver.findElement(By.xpath("//span[text()='Next: Service Needed']"));
				driver.executeScript("arguments[0].click();",nextservice);
				//1. Click on anyone option in "Pick The Industry For Your RFP" dropdown list
				WebElement industry = driver.findElement(By.xpath("//span[text()='Select industry']"));
				driver.executeScript("arguments[0].click();",industry );
				WebElement industryDD = driver.findElement(By.xpath("//li[text()='Energy: Other']"));
				driver.executeScript("arguments[0].click();",industryDD);
				Thread.sleep(3000);
				//2. Click on anyone option in "Pick The Service For Your RFP" dropdown list
				WebElement service = driver.findElement(By.xpath("//span[text()='Select a Service']"));
				driver.executeScript("arguments[0].click();",service);
				WebElement serviceDD = driver.findElement(By.xpath("//div[text()='Administrative']"));
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf(serviceDD));
				driver.executeScript("arguments[0].click();",serviceDD);
				Thread.sleep(2000);
				//3. Click on the "Next Buisness Requirements" button 
				WebElement nestbuisness = driver.findElement(By.xpath("//span[text()='Next: Discovery Questions']"));
				driver.executeScript("arguments[0].click();",nestbuisness);
			//1. What geographical markets will be served by this campaign?
			WebElement geolocation = driver.findElement(By.xpath("(//div[text()='elect option'])[1]"));
			driver.executeScript("arguments[0].click();",geolocation);
			WebElement geolocationDD = driver.findElement(By.xpath("//span[text()='Europe']"));
			driver.executeScript("arguments[0].click();",geolocationDD);
			driver.findElement(By.xpath("//span[text()='Asia Pacific']")).click();
			driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
			//2. What is the expected duration of this campaign?
			WebElement duartion = driver.findElement(By.xpath("(//span[text()='Select option'])[1]"));
			driver.executeScript("arguments[0].click();",duartion);
			driver.findElement(By.xpath("//li[text()='Less than 30 days']")).click();
			//3. Who will provide the technology on this campaign?
			WebElement tech = driver.findElement(By.xpath("(//span[text()='Select option'])[1]"));
			driver.executeScript("arguments[0].click();",tech);
			driver.findElement(By.xpath("//li[text()='Client provided']")).click();
			//4. What technologies will be used on this campaign?
			WebElement technology = driver.findElement(By.xpath("(//div[text()='elect option'])[1]"));
			driver.executeScript("arguments[0].click();",technology);
			driver.findElement(By.xpath("//span[text()='Atlassian']")).click();
			driver.findElement(By.xpath("//span[text()='Cisco']")).click();
			driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
			//5. What time zone(s) apply to this campaign?
			WebElement timezone = driver.findElement(By.xpath("(//div[text()='elect option'])[1]"));
			driver.executeScript("arguments[0].click();",timezone);
			driver.findElement(By.xpath("//span[text()='Asia/Singapore (8)']")).click();
			WebElement eleclosebt = driver.findElement(By.xpath("//button[@class='p-multiselect-close p-link']"));
			driver.executeScript("arguments[0].click();",eleclosebt);
			//6. Who will manage the talent?
			WebElement manage = driver.findElement(By.xpath("(//span[text()='Select option'])[1]"));
			driver.executeScript("arguments[0].click();",manage);
			driver.findElement(By.xpath("//li[text()='Client']")).click();
			//7. Who will provide training?
			WebElement training = driver.findElement(By.xpath("(//span[text()='Select option'])[1]"));
			driver.executeScript("arguments[0].click();",training);
			driver.findElement(By.xpath("//li[text()='Outsourcing partner provided']")).click();
			//8. How long will training take?
			driver.findElement(By.xpath("//input[@placeholder='Enter here...']")).sendKeys("30days");
			//9. What format will training take?
			WebElement trainingtype = driver.findElement(By.xpath("(//span[text()='Select option'])[1]"));
			driver.executeScript("arguments[0].click();",trainingtype);
			driver.findElement(By.xpath("//li[text()='Hybrid']")).click();
			//10. Is remote work acceptable for this engagement?
			WebElement remote = driver.findElement(By.xpath("(//span[text()='Select option'])[1]"));
			driver.executeScript("arguments[0].click();",remote);
			driver.findElement(By.xpath("//li[text()='Yes']")).click();
			//11. What staffing model is required?
			WebElement staffing = driver.findElement(By.xpath("(//span[text()='Select option'])[1]"));
			driver.executeScript("arguments[0].click();",staffing);
			driver.findElement(By.xpath("//li[text()='Dedicated agents are required']")).click();
			//12. When should your new agents go live?
			driver.findElement(By.xpath("//input[@placeholder='Select Date']")).click();
			driver.findElement(By.xpath("//table[@class=\"p-datepicker-calendar\"]/tbody/tr[5]/td[6]")).click();
			//13. Which hours of operation do you need?
			WebElement hours = driver.findElement(By.xpath("(//span[text()='Select option'])[1]"));
			driver.executeScript("arguments[0].click();",hours);
			driver.findElement(By.xpath("//li[text()='7 Days - Business Hours']")).click();
			//click on "Next: Title & Description"
			driver.findElement(By.xpath("//span[text()='Next: Title & Description']")).click();
			 String step4 = driver.findElement(By.xpath("//h4[text()='Step 4 of 7']")).getText();
			    if(step4.contains("Step 4 of 7")) {
			    	System.out.println("Step3 finished successfully");
			    }else {
			    	System.out.println("Plz fill the mandatory fields in step3");
			    }
			    Thread.sleep(2000);
			//Step Four: Give a name, description and upload links and files to your RFP
			//Write a Title For Your RFP
			driver.findElement(By.xpath("//input[@name='rfpTitle']")).sendKeys("Request for Proposal (RFP) for Outsourcing Services");
			Thread.sleep(2000);
			//Add A Detailed Description
			driver.findElement(By.xpath("(//span[contains(@style,'background-color: yellow')])[23]")).clear();
			driver.findElement(By.xpath("(//span[contains(@style,'color: rgb(13, 13, 13)')])[52]")).sendKeys("12345");
			//Attach any links & files that will help the vendor understand your needs.
			driver.findElement(By.xpath("//a[text()='+ Add'][1]")).click();
			driver.findElement(By.xpath("//input[@name=\"link\"]")).sendKeys("https://live-uat.d2l5ex60a7etci.amplifyapp.com/rfp");
			driver.findElement(By.xpath("//input[@name=\"notes\"]")).sendKeys("ArenaCX");
			driver.findElement(By.xpath("//button[@aria-label=\"Save\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[text()='+ Add'])[2]")).click();
			driver.findElement(By.xpath("//input[@name=\"file\"]")).sendKeys("ArenaCX testcases");
			driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("D:\\ArenaCX\\Manual.xls");
			driver.findElement(By.xpath("//span[text()='Upload']")).click();	
			Thread.sleep(2000);
			WebElement next4 = driver.findElement(By.xpath("//button[text()='Next: Providers']"));
			driver.executeScript("arguments[0].click();",next4);
			Thread.sleep(5000);
			//driver.findElement(By.xpath("//input[@placeholder=\"# of Agents...\"][1]")).sendKeys("100");
			WebElement agents = driver.findElement(By.xpath("//input[@role='spinbutton']"));
			driver.executeScript("arguments[0].value='100';", agents);
			WebElement country = driver.findElement(By.xpath("//div[@role=\"button\"]]"));
			driver.executeScript("arguments[0].click();",country);
			
	}
}
