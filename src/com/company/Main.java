package com.company;

import org.openqa.selenium.chrome.ChromeDriver;

import static com.company.WikipediaScraper.*;

public class Main {

    public static void main(String[] args) {

        String googleUrl = "https://en.wikipedia.org/wiki/Selenium_(software)";

        ChromeDriver driver = new ChromeDriver();

        driver.get(googleUrl);

        String pageTitle = getTitle(driver);

        String historyContent = getHistoryData(driver);

        String pictureUrl = getPictureUrl(driver);

        new WikipediaScraper(pictureUrl, pageTitle, historyContent);

        System.out.println("Title: " + getTitle(driver) + "\n");

        System.out.println(getHistoryData(driver));

        System.out.println("Url address: " + getPictureUrl(driver));

        driver.quit();

    }
}
