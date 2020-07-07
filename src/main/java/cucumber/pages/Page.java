package cucumber.pages;

import cucumber.Driver.WebDriverInterface;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

public class Page {
    protected WebDriver driver;
    WebDriverWait wait;

    @Autowired
    private WebDriverInterface webDriverInterface;


    public void setUp() {
        driver = webDriverInterface.getDriver();
        driver.get("https://habr.com/ru/");
    }
}
