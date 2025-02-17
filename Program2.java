

package task9Programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); //Open the chrome browser
		
		driver.get("https://www.demoblaze.com/");//opens the url
		
		driver.manage().window().maximize(); //Maximize the window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // waits for 15 seconds
		
		String title=driver.getTitle(); 
		
		if (title=="STORE")
		{
			System.out.println("Page landed on correct website");
		}
		else
		{
			System.out.println("Page not landed on correct website");
		}
	
	}

}
