package com.example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        glue = {"com.example"},
        features = {"src/test/resources"},
        plugin = {"pretty", "html:reports/cucumber.html", "json:reports/cucumber.json"}
)
public class CucumberTest {
}
