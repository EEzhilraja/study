package Commpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commulogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
	
	
	driver.manage().window().maximize();
	
	driver.get("https://dev.commusoft.co.uk");
	
	Thread.sleep(3000);

	driver.findElement(By.xpath("//*[@id='logintype_clientid']")).sendKeys("18193");
	driver.findElement(By.id("logintype_username")).sendKeys("archana");
	driver.findElement	(By.id("logintype_password")).sendKeys("demo123");
	driver.findElement(By.xpath("//*[@id='successful-login']")).click();
	
	
	
	}

}
