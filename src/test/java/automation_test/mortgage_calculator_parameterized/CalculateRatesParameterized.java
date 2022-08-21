package automation_test.mortgage_calculator_parameterized;
import automation_test.BaseClass;
import data.DataStore;
import org.testng.annotations.Test;
import page_objects.Home;

public class CalculateRatesParameterized extends BaseClass {

    @Test(dataProvider = "RealAprRates", dataProviderClass = DataStore.class)
    public void calculateRealApr(String homePrice, String downPayment, String interestRate, String expectedApr) {
        new Home(driver)
                .mouseHoverToRates()
                .navigateToRealApr()
                .waitForPageToLoad()
                .typeHomePrice(homePrice)
                .clickDownPaymentInDollar()
                .typeDownPayment(downPayment)
                .typeInterestRate(interestRate)
                .clickOnCalculateButton()
                .validateRealAprRate(expectedApr);
    }
}
