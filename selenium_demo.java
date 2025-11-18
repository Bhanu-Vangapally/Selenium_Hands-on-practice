package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_1_hl")).sendKeys("vangapallybhanu@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("globalContainer")).sendKeys("16548");
		Thread.sleep(3000);
	}

}
