package test.java;

import org.testng.annotations.Test;

/**
 * Created by achoudhary on 2/17/17.
 */
public class TestingSelenium1 extends BaseClass{


    @Test
    public void test1()
    {
        driver.get("https://google.co.in");

    }

    @Test
    public void test2()
    {
        driver.get("https://yahoo.com");

    }

    @Test
    public void test3()
    {
        driver.get("https://facebook.com");

    }

    @Test
    public void test4()
    {
        driver.get("https://instagram.com");

    }


}
