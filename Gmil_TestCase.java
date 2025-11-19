package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Gmail_Exm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get("http://www.gmail.com");
		d1.manage().window().maximize();
		d1.findElement(By.id("identifierId")).sendKeys("bhanu@gmail.com");
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(d1, Duration.ofSeconds(10));

		WebElement nextBtn = wait.until(ExpectedConditions.elementToBeClickable(
		    By.xpath("//button[.//span[text()='Next']]")
		));
		Thread.sleep(3000);
		String st=d1.getTitle();
		String et="gmail";
		System.out.println(st);
		d1.close();
		if(st.equalsIgnoreCase(et)) {
			System.out.println("Test Sucessfull");
		}else {
			System.out.println("Test Failure");
		}
		
	}

}
