package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com",
                "https://www.wayfair.com/",
                "https://www.walmart.com/",
                        "https://www.westelm.com/");

        WebDriver driver = BrowserFactory.getDriver("chrome");
        List<String>titles = new ArrayList<>();
        List<Boolean>comparison = new ArrayList<>();
        System.out.println("Is Url contains title");
        for (String each: urls ) {
            driver.get(each);
            if(each.contains(driver.getTitle().replace(" ", "").toLowerCase())){
                System.out.println("TEST PASSED");
            } else {
                System.out.println("TEST FAILED");
                System.out.println("url = " + each);
                System.out.println("title =" + driver.getTitle());
            }

        }

        driver.quit();
    }
}
