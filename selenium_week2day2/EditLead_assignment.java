package selenium_week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver(); // launching the browser
		
		driver.get("http://leaftaps.com/opentaps/"); //load the url
		
		driver.manage().window().maximize(); //maximize the browser window
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		//enter the company name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		//enter the first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sheeba");
		//enter the last name
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("MR");
		//enter the department
		driver.findElement(By.name("departmentName")).sendKeys("Computer");
		//enter the text in the description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hi user");
		//enter the email id
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sheebajebin23@gmail.com");
		//enter the state by VISIBLE TEXT method
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sta = new Select(state);
		sta.selectByVisibleText("New York");
		//click the submit button
		driver.findElement(By.className("smallSubmit")).click();
		//click the edit button
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//clear the text in the description
		driver.findElement(By.id("updateLeadForm_description")).clear();
		//enter the text in the important note
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Hi user");
		//click the update button
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		//get the title of the webpage
		String title = driver.getTitle();
		System.out.println(title);
		//driver.close();
		

	}

}
