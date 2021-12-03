package config;

import POM.Keyboardactions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class base {
    private WebDriver driver;
//    private String baseUrl = "http://demo.guru99.com/test/newtours/";
    protected Keyboardactions keyboardactions;
    @BeforeTest
    public void setup() throws InterruptedException{
        String baseUrl = "http://www.google.com/";
//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//        driver = new ChromeDriver();
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\IdeaProjects\\ChakaProcessAutomation\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get(baseUrl);
        keyboardactions = new Keyboardactions(driver);
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
