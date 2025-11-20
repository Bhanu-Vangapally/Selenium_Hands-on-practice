package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Yahoo_exm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.manage().deleteAllCookies();
//		d1.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//		d1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		d1.get("http://login.yahoo.com");
		d1.findElement(By.id("login-username")).sendKeys("bhanu@gmail.com");
		Thread.sleep(3000);
		d1.findElement(By.xpath("//input[@id='login-signin']")).click();
		
	}

}
