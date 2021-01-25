import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Volumes/TECH/Automations/UI-Automation/src/main/feature"},
        glue = {"steps"},
        plugin = {"pretty", "html:Report3"},
        monochrome = true,
        tags = "@randomTest"

)
public class TestRunner {


}
