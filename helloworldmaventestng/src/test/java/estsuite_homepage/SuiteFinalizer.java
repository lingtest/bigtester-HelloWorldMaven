/**
 * 
 */
package estsuite_homepage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;


/**
 * @author osboxes
 *
 */
public class SuiteFinalizer {
	
  @AfterSuite
  public void afterSuite(){
	  WebDriver driver = SuiteInitializer.getDriver();
	  driver.close();
  }
}
