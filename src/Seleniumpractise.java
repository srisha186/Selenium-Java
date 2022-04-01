import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumpractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoke browser
		//Chrome-ChromeDriver
		//Firefox-FirefoxDriver
		//webdriver.chrome.drive-->value path
		// we are giving key value pair
		//System.setProperty(key,value)
		
		//ChromeDriver.exe-- Chrome Browser
		System.setProperty("webdriver.chrome.driver","/Users/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

    
    //Firefox launch
	//System.setProperty("webdriver.gecko.driver","/Users/geckodriver.exe");
    //WebDriver driver=new FirefoxDriver();

    //Microsoft Edge
	//System.setProperty("webdriver.edge.driver","/Users/msedgedriver.exe");
   // WebDriver driver=new EdgeDriver();

    
    driver.get("https://www.rahulshettyacademy.com/#/index");
    //get title of url
    System.out.println(driver.getTitle());
    //get current url
    System.out.println(driver.getCurrentUrl());
    // don't use sysout (System.out.println(driver.close());)
    //Close the current window, quitting the browser if it's the last window currently open. 
    //driver.close();
    //Quits this driver, closing every associated window.
     //driver.quit();
	}

}
