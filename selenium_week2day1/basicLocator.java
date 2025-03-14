package selenium_week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicLocator {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver(); // launching the browser
		driver.get("http://www.leaftaps.com/opentaps/control/main"); //load the url
		driver.manage().window().maximize(); //maximize the browser window
		
		driver.findElement(By.id("usernam")).sendKeys("demosalesmanager");
		
		//we can use like above line also for password
		//in the below line we have stored the value in the variable(pwd)
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.close(); //close the current tab
		driver.quit(); // close all tabs

	}

}
