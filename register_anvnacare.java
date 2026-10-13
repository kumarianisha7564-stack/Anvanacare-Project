package anvnacare_register;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class register_anvnacare {
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
			driver.findElement(By.name("email")).sendKeys("kumarianisha7564@gmail.com");
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

	// click on register
	WebElement registerLink = driver.findElement(By.linkText("Register Here"));
	registerLink.click();
	System.out.println("register successfully");
	Thread.sleep(2000);

	driver.findElement(By.id("nameInput")).sendKeys("Anisha");
	Thread.sleep(2000);

	driver.findElement(By.name("email")).sendKeys("kumarianisha7564@gmail.com");
	Thread.sleep(2000);

	driver.findElement(By.name("phone")).sendKeys("8084450883");
	Thread.sleep(2000);

	driver.findElement(By.name("password")).sendKeys("Anisha@123");
	Thread.sleep(2000);

	driver.findElement(By.name("terms")).click();
	Thread.sleep(2000);

	driver.findElement(By.id("submitBtnText")).click();
	System.out.println("create account  successfully");
	Thread.sleep(2000);

driver.quit();
}
}
