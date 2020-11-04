package e2e.cucumber.runners;

import org.happykraken.resources.TestSingleton;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/e2e/cucumber/features",
        tags = {"@FirstTest"},
        glue = {"org.happykraken.step_definitions"},
        plugin = { "pretty", "html:target/cucumber/FirstTest", "json:target/cucumber/FirstTest/cucumber.json", "junit:target/cucumber/FirstTest/cucumber.xml" }
)
public class First_Test {

    @BeforeClass
    public static void before() {
        TestSingleton.initChromeInstance();
    }

    @AfterClass
    public static void after() {
        TestSingleton.endInstance();
    }
}
