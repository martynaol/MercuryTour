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
public class FlightFinderPage extends Page {
    public FlightFinderPage(WebDriver driver) {
        super(driver);
    }

    public String confirmPage(){
        String element = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font")).getText();
        return element;
    }



}

