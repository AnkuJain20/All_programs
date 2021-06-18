package selenium.tsetrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/selenium/feature",glue= {"selenium/StepDefinations"})


public class TestRunner {
}
