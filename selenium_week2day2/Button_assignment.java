package selenium_week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver(); // launching the browser
		
		driver.get("https://leafground.com/button.xhtml"); //load the url
		
		driver.manage().window().maximize(); //maximize the browser window
		
		//driver.findElement(By.xpath("//span[text()='Click']")).click();
		//String title = driver.getTitle();
		//System.out.println(title);
		
		boolean status = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		System.out.println(status);
		
		//location of the button
		WebElement loc = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		System.out.println(loc.getLocation());
		
		//background color of the save button
		WebElement col = driver.findElement(By.xpath("(//button[@role='button'])[4]"));
		String colour = col.getCssValue("background-color");
		System.out.println(colour);
		
		//height and width of the button
		WebElement siz = driver.findElement(By.xpath("(//button[@role='button'])[5]"));
		Dimension size = siz.getSize();
		System.out.println(size); 	
		
		driver.close();

	}

}
