package textexecute;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:target/cucumberreport","html:target/htmlreport"},
features={"src//test//resources//Login.feature"},
glue={"stepss"},
tags={"@SmokeTest"}
)

public class Testrunner {

}
