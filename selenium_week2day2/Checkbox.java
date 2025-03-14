package selenium_week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver(); // launching the browser
		
		driver.get("https://leafground.com/checkbox.xhtml"); //load the url
		
		driver.manage().window().maximize(); //maximize the browser window
		//WebDriverWait wait = new WebDriverWait(driver,20);
		
		//clicking basic checkbox
		WebElement basic = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[1]"));
		basic.click();
		
		//clicking notification checkbox
		driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[2]")).click();

		
		//clicking on favourite language
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[1]")).click();
		
		//clicking on tri state checkbox
		WebElement tri = driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]"));
		tri.click();
		
		//check the tri state checkbox has selected or not
		// HERE ALWAYS I'M GETTING THE STATUS AS FALSE - WRONG OUTPUT
		boolean status = driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]")).isSelected();
		System.out.println(status);
		
		//clicking on toggle switch
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		
		
		//check the expected message is displayed after the toggle switch is clicked
		// dom freezing code - setTimeout(function() { debugger } ,5000 ) - type this in console
		boolean display = driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed();
		System.out.println(display);
		
		
		//is disabled or not
		WebElement button = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]"));
		boolean button_status = button.isEnabled();
		System.out.println("The button is enabled : "+button_status);
		
		//select multiple option dropdown
	    // here the select tag is not here so we have to click by using basic locators
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		//driver.close();
		
		
		
		
		
	}

}
