package seed_bdd_java.StepDefinitions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import seed_bdd_java.SeedBddJava;

public class Examples {
    SeedBddJava seedBddJava;
    int answer;

    @Given("I have a new method")
    public void i_have_a_new_method() {
        seedBddJava = new SeedBddJava();
        return;
    }

    @When("I give it {int} and {string}")
    public void i_give_it_and(int num, String taskname) {
        answer = seedBddJava.methodWithExamples(num, taskname);
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int result) {
        assertTrue(answer == result);
    }
}
