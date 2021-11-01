import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public void setUp() {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @BeforeMethod
    public static void openWeb(){
        driver.get("https://kitabisa.com/campaign/bantualawi");
    }

    @Test(description = "Submit a WebForm")
    @Step("Enter First Name, Enter Last Name, Press Submit Button, Verify alert success appears.")
    public static void submitForm(){
        WebForm webForm = new WebForm(driver);

        //webForm.ClickCampaign();
        webForm.ClickDonasi();

        webForm.ClickNominal();

        webForm.ClickPaymentMethod();

        webForm.enterNamaLengkap();

        webForm.enterEmail();

        webForm.ClickBayar();

        webForm.KembaliKeDonasi();
    }

    @AfterMethod
    public static void takeScreenshot() {
        Utils.takeScreenshot(driver);
    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}