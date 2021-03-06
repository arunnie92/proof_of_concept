import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import static org.junit.Assert.assertEquals;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class WorkingSauce {

  public static final String USERNAME = System.getenv("SAUCE_USERNAME");
  public static final String ACCESS_KEY = System.getenv("SAUCE_ACCESS_KEY");
  public static final String URL = "http://" + USERNAME + ":" + 
  									ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

  public static void main(String[] args) throws Exception {

	/**
	* Task I: Update the test code so when it runs, the test clicks the "I am a link" link.
	*
	* Task II - Comment out the code from Task I. Update the test code so when it runs, 
	* the test is able to write "Sauce" in the text box that currently says "I has no focus".
	*
	* Task III - Update the test code so when it runs, it adds an email to the email field, 
	* adds text to the comments field, and clicks the "Send" button.
	* Note that email will not actually be sent!
	*
	* Task IV - Add a capability that adds a tag to each test that is run.
        * See this page for instructions: https://wiki.saucelabs.com/display/DOCS/Test+Configuration+Options
	*/

    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Windows 7");
    caps.setCapability("browserName", "chrome");
    caps.setCapability("version", "48");
    caps.setCapability("name", "Guinea-Pig Sauce");
    String[] tags = new String[3];

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

  /**
  * Goes to Sauce Lab's guinea-pig page and verifies the title
  */

    driver.get("https://saucelabs.com/test/guinea-pig");
    assertEquals("I am a page title - Sauce Labs", driver.getTitle());

// Task I
    tags[0] = "task1";
    // driver.findElement(By.linkText("i am a link")).click();
    // assertEquals("I am another page title - Sauce Labs", driver.getTitle());

// Task II
    tags[1] = "task2";
    driver.findElement(By.id("i_am_a_textbox")).clear();
    driver.findElement(By.id("i_am_a_textbox")).sendKeys("Sauce");
    System.out.println(driver.findElement(By.id("i_am_a_textbox")).getText());

// Task III
    tags[0] = "task3";
    // add email
    driver.findElement(By.id("fbemail")).clear();
    driver.findElement(By.id("fbemail")).sendKeys("arunn.kanthan@gmail.com");

    // add text to comments field
    System.out.println(driver.findElement(By.id("comments")).getText());
    driver.findElement(By.id("comments")).clear();
    driver.findElement(By.id("comments")).sendKeys("This is a fun application to use ;)");

    // click send
    driver.findElement(By.id("submit")).click();

    caps.setCapability("tags", tags);
    driver.quit();
  }
}
