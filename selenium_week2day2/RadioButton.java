package selenium_week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver(); // launching the browser
		
		driver.get("https://www.leafground.com/radio.xhtml"); //load the url
		
		//adding implicity wait
		Thread.sleep(5000);
		
		driver.manage().window().maximize(); 
		
		//clicking favorite browser checkbox
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		
		//select the option
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		boolean desel = driver.findElement(By.xpath("//label[text()='Chennai']")).isSelected();

		//unselect the selected option
		if (desel == false)
			driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		
		//find the default selected radio button
		boolean default_button = driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isSelected();
		System.out.println(default_button);
		
		//check the button is selected if not select it
		boolean default_select = driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected();
		System.out.println(default_select);
		
		if (default_select == false)
			driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();
		
	}

}
