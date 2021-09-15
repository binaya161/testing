package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\binay\\OneDrive\\Documents\\Cucumber\\FreeCrmDDFrameWork\\src\\main\\java\\Features\\login.feature",
        glue={"stepDefinitions"}
        //format= {"pretty","html:test-outout"}
)

public class TestRunner {
}

