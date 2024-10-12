package com.github.thedeepman.problems.StepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thedeepman.problems.StringCalculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StringCalculatorSteps {
    String input;
    int answer;
    StringCalculator calculator = new StringCalculator();

    @Given("I have a calculator input as {string}")
    public void i_have_a_calculator_input_as(String string) {
        input = string;
    }

    @When("I give send it to the calculator")
    public void i_give_send_it_to_the_calculator() {
        answer = calculator.calculate(input);
    }

    @Then("the calculator result should be {int}")
    public void the_calculator_result_should_be(Integer int1) {
        assertEquals(int1, answer);
    }
}
