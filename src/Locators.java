import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("srimathi");
        driver.findElement(By.name("inputPassword")).sendKeys("asdfg");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//tagname.classname//tagname[attribute='value']
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        //tagname[@attribute='value']//<input type="text" placeholder="Name" control-id="ControlID-1" xpath="1">
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Srimathi");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sri@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
        
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

      //  driver.findElement(By.cssSelector("button[@class='reset-pwd-btn']")).click();
        //System.out.println(driver.findElement(By.cssSelector("form p")).getText());
       // driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Sri");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        
       //driver.close();


	}

}
