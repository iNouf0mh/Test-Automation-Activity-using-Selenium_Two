package iN_atumation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Auto_Suggest_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver u= new ChromeDriver();
		u.manage().window().maximize();
		//u.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		u.get("https://www.google.com/");
		WebElement e = u.findElement(By.name("q"));
		e.sendKeys("java tutorial ");
		List<WebElement> li=u.findElements(By.className("UUbT9"));
		for(WebElement a: li) {
		if(a.getText().equalsIgnoreCase("java tutorial w3schools")) {
		a.sendKeys(Keys.ARROW_DOWN);
		a.sendKeys(Keys.ENTER);}
		//e.findElements(By.className("UUbT9"));
		
		Thread.sleep(3000);}
		//List<WebElement> li=u.findElements(By.className("UUbT9"));
	//	for(WebElement a: li) {
			//System.out.println(a.getText());
			
			//if(a.getText().equalsIgnoreCase("java tutorial w3schools")){
				//a.click();
				//Actions act= new Actions(u);
				//act.sendKeys(e, Keys.ARROW_DOWN).sendKeys(e, Keys.ARROW_DOWN).sendKeys(e, Keys.ARROW_DOWN).sendKeys(e, Keys.ENTER).build().perform();
				//break;

	}

}
