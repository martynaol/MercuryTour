package mercuryTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Martyna.Olesinska on 2016-12-22.
 */
public class FlightFinderPage extends Page {
    public FlightFinderPage(WebDriver driver) {
        super(driver);
    }

    public String confirmPage() {
        String element = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font")).getText();
        return element;
    }


    public SelectFlightPage flightDetails() throws InterruptedException {
        checkboxRandomSelect(By.xpath("//input[contains(@name, 'tripType')]"));
        droplistRandomSelect(By.name("passCount"));
        droplistRandomSelect(By.name("fromPort"));
        droplistRandomSelect(By.name("fromMonth"));
        droplistRandomSelect(By.name("toPort"));
        checkboxRandomSelect(By.xpath("//input[contains(@name, 'servClass')]"));
        droplistRandomSelect(By.name("airline"));

        buttonClick(By.name("findFlights"));
        Thread.sleep(2000);

        return new SelectFlightPage(driver);
    }

    public String confirmValueOnFlight() {
        return getValueOnFromPage(By.name("fromMonth"), By.name("fromDay"));
    }

    public String confirmValueInFlight() {
        return getValueInFromPage(By.name("toMonth"), By.name("toDay"));
    }
    public boolean confirmFlightBack(){
        Boolean element = driver.getPageSource().contains("Use our Flight Finder");
        return element;
    }



}

