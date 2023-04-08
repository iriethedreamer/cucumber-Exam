package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	features="classpath:features",
	glue="steps",
	tags="@Scenario1 or @Scenario2",
	monochrome=true,
	dryRun=false,
	plugin= {
		"pretty",
		"html:target/reports/cucumber.htlm",
		"json:target/reports/cucumber.json"}
	
	)
			
			
	
		
		
		
		
		
		
		


public class TechfiosRunner {
	
 }