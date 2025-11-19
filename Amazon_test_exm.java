/**
 * 
 */
package demo;

/**
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon_Exm {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get("http://www.amazon.com");
		Thread.sleep(3000);
		d1.findElement(By.id("twotabsearchtextbox")).sendKeys("mi 11x mobile");
		d1.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		d1.navigate().to("http://youtube.com");
		Thread.sleep(3000);
		d1.navigate().back();
		d1.quit();
	}

}
