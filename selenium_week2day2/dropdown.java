package selenium_week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); // launching the browser
		
		driver.get("http://leaftaps.com/opentaps/"); //load the url
		
		driver.manage().window().maximize(); //maximize the browser window
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sheeba");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("MR");
		
		//clicking source dropdown
		WebElement sourcedd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//as the element is in select tag, instantiate the select class
		Select src = new Select(sourcedd); //shortcut to import ctrl+shift+O
		//use any 1 method - using index
		src.selectByIndex(2);
		
		//clicking industry dropdown
		WebElement industrydd = driver.findElement(By.id("createLeadForm_industryEnumId"));
		//as the element is in select tag, instantiate the select class
		Select ind = new Select(industrydd); //shortcut to import ctrl+shift+O
		//use any 1 method - using value
		ind.selectByValue("IND_SOFTWARE");
		
		//clicking ownership dropdown
		WebElement ownershipdd = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		//as the element is in select tag, instantiate the select class
		Select own = new Select(ownershipdd); //shortcut to import ctrl+shift+O
		//use any 1 method - using visible text
		own.selectByVisibleText("Partnership");
		
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}
