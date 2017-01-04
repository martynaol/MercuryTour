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
        insertText(By.name("userName"), "chrismem");
        insertText(By.name("password"), "12345678");
        buttonClick(By.name("login"));
        return new FlightFinderPage(driver);
    }
    public boolean confirmSignOn(){
        Boolean element =driver.getPageSource().contains("Welcome back to Mercury Tours");
        return  element;
    }
}
