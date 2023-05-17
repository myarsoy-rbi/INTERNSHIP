package ui.com.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.ConfigReader_UI_API;
import utils.DriverHelper;

public class Hook {

    protected WebDriver driver;

    @Before
    public void setup() {
        driver = DriverHelper.getDriver();
        driver.navigate().to(ConfigReader_UI_API.readProperty(""));
    }

    @After
    public void tearDown(Scenario scenario) throws InterruptedException {
        BrowserUtils.getScreenShotForCucumber(driver, scenario);
        driver.quit();
    }
}
