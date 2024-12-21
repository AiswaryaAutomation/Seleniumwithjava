package seleniumwithsrc;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//chrome location is provided
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aiswa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//Initialize webdriver
		WebDriver driver = new ChromeDriver();
		//website url to be navigated
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//Multiple windows handling
		WebElement Ins = driver.findElement(By.xpath("//a[normalize-space()='Instagram']"));
		Ins.click();
		Thread.sleep(3000);
		//parent tab id
		System.out.println(driver.getWindowHandle());
		//parent and child tab id's
		System.out.println(driver.getWindowHandles());
		//storing parent id in pw
		String pw = driver.getWindowHandle();
		//storing multiple id in mw as string
		Set<String> mw = driver.getWindowHandles();
		//assigned multiple window id's in element a
		for(String a:mw)
		{
			if(!(pw.equals(a)))
			{
				driver.switchTo().window(a);
			}
		}
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Aishu");
			}
			

	}

