package selenium.tsetrunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonAutomation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
//        to find any element on menu tab like mobiles, fashion,need to chang index
//        driver.findElement(By.xpath("//div[@id='nav-xshop']//a[3]")).click();
       WebElement element= driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in']"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        WebElement ele = driver.findElement(By.xpath("//div[@id='nav-flyout-icp']/div[2]/a[2]/span[@class='nav-text']"));
        Thread.sleep(10000);
        Select lenguage = new Select(ele);
        Thread.sleep(10000);
//                lenguage.selectByIndex(1);
        //*[@id="nav-flyout-icp"]/div[2]/span[1]/span/i
        //*[@id="nav-flyout-icp"]/div[2]/a[1]/span
        //*[@id="nav-flyout-icp"]/div[2]/a[1]/span
        //*[@id="nav-flyout-icp"]/div[2]/a[1]

    }
}
