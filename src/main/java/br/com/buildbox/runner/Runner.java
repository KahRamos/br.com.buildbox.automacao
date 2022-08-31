package br.com.buildbox.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"br.com.buildbox.steps"},
        tags = {"@homePage"},
        monochrome = true,
        dryRun = false,
        plugin = {"pretty",
                "html:target/cucumber-reports",
                "json:target/cucumber-reports/cucumber.json",
                "junit:target/cucumber-reports/cucumber.xml",
        }
)
public class Runner {

}
