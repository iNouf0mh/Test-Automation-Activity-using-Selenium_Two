package iN_atumation;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Boost_DropDown_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver z =new ChromeDriver();
	    z.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS );
	    z.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    z.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	    z.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button")).click();
	   List<WebElement> list = (List<WebElement>) z.findElement(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
	   System.out.println(list.size());
	    
	   for(int x=0;x<list.size();x++) {
		   System.out.println(list.get(x).getText());
		   list.get(x).click(); 
	   }
	   for(int x=0;x<list.size();x++) {
		   System.out.println(list.get(x).getText());
		   if(list.get(x).getText().contains("Angular")) {
			   list.get(x).click();
			   break;
		   }
	   
	}

	}

}
