package iN_atumation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver c =new ChromeDriver();
		String month="Jun";
		String Year="2005";
		String day="30";
		c.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		c.findElement(By.xpath("//*[@id=\"dob\"]")).click();
		Thread.sleep(2000);
		while(true) {
		String txt=c.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]")).getText();
		if(txt.equals(month)&&(txt.equals(Year))) {
			break;
		}
		else {
			 c.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/a[1]/span")).click();
		}
		
		c.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody[contains(text(),"+day+")]")).click();
		
		}
	}

}
