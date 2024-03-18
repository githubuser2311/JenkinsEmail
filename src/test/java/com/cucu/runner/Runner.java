package com.cucu.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sride\\eclipse-workspace\\practice\\CucumberEmails\\Features\\Feature1.feature",
glue = {"com.cucu.Steps"},
plugin= {"pretty","html:target/cucumber-reports/cucumber.html","json:target/cucumber-reports/cucumber.json"},monochrome=true
)
public class Runner {

}
