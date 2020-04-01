package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
	(
			features = {"src//test//java//feature"},
			glue = {"functions"},
			plugin={"pretty", "json:output/reports.xml", "html:output/reports"},
			monochrome = true
	)

public class Runner {

}
