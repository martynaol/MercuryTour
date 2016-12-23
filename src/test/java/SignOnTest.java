import mercuryTour.FlightFinderPage;
import mercuryTour.HomePage;
import mercuryTour.SignOnPage;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Martyna.Olesinska on 2016-12-22.
 */
public class SignOnTest extends SourceTest {

    @Test
    public void shouldLogiIn(){
        HomePage homePage = new HomePage(driver);

        SignOnPage signOn = homePage.clickSignOn();

        FlightFinderPage flightFinderPage = signOn.logIn();

        assertEquals("Flight",flightFinderPage.confirmPage());
    }
}


