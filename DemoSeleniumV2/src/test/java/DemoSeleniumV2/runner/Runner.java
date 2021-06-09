package DemoSeleniumV2.runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        , glue = "DemoSeleniumV2/steps"
)
public class Runner {
}
