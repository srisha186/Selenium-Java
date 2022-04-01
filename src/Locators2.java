import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//login application by dynamically passing values of user name and password into the code.
public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    String name="Sri";
		System.setProperty("webdriver.chrome.driver","/Users/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String[] password=getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.cssSelector("#chkboxTwo")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		//Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		//Assert.assertEquals(driver.findElement(By.cssSelector("div h2")).getText(),"Hello"+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	}
public static String[] getpassword(WebDriver driver) throws InterruptedException
{
    driver.get("https://rahulshettyacademy.com/locatorspractice/");
    driver.findElement(By.linkText("Forgot your password?")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
    String passwordText=driver.findElement(By.cssSelector("form p")).getText();
    
    //Please use temporary password 'rahulshettyacademy' to Login.
    String[] passwordArray=passwordText.split("'");
    //in 0th index Please use temporary password
    //1st index rahulshettyacademy' to Login
    String[] password1=passwordArray[1].split("'");
    return password1;
    
}
}
