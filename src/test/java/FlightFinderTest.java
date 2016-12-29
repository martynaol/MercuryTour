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
}
