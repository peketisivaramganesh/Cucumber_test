package runner;
 
import org.junit.runner.RunWith;
 
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.SnippetType;
 
@RunWith(Cucumber.class)
@CucumberOptions(
         features="Features",
         glue="com.Multi",
         plugin={"html:target/cucumber-html-report", "json:target/cucumber.json",
 "pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json", 
"junit:target/cucumber-results.xml"},
        dryRun = false,
        strict = true,
        tags={"@Smoke,@Regression"},
        monochrome = true,
        snippets=SnippetType.CAMELCASE
)
  public class Runner extends AbstractTestNGCucumberTests{
 
}