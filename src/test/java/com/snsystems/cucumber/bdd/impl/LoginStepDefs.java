package com.snsystems.cucumber.bdd.impl;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    @Given("^Login url of the application$")
    public void login_url_of_the_application() {
        System.out.println("Given.. login_url_of_the_application");
    }
    @When("^User enters username as \\\"(.*)\\\"$")
    public void user_enters_a_valid_username(String username) throws Throwable {
        System.out.println("When.. user_enters_a_valid_username : " + username);
    }
    @When("^User enters password as \\\"(.*)\\\"$")
    public void user_enters_a_valid_password(String manager_password) throws Throwable {
        System.out.println("When.. user_enters_a_valid_password :" + manager_password);
    }
    @Then("^User should be logged in successfully$")
    public void user_should_be_logged_in_successfully() throws Throwable {
        System.out.println("Then.. user_should_be_logged_in_successfully");
    }


    @Given("^Manager is logged in$")
    public void manager_is_logged_in() {
    	System.out.println("Given... manager_is_logged_in");
    }
    @When("Manager clicks New Customer link")
    public void manager_clicks_new_customer_link() {
        System.out.println("When... manager_clicks_new_customer_link");
    }
    @When("Manager enters values in the given fields")
    public void manager_enters_values_in_the_given_fields() {
        System.out.println("When... manager_enters_values_in_the_given_fields");
    }
    @When("User clicks the submit button")
    public void user_clicks_the_submit_button() {
        System.out.println("When... user_clicks_the_submit_button");
    }
    @Then("New customer record should be created successfully")
    public void new_customer_record_should_be_created_successfully() {
        System.out.println("Then... new_customer_record_should_be_created_successfully");
    }



}
