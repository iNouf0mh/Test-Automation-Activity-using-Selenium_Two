package iN_atumation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_complate_Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	     WebDriverManager.chromedriver().setup();
	        ChromeDriver d = new ChromeDriver();
	        d.get("https://www.mytrip.com/");
	        d.manage().window().minimize();
	        d.findElement(By.xpath("//span[text()='From']")).click();
	        WebElement from= d.findElement(By.xpath("//input[@placeholder='From']"));
	        Thread.sleep(2000);
	        from.sendKeys("Toronto");
	        Thread.sleep(2000);
	        from.sendKeys(Keys.ARROW_DOWN);
	        Thread.sleep(2000);
	        from.sendKeys(Keys.ENTER);
	        Thread.sleep(2000);
	}

}
