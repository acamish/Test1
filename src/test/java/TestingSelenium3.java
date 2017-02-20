package test.java;

import org.testng.annotations.Test;

/**
 * Created by achoudhary on 2/17/17.
 */
public class TestingSelenium3 extends BaseClass{

    @Test
    public void test9()
    {
        driver.get("https://paytm.com");
        System.out.println("paytm here here");

    }

    @Test
    public void test10()
    {
        driver.get("https://mobikwik.com");
        System.out.println("mobi here");
    }

    @Test
    public void test11()
    {
        driver.get("https://outlook.com");
        System.out.println("outlook here");
    }

    @Test
    public void test12()
    {
        driver.get("https://flipkart.com");
        System.out.println("flipk here");
    }

}
