package automation_test.mortgage_calculator;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.ScreenCapture;

import java.io.IOException;
import java.time.Duration;

public class CalculateRealAprRate {

    private final By RatesLink = By.linkText("Rates");
    private final By RealAprLink = By.linkText("Real APR");
    private final By CalculatorTab = By.xpath("//label[text()='Calculator']");
    private final By HomePriceInputField = By.name("HomeValue");
    private final By DownPaymentInDollar = By.name("DownPaymentSel");
    private final By DownPaymentInputField = By.name("DownPayment");
    private final By InterestRateInputField = By.name("Interest");
    private final By CalculateRateButton = By.name("calculate");
    private final By ActualAprRate = By.xpath("//*[@id='analysisDiv']/table[1]/tbody/tr[6]/td[1]/strong[text()='Actual APR:']/../../td[2]/strong");

    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        ActOn.browser(driver).openBrowser("https://www.mortgagecalculator.org/");
    }

    public void navigateToRealAprPage(){
        //Mouse Hover to Rates Link
        ActOn.element(driver,RatesLink).mouseHover();

        //click on real Apr Link
        ActOn.element(driver,RealAprLink).click();

        //wait for the page to load
        ActOn.wait(driver,CalculatorTab).waitForElementToBeVisible();
    }

    public void enterData(){
        //Enter Home Price "200000"

        ActOn.element(driver,HomePriceInputField).setValue("200000");

        //click on the radio button of downpayment in dollar
        ActOn.element(driver,DownPaymentInDollar).click();

        //Enter Down payment "15000"
        ActOn.element(driver,DownPaymentInputField).setValue("15000");

        //Enter Interest Rate "3"
        ActOn.element(driver,InterestRateInputField).setValue("3");

    }
    @Test
    public void calculateRealApr(){
        navigateToRealAprPage();
        enterData();

        //click on calculate Button
        ActOn.element(driver,CalculateRateButton).click();

        //validate the real apr rate is  "3.130"
        String actualRealAprRate =  ActOn.element(driver,ActualAprRate).getTextValue();
        Assert.assertEquals(actualRealAprRate,"3.130%");
    }

    @AfterMethod
    public void closeBrowser(ITestResult result) throws IOException {

        if(ITestResult.FAILURE == result.getStatus()){
            ScreenCapture.getScreenShot(driver);
        }
        ActOn.browser(driver).closeBrowser();
    }
}
