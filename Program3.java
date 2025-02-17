

package task9Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); //opens the chrome browser
		
		driver.get("https://www.wikipedia.org/"); //opens the url
		
		driver.manage().window().maximize(); //maximizes the window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //waits for 15 seconds
		
		driver.findElement(By.id("search-input")).sendKeys("Artificial Intelligence");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		driver.findElement(By.xpath("//li[@id='toc-History']")).click();
		
		String title=driver.getTitle();
		
		System.out.println("Title is : " +title);
		
	}

}
