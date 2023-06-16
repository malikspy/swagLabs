package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@smoketest",
        features = {"classpath:features/login.feature"},
        glue = {"stepDefinitions"}
)
public class RunCucumberTest {
}