package mercuryTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Martyna.Olesinska on 2016-12-22.
 */
public class ConfirmPage extends Page {
    public static Object FlightConfirmation;

    public ConfirmPage(WebDriver driver) {
        super(driver);
    }

    public String confirmReiestration() {
        String element = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]")).getText();
        return element;
    }
    public String flightConfirmation(){
        String text =driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
        return text;
    }

    public SignOnPage logOut(){
       buttonClick(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img"));
       return new SignOnPage(driver);
    }

    public FlightFinderPage backToFlight() {
        buttonClick(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[1]/a/img"));
        return new FlightFinderPage(driver);
    }

    public HomePage backToHome() {
        buttonClick(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[2]/a/img"));
        return new HomePage(driver);
    }
}
