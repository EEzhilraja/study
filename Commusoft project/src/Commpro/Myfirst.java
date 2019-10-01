package Commpro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myfirst {


public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://dev.commusoft.co.uk");
	
Thread.sleep(3000);

driver.findElement(By.xpath("//*[@id='logintype_clientid']")).sendKeys("18193");
driver.findElement(By.id("logintype_username")).sendKeys("archana");
driver.findElement	(By.id("logintype_password")).sendKeys("demo123");
driver.findElement(By.xpath("//*[@id='successful-login']")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("//*[@id=\'main\']/div[2]/div/section/div/div/div[2]/div[1]/div[2]/div/div[1]/div/a[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"Name\"]")).click();
Thread.sleep(2000);

driver.findElement(By.id("newJob")).click();
Thread.sleep(2000);
driver.findElement(By.id("job_description")).sendKeys("New job");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/span[1]/div/section/div/div/form/div[1]/button")).click();

Thread.sleep(2000);

//Below link for job view button in customer screen.
//driver.findElement(By.xpath("//*[@id=\"ongoingwork\"]/table/tbody/tr[2]/td[9]/a[4]")).click();
//Thread.sleep(3000);

//Supplier PO in cost tab.
driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[9]/a")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/span[1]/div/section/div/div/section/div/div[1]/div[2]/section/div[1]/a")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//div[@id='s2id_selectCustomer']")).click();

driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys("suy");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@class='select2-input select2-focused']")).sendKeys(Keys.ENTER);


Thread.sleep(3000);
Actions action = new Actions(driver);
action.moveToElement(driver.findElement(By.xpath("//td[@class='afterHiddenColumn firstVisibleColumn']"))).doubleClick().build().perform();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"job_item_new_purchase_order\"]/div[6]/textarea")).sendKeys("Test");
Thread.sleep(3000);
action.moveToElement(driver.findElement(By.xpath("(//td[@class='overflow_handsontable'])[4]"))).doubleClick().build().perform();
driver.findElement(By.xpath("//*[@id=\"job_item_new_purchase_order\"]/div[7]/textarea")).clear();
driver.findElement(By.xpath("//*[@id=\"job_item_new_purchase_order\"]/div[7]/textarea")).sendKeys("300");
driver.findElement(By.xpath("//*[@id=\"job_item_new_purchase_order\"]/div[7]/textarea")).sendKeys(Keys.RETURN);
Thread.sleep(3000);
action.moveToElement(driver.findElement(By.xpath("(//td[@class='overflow_handsontable current highlight'])"))).doubleClick().build().perform();
driver.findElement(By.xpath("//*[@id=\"job_item_new_purchase_order\"]/div[6]/textarea")).clear();
driver.findElement(By.xpath("//*[@id=\"job_item_new_purchase_order\"]/div[6]/textarea")).sendKeys("300");
driver.findElement(By.xpath("//*[@id=\"job_item_new_purchase_order\"]/div[6]/textarea")).sendKeys(Keys.RETURN);
Thread.sleep(3000);
action.moveToElement(driver.findElement(By.xpath("//td[@class='overflow_handsontable select_icon current highlight']"))).doubleClick().build().perform();
driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys(Keys.RETURN);
Thread.sleep(2000);
action.moveToElement(driver.findElement(By.xpath("//td[@class='overflow_handsontable select_icon afterHiddenColumn htPlaceholder current highlight']"))).doubleClick().build().perform();
driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys("parts");
driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys(Keys.ENTER);
driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/span[1]/div/section/div/div/div/form/div[3]/button")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/span[1]/div/section/div/div/section/div/div[1]/div[2]/section/div[2]/div/table/tbody/tr/td[9]/a")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/span[1]/div/section/div/div/section/div/div/div[1]/div/a[1]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/span[1]/div/section/div/div/div/form/fieldset/div[2]/div[1]/div[1]/div/input")).sendKeys("In93");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/span[1]/div/section/div/div/div/form/div[3]/button")).click();

//Invoice screen.
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[8]/a")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@class='btn btn-primary btn-small ng-scope']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/span[1]/div/section/div/div/section/ul/li[2]/a/span[1]/input")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/span[1]/div/section/div/div/form/fieldset[1]/div[2]/div[1]/div[3]/div/span[1]/a")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/span[1]/div/section/div/div/form/fieldset[1]/div[2]/div[2]/div[5]/div/select")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/span[1]/div/section/div/div/form/fieldset[1]/div[2]/div[2]/div[5]/div/select/option[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/span[1]/div/section/div/div/form/div[2]/div[1]/span[1]/a/span")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"page-panel-main\"]/div[1]/div[2]/div[2]/section/div/div/div/div[2]/div[1]/span/input")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"save-panel-btn\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/span[1]/div/section/div/div/form/div[3]/button")).click();
}
}