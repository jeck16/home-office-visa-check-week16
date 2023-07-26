package gov.uk.check.visa.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featureflie",
        glue = " home/office/visa/check",
        tags = "@regression",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)
public class Regression {

    @AfterClass
    public static void setUp() {
    }
}
