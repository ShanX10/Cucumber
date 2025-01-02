package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
				features="C:\\Users\\Shan\\eclipse-workspace\\cucuberproject\\src\\test\\java\\stepdefinition\\multiplescenario.java",
				glue="stepdefinition",
				dryRun=false
				)
public class mutiplelogin {

}
