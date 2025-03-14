package selenium_week2day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver(); // launching the browser
		
		driver.get("https://www.facebook.com/"); //load the url
		
		driver.manage().window().maximize(); //maximize the browser window
		
		String title = driver.getTitle(); // to get the title
		System.out.println(title);	
		
		driver.quit();  // close the tab
		driver.close();  // close the browser

	}

}
