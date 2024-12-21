package seleniumwithsrc;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class radioandselectable {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//chrome location is provided
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aiswa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//Initialize webdriver
WebDriver driver = new ChromeDriver();
//website url to be navigated
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(2000);
driver.manage().window().maximize();
WebElement Un = driver.findElement(By.xpath("//input[@name=\"username\"]"));
Un.sendKeys("Admin");
WebElement Pw = driver.findElement(By.xpath("//input[@name=\"password\"]"));
Pw.sendKeys("admin123");
WebElement Button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
Button.click();
Thread.sleep(5000);
WebElement Info = driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[6]"));
Info.click();
Thread.sleep(2000);
WebElement Femalerb = driver.findElement(By.xpath("//label[normalize-space()='Female']"));
WebElement Malerb = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
if (Femalerb.isSelected())
{
	Malerb.click();
}
else
{
	Femalerb.click();
}
Thread.sleep(2000);
WebElement Save = driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]"));
Save.click();



	}

}
