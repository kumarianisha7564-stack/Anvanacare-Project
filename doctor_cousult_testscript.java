package Doctor_consults;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class doctor_cousult_testscript {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	driver.get("https://anvnacare.alwaysdata.net/");
	Thread.sleep(3000);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	// Click on Login
	WebElement LoginLink = driver.findElement(By.id("navLogin"));
	LoginLink.click();
	System.out.println("click on Login");
	Thread.sleep(2000);
	// click on patients
	// driver.findElement(By.id("patientTab")).click();
	// Thread.sleep(2000);
	driver.findElement(By.name("email")).sendKeys("Kumarianisha7564@gmail.com");
	Thread.sleep(2000);

	driver.findElement(By.name("password")).sendKeys("Anisha@123");
	Thread.sleep(2000);

	// WebElement forgotpasswordLink = driver.findElement(By.linkText(" Forgot
	// Password"));
	// forgotpasswordLink.click();

	driver.findElement(By.name("remember")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Sign In']")).click();
	System.out.println("sign in successfully");
	Thread.sleep(2000);

	driver.findElement(By.linkText("Consult Doctors")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("bookBtn-2")).click();
	System.out.println("book appointment");
	Thread.sleep(2000);

	driver.findElement(By.name("date")).sendKeys("10/07/2026");
	System.out.println("book appointment");
	Thread.sleep(2000);

 WebElement time =driver.findElement(By.name("time"));
 time.sendKeys("11:00 AM");
	Thread.sleep(2000);
	

	driver.findElement(By.id("bookSlotBtn")).click();
	Thread.sleep(2000);
	
driver.quit();
}
}