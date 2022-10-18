package Steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostSteps {

        @Given("^carry out for sale search$")
        public void carry_out_for_sale_search() throws Throwable {
            System.out.println("carry out for sale search");
        }

        @When("^I type the message in the box$")
        public void i_type_the_message_in_the_box() throws Throwable {
            throw new PendingException();
        }

        @Then("^the message should get posted$")
        public void the_message_should_get_posted() throws Throwable {
            throw new PendingException();
        }

        @And("^Click on sale button$")
        public void click_on_sale_button() throws Throwable {
            throw new PendingException();
        }

    }


