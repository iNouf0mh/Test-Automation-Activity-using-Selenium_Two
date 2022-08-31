package iN_atumation;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import graphql.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit.*;
public class Drop_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		    
	        ChromeDriver d = new ChromeDriver();
	        
	        d.get("https://www.saucedemo.com/");
	        d.findElement(By.id("user-name")).sendKeys("standard_user");
	        d.findElement(By.id("password")).sendKeys("secret_sauce");
	        d.findElement(By.id("login-button")).click();
	        
	        //before filter the prices
	        List<WebElement> Befor_Filter=d.findElements(By.className("inventory_item_price"));
	        // i receive a pobleme with doller sign so i convert the string to double 
	        List<Double> convert = new ArrayList<Double>();
	        for(WebElement p : Befor_Filter) {
	        	convert.add(Double.valueOf(p.getText().replace("$", "")));
	        }
	        //Filter the price from the dropdown
	        
	        Select D_DOWN = new Select(d.findElement(By.className("product_sort_container")));
	        D_DOWN.selectByVisibleText("Price (low to high)");
	        //After filter the prices
	        List<WebElement> after=d.findElements(By.className("inventory_item_price"));
	        // so here i remove the $ sign
	        List<Double> After_Filter= new ArrayList<Double>();
	        for(WebElement p :after) {
	        After_Filter.add(Double.valueOf(p.getText().replace("$", "")));
	        
	        //compare thr assert the values 
	        // i need to sort the values of before filter
	        Collections.sort(convert);
	        Thread.sleep(3000);
	        d.quit();
	        
	        
	        
	        
	        }
	   
	        
		}   

	}


