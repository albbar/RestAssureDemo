package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\user\\IdeaProjects\\BaseProjects\\RestAssuredDemo\\src\\test\\resources\\features\\calculatorApp.feature",
        glue = "stepsDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class CalculatorAppRunner {
}
