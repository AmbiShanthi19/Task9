

package task9Programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program1 {

	public static void main(String[] args) {
		
				WebDriver driver=new FirefoxDriver();//Open the Firefox driver
				
				driver.get("http://google.com"); //opens the google link
				
				driver.manage().window().maximize(); //window gets Maximized
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //waits for 15 seconds
				
				String url=driver.getCurrentUrl(); //Gets the current url of the page
				
				System.out.println(url); //Prints the url
				;
				driver.navigate().refresh(); //Reloads the page
				
				driver.quit(); //closes the browser
				
	}

}
