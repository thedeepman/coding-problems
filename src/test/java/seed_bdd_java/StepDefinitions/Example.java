package seed_bdd_java.StepDefinitions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import seed_bdd_java.SeedBddJava;

public class Example {
    SeedBddJava seedBddJava;
    int answer;

    @Given("I have a method")
    public void i_have_a_method() {
        seedBddJava = new SeedBddJava();
        return;
    }

    @When("I call it")
    public void i_call_it() {
        answer = seedBddJava.exampleMethod();
    }

    @Then("the result should be zero")
    public void the_result_should_be() {
        assertTrue(answer == 0);
    }
}
