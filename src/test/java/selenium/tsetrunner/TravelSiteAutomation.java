package selenium.tsetrunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TravelSiteAutomation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.goibibo.com/");

        driver.manage().window().maximize();

//        WebElement element1 = driver.findElement(By.id("student_fare_check"));
//        System.out.println("isSelected:" + element1.isSelected());
//        element1.submit();

        Actions act =  new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//span[text()='Student Fare']"))).click().perform();

//        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//        System.out.println("number of checkboxes: " + checkBoxes.size());
//        WebElement element = checkBoxes.get(0);
//
//        System.out.println("isSelected:" + element.isSelected());
//        element.click();

        driver.close();

//        for(WebElement element: checkBoxes){
////            checkBoxesActions actions = new Actions(driver);
//            Thread.sleep(5000);
//            element.click();
//
//
//        }

    }
}
