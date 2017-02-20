package test.java;

import org.apache.log4j.Logger;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.testng.annotations.Test;



/**
 * Created by achoudhary on 2/17/17.
 */
public class TestingSelenium1 extends BaseClass{

    private static Logger logger = Logger.getLogger(TestingSelenium1.class.getName());
    @Test(priority = 1)
    public void test1()
    {
        DOMConfigurator.configure("log4j.xml");
        logger.info("Test1 started");
        driver.get("https://google.co.in");
        driver.findElement(By.className("wrongfortesting")).click();
        System.out.println("google here");
        logger.info("Test1 ended");
    }

    @Test
    public void test2()
    {
        logger.info("ancdasdfsdf");
        driver.get("https://yahoo.com");
        System.out.println("yahoo here");

    }

    @Test
    public void test3()
    {
        driver.get("https://facebook.com");
        System.out.println("fb here");
    }

    @Test
    public void test4()
    {
        driver.get("https://instagram.com");
        System.out.println("insta here");

    }


}
