package iN_atumation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_Up_Deom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver w =new ChromeDriver();
		//w.get("https://the-internet.herokuapp.com/basic_auth");
		w.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		String tx=w.findElement(By.cssSelector("p")).getText();
		System.out.println(tx);
		//*[@id="age"] 
		///html/body/p[4]/label
	}

}
