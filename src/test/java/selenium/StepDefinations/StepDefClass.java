package selenium.StepDefinations;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class StepDefClass {

    static {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    }

    WebDriver driver;


    @Given("Open Browser and Maximize it")
    public void open_Browser_and_Maximize_it() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }


    @Then("Home Page should display with title {string}")
    public void homePageShouldDisplayWithTitle(String expectedTitle) {
        System.out.println("expected title is:" + expectedTitle);
        String actualTitle = driver.getTitle();


        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @And("close the browser")
    public void closeTheBrowser() {
        driver.close();
    }

//    @Given("Open browser and navigate to url {string}")
//    public void openBrowserAndNavigateToUrl(String url) {
//        driver = new ChromeDriver();
//        driver.get(url);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//    }
//
//    @When("Search for product {string}")
//    public void searchForProduct(String productName) {
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
//        driver.findElement(By.id("nav-search-submit-button")).click();
//    }
//
//    @Then("Product page should be displayed with title {string}")
//    public void productPageShouldBeDisplayedWithTitle(String expectedProductTitle) {
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle, expectedProductTitle);
//    }
//
//    @When("navigate to URL {string}")
//    public void navigateToURL(String url) {
//        System.out.println("URL:" + url);
//        driver.get(url);
//    }
@Before
    @Given("User is on the landing page with URL {string}")
    public void userIsOnTheLandingPageWithURL(String url) {

        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @When("send the username with {string} and password with {string}")
    public void send_the_username_with_and_password_with(String Username, String password) {
driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
      driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(Username);
driver.findElement(By.xpath("//input[@id='continue']")).click();
    }

    @Then("user is not able to login-incorrect username and password")
    public void user_is_not_able_to_login_incorrect_username_and_password() {

    }


}
