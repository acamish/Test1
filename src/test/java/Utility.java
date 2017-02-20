package test.java;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by Amish on 2/20/2017.
 */
public class Utility {
    public static void takeScreenshot(WebDriver driver, String screenshotname   ){
        TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(source, new File("G:\\ICANN\\dev\\Test1\\src\\test\\screenshot\\" + screenshotname + ".png"));
            System.out.print("taken !!");
        } catch (IOException e) {
            System.out.print("Expcetion occured");
            e.printStackTrace();
        }

    }
}
