package CucumberTags.Features.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/Tag/Tags.feature",
        glue = {"stepDefinition"},
        tags = {"@smoke","@regression"} // deprecated
        // tags = {"@smock or @regression"}
        //  tags = {"@Smock or @regression"}
        //   tags = {"@regression and not @smoke"}
        //   tags = {"@smock or @regression) and not @important"}

)
public class TestRunner_RunWithSingleTag {
}
