import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Utils {
    //final static String BASE_URL = "https://kitabisa.com/campaign/bantualawi";
    final static String CHROME_DRIVER_LOCATION = "chromedriver";

    public static void takeScreenshot(WebDriver webDriver) {
        try {
            File srcFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
            Allure.addAttachment("Screenshot", new FileInputStream(srcFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}