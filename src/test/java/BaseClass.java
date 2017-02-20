package test.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


/**
 * Created by achoudhary on 2/17/17.
 */
public class BaseClass {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "G:\\ICANN\\dev\\Test1\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    void tearDown(ITestResult result){
        if(ITestResult.FAILURE==result.getStatus()){
            Utility.takeScreenshot(driver,result.getName());
        }
    }

    @AfterClass
    public void end(){
        driver.quit();
    }
}
