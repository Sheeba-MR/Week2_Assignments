package selenium_week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver(); // launching the browser
		
		driver.get("http://leaftaps.com/opentaps/"); //load the url
		
		driver.manage().window().maximize(); //maximize the browser window
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
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
		//used index method
		src.selectByIndex(4);
		
		//clicking marketing campaign dropdown
		WebElement marketdd = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		//as the element is in select tag, instantiate the select class
		Select mar = new Select(marketdd);
		//used visibleText method
		mar.selectByVisibleText("Automobile");
		
		//clicking ownership dropdown
		WebElement owndd = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		//as the element is in select tag, instantiate the select class
		Select own = new Select(owndd);
		//used value method
		own.selectByValue("OWN_CCORP");		
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
