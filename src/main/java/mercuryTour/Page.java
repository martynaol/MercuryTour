package mercuryTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

/**
 * Created by Martyna.Olesinska on 2016-12-22.
 */
public class Page {
    protected WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public void buttonClick(By by) {
        driver.findElement(by).click();
    }

    public void insertText(By by, String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    public Select droplistRandomSelect(By by) {
        Select droplist = new Select(driver.findElement(by));
        droplist.selectByIndex(new Random().nextInt(droplist.getOptions().size()));
        return droplist;
    }

    public List<WebElement> checkboxRandomSelect(By by) {
        List<WebElement> checkbox = driver.findElements(by);
        Random random = new Random();
        int i = random.nextInt(checkbox.size());
        checkbox.get(i).click();
        String text = checkbox.get(i).getAttribute("value");
        return checkbox;
    }

    public String getValue(By by) {
        String text = driver.findElement(by).getText();
        return text;
    }

    public String getValueOnFromPage(By month1, By day1) {
        String month = driver.findElement(month1).getAttribute("value");
        String day = driver.findElement(day1).getAttribute("value");
        String year = "2017";
        String date = month + "/" + day + "/" + year;
        return date;
    }

    public String getValueInFromPage(By month1, By day1) {
        String month = driver.findElement(month1).getAttribute("value");
        String day = driver.findElement(day1).getAttribute("value");
        String year = "2017";
        String date = month + "/" + day + "/" + year;
        return date;
    }

    public String getDateOn(By by) {
        String dateOn = getDateIn(by);
        return dateOn;
    }
    public String getDateIn(By by) {
        String dateIn = driver.findElement(by).getText();
        return dateIn;
    }
}
