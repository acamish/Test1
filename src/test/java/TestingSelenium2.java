package test.java;

import org.testng.annotations.Test;

/**
 * Created by achoudhary on 2/17/17.
 */
public class TestingSelenium2 extends BaseClass{

    @Test
    public void test5()
    {
        driver.get("https://hub.docker.com");

    }

    @Test
    public void test6()
    {
        driver.get("https://bing.com");

    }

    @Test
    public void test7()
    {
        driver.get("https://gmail.com");

    }

    @Test
    public void test8()
    {
        driver.get("https://msn.com");

    }

}
