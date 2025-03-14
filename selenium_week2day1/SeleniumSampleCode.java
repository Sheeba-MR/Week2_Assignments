package selenium_week2day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSampleCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			ChromeDriver dri = new ChromeDriver();
			dri.manage().window().maximize();
			dri.get("http://leaftaps.com/opentaps/control/main");


	}

}
