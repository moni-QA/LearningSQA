package automation_test;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utilities.DriverFactory;
import utilities.ReadConfigFiles;

public class BaseClass {

    public WebDriver driver;
    public Logger LOGGER = LogManager.getLogger(this.getClass().getName());
    String testCaseName= String.format("-------Test: %s--------",this.getClass().getName());
    String endTestCase= String.format("-------Test End: %s------",this.getClass().getName());

    @BeforeClass
    public void addThread(){
        ThreadContext.put("threadName",this.getClass().getName());
        driver= DriverFactory.getInstance().getDriver();
    }

    @BeforeMethod
    public void openBrowser() {
        String browserUrl = ReadConfigFiles.getPropertyValues("URL");
        LOGGER.info(testCaseName);
        LOGGER.debug("Opening the URL: " +browserUrl);
        ActOn.browser(driver).openBrowser(browserUrl);
    }

    @AfterMethod

    public void closeBrowser(){
        DriverFactory.getInstance().removeDriver();
        LOGGER.info(endTestCase);
    }

}
