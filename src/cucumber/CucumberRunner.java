package cucumber;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue={"stepDefinition"},dryRun=true)
public class CucumberRunner {
	
}
