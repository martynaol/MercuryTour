import mercuryTour.ConfirmPage;
import mercuryTour.HomePage;
import mercuryTour.RegisterPage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Martyna.Olesinska on 2016-12-22.
 */
public class RegisterTest extends SourceTest {

    @Test
    public void shouldRegisterAccount() {

        HomePage homePage = new HomePage(driver);

        RegisterPage registerPage = homePage.clickRegister();

        ConfirmPage confirmPage = registerPage.accountCreat();

        assertEquals("Dear Chris Obama,", confirmPage.confirmReiestration());

    }
}
