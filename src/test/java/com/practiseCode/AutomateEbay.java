package com.practiseCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.Set;

public class AutomateEbay {
    public static void main(String[] args) {
        String ebayUrl = "https://www.ebay.com/";
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe" );

        WebDriver webDriver = new ChromeDriver();
        webDriver.get(ebayUrl);

        //XPaths
        String allCategoryDrpDwn = "//select[@aria-label=\"Select a category for search\"]";
        String searchBtn = "//input[@type=\"submit\"]";
        String orignalWebLink = "//a[contains(text(),\"originalfables.com\")]/parent::div/following-sibling::div/a";

        WebElement drpDownElement = webDriver.findElement(By.id(allCategoryDrpDwn));

        Select dropDown = new Select(drpDownElement);
        dropDown.selectByValue("Clothing, Shoes & Accessories");

        WebElement searchBtnElement = webDriver.findElement(By.id(searchBtn));
        searchBtnElement.click();

        if(searchBtnElement.isDisplayed()){

        }

        WebElement orignalWebLinkElement = webDriver.findElement(By.id(orignalWebLink));
        orignalWebLinkElement.click();











    }
}



