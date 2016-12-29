package mercuryTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Martyna.Olesinska on 2016-12-28.
 */
public class BookFlightPage  extends Page{
    public BookFlightPage (WebDriver driver) {
        super(driver);
    }

    public String confirmDateOn() {
        return getDateOn(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/b/font"));
    }
    public String confirmDateIn() {
        return getDateIn(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/b/font"));
    }


    public ConfirmPage BookingFlight() {
        buttonClick(By.name("buyFlights"));
        return new ConfirmPage(driver);
    }
}
