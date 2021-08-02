package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="LoginAmz\\Features\\Login.feature",glue="org.stepDefinitions")
public class TestRunner {
	

}
