package com.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features", // Folder Name
    glue = {"stepDefiniton"} // Package names for step definitions
)

public class TestRunner {

}
