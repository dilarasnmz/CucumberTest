package com.test;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features" //Folder Name
		,glue={"stepDefiniton"}  //package name for step definition
		)

public class TestRunner {

}
