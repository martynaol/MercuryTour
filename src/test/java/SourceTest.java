import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * Created by Martyna.Olesinska on 2016-12-22.
 */
public class SourceTest {
    protected WebDriver driver;
    String url = "http://newtours.demoaut.com/";

    @Before
    public void setUp() throws Exception {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized"); // PARAMETR CHROMEDRIVER
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(5000);
        driver.quit();
    }
}

