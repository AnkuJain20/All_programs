package selenium;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumCodeSnippet {

    public static void main(String args[]) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");

        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.spicejet.com/");
//        driver.get("https://www.google.com/");

        playVideoSongs(driver);



        setDriverProperties(driver);

        takeScreenShot(driver);

        selectCheckBox(driver);

        dropDownUsingSelect(driver);

        handleChildWindows(driver);

        mouseClickUsingActionClass(driver);

        frameReadFromParent(driver);

        alertBoxHandling(driver);

    }

    private static void playVideoSongs(WebDriver driver) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver.get("https://www.youtube.com/");
        driver.findElement(By.id("search")).sendKeys("Arijit sing songs");
        driver.findElement(By.id("search-icon-legacy")).click();

        Thread.sleep(5000);


        List<WebElement> elements=driver.findElements(By.xpath("//a[@class= 'yt-simple-endpoint style-scope ytd-video-renderer']"));
        int size = elements.size();
        System.out.println(size);
        elements.get(5).click();


    }

    private static void alertBoxHandling(WebDriver driver) {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        // This step will result in an alert on screen
        driver.findElement(By.id("alertButton")).click();
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();
        simpleAlert.getText();
        simpleAlert.dismiss();
        simpleAlert.sendKeys("abx");
        simpleAlert.accept();
    }

    private static void frameReadFromParent(WebDriver driver) {
        driver.get("http://demo.guru99.com/test/guru99home/");
        // navigates to the page consisting an iframe

        driver.manage().window().maximize();
        driver.switchTo().frame("a077aa5e"); //switching the frame by ID

        System.out.println("********We are switch to the iframe*******");
        driver.findElement(By.xpath("html/body/a/img")).click();
//        to go back to main page
        driver.switchTo().defaultContent();
    }

    private static void mouseClickUsingActionClass(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.click();
        WebElement two = driver.findElement(By.id("two"));
        actions = new Actions(driver);
        actions.moveToElement(two).contextClick().perform();
    }

    private static void handleChildWindows(WebDriver driver) {
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

        driver.findElement(By.cssSelector(".blinkingText")).click();

        Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]

        Iterator<String> it = windows.iterator();

        String parentId = it.next();

        String childId = it.next();

        driver.switchTo().window(childId);

        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

        driver.findElement(By.cssSelector(".im-para.red")).getText();

        String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

        driver.switchTo().window(parentId);

        driver.findElement(By.id("username")).sendKeys(emailId);
    }

    private static void dropDownUsingSelect(WebDriver driver) {
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);

        dropdown.selectByIndex(2);


        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
    }

    private static void selectCheckBox(WebDriver driver) {
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());

        System.out.println(driver.findElements(By.cssSelector("input[type = 'checkbox']")).size());
        //here we are counting the number of checkboxes, so we have checked the type = checkbox, and count all those elements whose
//        type = checkbox.

    }

    private static void takeScreenShot(WebDriver driver) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\Anku\\screenshot.png"));
    }

    private static void setDriverProperties(WebDriver driver) {
        driver.manage().window().maximize();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS );

        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("testId")));



    }


}
