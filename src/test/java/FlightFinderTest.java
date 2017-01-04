import mercuryTour.*;

        import org.junit.Test;
        import org.openqa.selenium.By;

        import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Martyna.Olesinska on 2016-12-28.
 */
public class FlightFinderTest extends SourceTest {

    @Test
    public void shouldInsertAllFiels() throws InterruptedException {
        SignOnPage signOnPage = new SignOnPage(driver);

        FlightFinderPage flightFinderPage = signOnPage.logIn();

        SelectFlightPage selectFlightPage = flightFinderPage.flightDetails();
        assertEquals(flightFinderPage.confirmValueOnFlight(), selectFlightPage.confirmDateOn());
        assertEquals(flightFinderPage.confirmValueInFlight(), selectFlightPage.confirmDateIn());

        BookFlightPage bookFlightPage = selectFlightPage.FlightSelected();
        assertEquals(flightFinderPage.confirmValueOnFlight(),bookFlightPage.confirmDateOn());
        assertEquals(flightFinderPage.confirmValueInFlight(),bookFlightPage.confirmDateIn());


        ConfirmPage confirmPage = bookFlightPage.BookingFlight();
        assertEquals("Your itinerary has been booked!", confirmPage.flightConfirmation());

    }

    @Test
    public void shouldLogOut() throws InterruptedException {
        SignOnPage signOnPage = new SignOnPage(driver);

        FlightFinderPage flightFinderPage = signOnPage.logIn();

        SelectFlightPage selectFlightPage = flightFinderPage.flightDetails();

        BookFlightPage bookFlightPage = selectFlightPage.FlightSelected();

        ConfirmPage confirmPage = bookFlightPage.BookingFlight();

        signOnPage = confirmPage.logOut();
        assertTrue(String.valueOf(signOnPage.confirmSignOn()),true);
    }

    @Test
    public void shouldBackToFlight() throws InterruptedException {
        SignOnPage signOnPage = new SignOnPage(driver);

        FlightFinderPage flightFinderPage = signOnPage.logIn();

        SelectFlightPage selectFlightPage = flightFinderPage.flightDetails();

        BookFlightPage bookFlightPage = selectFlightPage.FlightSelected();

        ConfirmPage confirmPage = bookFlightPage.BookingFlight();

        flightFinderPage = confirmPage.backToFlight();
        assertTrue(String.valueOf(flightFinderPage.confirmFlightBack()), true);
    }
    @Test
    public void shouldBackToHome() throws InterruptedException {
        SignOnPage signOnPage = new SignOnPage(driver);

        FlightFinderPage flightFinderPage = signOnPage.logIn();

        SelectFlightPage selectFlightPage = flightFinderPage.flightDetails();

        BookFlightPage bookFlightPage = selectFlightPage.FlightSelected();

        ConfirmPage confirmPage = bookFlightPage.BookingFlight();

        HomePage homePage = confirmPage.backToHome();
        assertTrue(String.valueOf(homePage.confirmBackToHome()),true);


    }
}
