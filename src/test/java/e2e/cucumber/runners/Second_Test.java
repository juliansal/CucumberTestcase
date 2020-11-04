package e2e.cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.happykraken.resources.TestSingleton;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/e2e/cucumber/features",
        tags = {"@SecondTest"},
        glue = {"org.happykraken.step_definitions"},
        plugin = { "pretty", "html:target/cucumber/SecondTest", "json:target/cucumber/SecondTest/cucumber.json", "junit:target/cucumber/SecondTest/cucumber.xml" }
)
public class Second_Test {

    @BeforeClass
    public static void before() {
        TestSingleton.initChromeInstance();
    }

    @AfterClass
    public static void after() {
        TestSingleton.endInstance();
    }
}
