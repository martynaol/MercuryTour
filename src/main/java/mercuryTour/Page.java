package mercuryTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Martyna.Olesinska on 2016-12-22.
 */
public class Page {
    protected WebDriver driver;

    public Page(WebDriver driver){
        this.driver = driver;
    }
    public void buttonClick(By by) {
        driver.findElement(by).click();
    }
    public void insertText(By by, String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }
}
