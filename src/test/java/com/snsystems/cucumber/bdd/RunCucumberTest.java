package com.snsystems.cucumber.bdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import org.springframework.test.context.ActiveProfiles;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
//        tags = "@login",
//        plugin = {"pretty", "json:target/cucumber.json"})
        plugin = {"pretty", "html:target/cucumber.html"})
//@ActiveProfiles("reg-test")
//@CucumberOptions(plugin = {"pretty", "html:target/cucumber"})
public class RunCucumberTest {

}
