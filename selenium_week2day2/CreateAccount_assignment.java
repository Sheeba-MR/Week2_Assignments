package selenium_week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class CreateAccount_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver(); // launching the browser
		
		driver.get("http://leaftaps.com/opentaps/"); //load the url
		
		driver.manage().window().maximize(); //maximize the browser window
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");
	
		//select industry dropdown
		WebElement industrydd = driver.findElement(By.name("industryEnumId"));
		//as the element is in select tag, instantiate the select class
		Select indu = new Select(industrydd);
		//used visible text method
		indu.selectByVisibleText("Computer Software");
		
		//clicking ownership dropdown
		WebElement owndd = driver.findElement(By.name("ownershipEnumId"));
		//as the element is in select tag, instantiate the select class
		Select owne = new Select(owndd);
		//used value method
		owne.selectByVisibleText("S-Corporation");
		
		//clicking source dropdown
		WebElement sourcedd = driver.findElement(By.id("dataSourceId"));
		//as the element is in select tag, instantiate the select class
		Select sour = new Select(sourcedd); //shortcut to import ctrl+shift+O
		//used index method
		sour.selectByValue("LEAD_EMPLOYEE");
		
		//clicking marketing campaign dropdown
		WebElement marketdd = driver.findElement(By.id("marketingCampaignId"));
		//as the element is in select tag, instantiate the select class
		Select mark = new Select(marketdd);
		//used visibleText method
		mark.selectByIndex(6);
		
		//clicking state dropdown
		WebElement statedd = driver.findElement(By.id("generalStateProvinceGeoId"));
		//as the element is in select tag, instantiate the select class
		Select stat = new Select(statedd); //shortcut to import ctrl+shift+O
		//used index method
		stat.selectByValue("TX");
		
		//click create account button
		driver.findElement(By.className("smallSubmit")).click();
		
		//verifying the account name is displayed
		boolean display = driver.findElement(By.xpath("//input[@value='Selenium Automation Tester']")).isDisplayed();
		System.out.println(display);
		
		driver.close();
		
		
		
		
		

	}

}
