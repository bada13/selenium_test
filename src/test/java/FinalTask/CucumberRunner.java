package FinalTask;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/resources/"}, glue = {"FinalTask.steps"},
        plugin = {
                "FinalTask.util.AllureListener",
        })
public class CucumberRunner {
}
