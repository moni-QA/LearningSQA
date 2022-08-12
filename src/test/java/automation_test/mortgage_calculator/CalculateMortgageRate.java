package automation_test.mortgage_calculator;
import command_providers.ActOn;
import command_providers.AssertThat;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.DateUtils;
import utilities.ScreenCapture;

import java.io.IOException;

public class CalculateMortgageRate {
    private final By HomeValueInputField = By.id("homeval");
    private final By DownPaymentInputFiled = By.id("downpayment");
    private final By DownPaymentTypeInDollar = By.name("param[downpayment_type]");
    private final By LoanAmountInputField = By.id("loanamt");
    private final By InterestRateInputField = By.id("intrstsrate");
    private final By LoantermtInputField = By.id("loanterm");
    private final By StartMonthDropDown = By.name("param[start_month]");
    private final By StartYearInputField = By.id("start_year");
    private final By PropertyTaxInputFiled = By.id("pptytax");
    private final By PmiInputField = By.id("pmi");
    private final By HomeInsInputFiled =By.id("hoi");
    private final By MonthlyHoaInputField = By.id("hoa");
    private final By LoanTypeDropDown = By.name("param[milserve]");
    private final By BuyOrRefiDropDown = By.name("param[refiorbuy]");
    private final By CalculateButton = By.name("cal");


    WebDriver driver;
    Select select;

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        ActOn.browser(driver).openBrowser("https://www.mortgagecalculator.org/");
    }

    private void enterData(){
        //Enter Home Value "300000"
        ActOn.element(driver,HomeValueInputField).setValue("300000");
        //Enter down payment "60000"
        ActOn.element(driver,DownPaymentInputFiled).setValue("60000");
        //click on the radio button $
        ActOn.element(driver,DownPaymentTypeInDollar).click();
        //Enter loan amount "240000"
        ActOn.element(driver,LoanAmountInputField).setValue("240000");
        //Enter interest rate "3%
        ActOn.element(driver,InterestRateInputField).setValue("3");
        //enter loan term 30 years
        ActOn.element(driver,LoantermtInputField).setValue("30");

        //capturing the date array
        String[] date = DateUtils.returnNextMonth();
        ActOn.element(driver,StartMonthDropDown).selectValue(date[0]);

        //Enter the year "2022"
        ActOn.element(driver,StartYearInputField).setValue(date[1]);

        //Enter property Tax "5000"
        ActOn.element(driver,PropertyTaxInputFiled).setValue("5000");
        //Enter PMI "0.5"
        ActOn.element(driver,PmiInputField).setValue("0.5");
        //Enter HOI "1000"
        ActOn.element(driver,HomeInsInputFiled).setValue("1000");
        //Enter monthly hoa "100"
        ActOn.element(driver,MonthlyHoaInputField).setValue("100");
        //select loan type "FHA"
        ActOn.element(driver,LoanTypeDropDown).selectValue("FHA");
        //select BUY option
        ActOn.element(driver,BuyOrRefiDropDown).selectValue("Buy");
    }

    @Test
    public void calculateMonthlyPayment(){
        enterData();

        //click on the calculate button
        ActOn.element(driver,CalculateButton).click();

        String expectedTotalMonthlyPayment = "1,611.85";
        String formattedXpath= String.format("//h3[text()='$%s']",expectedTotalMonthlyPayment);

        AssertThat.elementAssertions(driver,By.xpath(formattedXpath)).elementIsDisplayed();
    }

    @AfterMethod
    public void closeBrowser(ITestResult result) throws IOException {

        if(ITestResult.FAILURE == result.getStatus()){
            ScreenCapture.getScreenShot(driver);
        }
       ActOn.browser(driver).closeBrowser();
    }
}
