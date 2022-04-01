import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//name="ctl00$mainContent$DropDownListCurrency"
WebElement staticDropDown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
Select dropdown=new Select(staticDropDown);
dropdown.selectByIndex(3);
Thread.sleep(3000);
System.out.println(dropdown.getFirstSelectedOption().getText());
Thread.sleep(3000);

dropdown.selectByVisibleText("AED");
System.out.println(dropdown.getFirstSelectedOption().getText());
Thread.sleep(3000);

dropdown.selectByValue("USD");
System.out.println(dropdown.getFirstSelectedOption().getText());
driver.close();

	}

}
