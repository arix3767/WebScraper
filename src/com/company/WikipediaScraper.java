package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaScraper extends com.company.ChromeDriver{


    public WikipediaScraper(String url, String title, String content) {
        super(url, title, content);

    }

    public static String getTitle(ChromeDriver driver) {
        return driver.getTitle();
    }

    public static String getHistoryData(ChromeDriver driver) {
        WebElement historyContent = driver.findElement(By.id("content"));
        String data = historyContent.getText();
        data = data.substring(data.indexOf("History[edit]"), data.lastIndexOf("Components[edit]"));
        return data;
    }

    public static String getPictureUrl(ChromeDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[2]/tbody/tr[1]/td/a/img"))
                .getAttribute("src");
    }
}
