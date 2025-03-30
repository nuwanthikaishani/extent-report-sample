package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import utils.ExtentManager;

@Listeners(ITestListener.class)
public class BaseTest {

    protected WebDriver driver;
    protected ExtentReports extent;
    protected ExtentTest test;

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        extent = ExtentManager.getExtentReports();

    }

    @AfterClass
    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }
        extent.flush();
    }

//
//    @BeforeTest
//    public void setup(){
//        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\hp\\\\IdeaProjects\\\\chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }

}
