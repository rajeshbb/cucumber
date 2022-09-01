package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)

@CucumberOptions

    (
    		
    	features=".//feature/addcustomer.feature",
    	glue="stepdefinations",
    	monochrome=true, 
        dryRun=false,
    	// removes uncesseray  characters in console using monochrome
    	plugin= {"pretty",
    			"html:test-output"}
    		
    		
    		
    		)
public class testrun {

	
	
	
}



//104,102 shetty ramesh




