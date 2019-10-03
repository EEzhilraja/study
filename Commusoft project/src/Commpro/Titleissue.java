package Commpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titleissue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver =new ChromeDriver();
		
	driver.manage().window().maximize();
	
	driver.get("https://dev.commusoft.co.uk");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='logintype_clientid']")).sendKeys("18193");
	driver.findElement(By.id("logintype_username")).sendKeys("archana");
	driver.findElement	(By.id("logintype_password")).sendKeys("demo123");
	driver.findElement(By.xpath("//*[@id='successful-login']")).click();
	
	Thread.sleep(3000);
	// Click the "Total number of customers:" link in home screen;
	//driver.findElement(By.xpath("//*[@id=\'main\']/div[2]/div/section/div/div/div[2]/div[1]/div[2]/div/div[1]/div/a[1]")).click();
	//Thread.sleep(2000);
	
	driver.findElement(By.id("customertypecompany")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("company_contacts_companyname")).sendKeys("Compauto1");
	Thread.sleep(1000);
	driver.findElement(By.id("company_addressline1")).sendKeys("Comauto Address1");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/section/div/div/section/form/div/button")).click();
	
	//Click the View link in customer screen; 
	//driver.findElement(By.xpath("(//a[@id ='Name'])[7]")).click();
	
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"editcustomer\"]/span")).click();
	
	Thread.sleep(2000);
	boolean isDisplayed = driver.findElement(By.xpath("//label[text()= 'Title']")).isDisplayed();
	
	if(isDisplayed) {
		System.out.println("Element is Displayed");
		}else{
		System.out.println("Element is not Displayed");
		}
	
	
	}

}
