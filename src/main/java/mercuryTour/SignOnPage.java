package mercuryTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Martyna.Olesinska on 2016-12-22.
 */
public class SignOnPage extends Page {
    public SignOnPage(WebDriver driver) {
        super(driver);
    }

    public FlightFinderPage logIn() {
        insertText(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"),"chrismem");
        insertText(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"), "12345678");
        buttonClick(By.name("login"));
        return new FlightFinderPage(driver);
    }
}
