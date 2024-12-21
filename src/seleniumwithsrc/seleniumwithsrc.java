package seleniumwithsrc;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class seleniumwithsrc {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//chrome location is provided
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aiswa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//Initialize webdriver
WebDriver driver = new ChromeDriver();
//website url to be navigated
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(2000);
//Maximize window
driver.manage().window().maximize();
WebElement Un = driver.findElement(By.xpath("//input[@name=\"username\"]"));
Un.sendKeys("Admin");
WebElement Pw = driver.findElement(By.xpath("//input[@name=\"password\"]"));
Pw.sendKeys("admin123");
Thread.sleep(5000);
// Take Screenshot and save it in folder
WebElement Button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
TakesScreenshot SS = (TakesScreenshot) driver;
File Source = SS.getScreenshotAs(OutputType.FILE);
File Dest = new File("D:\\Screenprint\\s1.png");
FileUtils.copyFile(Source, Dest);
Button.click();
Thread.sleep(5000);
File Source1 = SS.getScreenshotAs(OutputType.FILE);
File Dest1 = new File("D:\\Screenprint\\s2.png");
FileUtils.copyFile(Source1, Dest1);

Thread.sleep(10000);
//Finding element in an array
WebElement Bz = driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]"));
Bz.click();
Thread.sleep(5000);
WebElement Bzfd = driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
Bzfd.sendKeys("Aiswarya");
WebElement Post = driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main\"]"));
Post.click();
// Back Navigation and Refresh
driver.navigate().back();
driver.navigate().refresh();
//Closing the web browser
driver.quit();
	}

}
