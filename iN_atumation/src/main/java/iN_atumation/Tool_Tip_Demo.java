package iN_atumation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tool_Tip_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver a =new ChromeDriver();
		
		a.get("https://jqueryui.com/tooltip/");
		a.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("23");
		String ms=a.findElement(By.xpath("//*[@id=\"age\"]")).getAttribute("validationMessage");
		System.out.println(ms);
	}

}
