package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by u.8005353-1 on 09/04/2019.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/MyApp.feature",glue={"StepDef"})
public class TestRunner {
}
