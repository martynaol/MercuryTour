package mercuryTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Martyna.Olesinska on 2016-12-22.
 */
public class HomePage extends Page {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public RegisterPage clickRegister() {
        buttonClick(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
        return new RegisterPage(driver);

    }

    public SignOnPage clickSignOn() {
        buttonClick(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));
        return new SignOnPage(driver);
    }
}
