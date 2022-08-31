package iN_atumation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Frames_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver s= new ChromeDriver();
		s.manage().window().maximize();
		s.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		s.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		s.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Packages");
		s.switchTo().frame(s.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/iframe")));
		s.findElement(By.xpath("/html/body/main/ul/li[1]/a")).getText();
		s.switchTo().frame(s.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/iframe")));
		s.findElement(By.xpath("/html/body/main/ul/li[9]/a/span")).click();

	}

}
