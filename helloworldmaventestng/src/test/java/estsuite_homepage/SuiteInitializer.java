/**
 * 
 */
package estsuite_homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

/**
 * @author osboxes
 *
 */
public class SuiteInitializer {
	
	private static WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite(){
		driver = new FirefoxDriver();
		driver.get("http://bigtester.com/");
	}
	
	public static WebDriver getDriver(){
		return driver;
	}

}
