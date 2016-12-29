package mercuryTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Martyna.Olesinska on 2016-12-28.
 */
public class SelectFlightPage extends Page {
    public SelectFlightPage(WebDriver driver) {
        super(driver);
    }

    public BookFlightPage FlightSelected() {
        checkboxRandomSelect(By.xpath("//input[contains(@name,'outFlight')]"));
        checkboxRandomSelect(By.xpath("//input[contains(@name,'inFlight')]"));
        buttonClick(By.name("reserveFlights"));
        return new BookFlightPage(driver);
    }

    public String confirmDateOn() {
        return getDateOn(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/b/font"));
    }

    public String confirmDateIn() {
        return getDateIn(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/b/font"));
    }

}