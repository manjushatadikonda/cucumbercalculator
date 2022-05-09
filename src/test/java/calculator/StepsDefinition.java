package calculator;

import org.testng.Assert;
import org.testng.AssertJUnit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDefinition {
	int input1;
	int input2;
	Integer output;
	@Given("user inputs two int values to add {int} and {int}")
	public void user_inputs_two_int_values_to_add_and(Integer int1, Integer int2) {
	   input1=int1;
	   input2=int2;
	}
	@When("user calls add method")
	public void user_calls_add_method() {
	    output=input1+input2;
	}
	@Then("user should get addition output as {int}")
	public void user_should_get_addition_output_as(Integer int1) {
	    Assert.assertEquals(output, int1);
	}

	@Given("user inputs two int values to subtract {int} and {int}")
	public void user_inputs_two_int_values_to_subtract_and(Integer int1, Integer int2) {
		input1=int1;
		   input2=int2;
	}

	@When("user calls subtract method")
	public void user_calls_subtract_method() {
		 output=input1-input2;
	}

	@Then("user should get subtraction output as {int}")
	public void user_should_get_subtraction_output_as(Integer int1) {
		Assert.assertEquals(output, int1);
	}

	@Given("user inputs two int values to multiply {int} and {int}")
	public void user_inputs_two_int_values_to_multiply_and(Integer int1, Integer int2) {
		input1=int1;
		   input2=int2;
	}
	@When("user calls multiply method")
	public void user_calls_multiply_method() {
		 output=input1*input2;
	}
	@Then("user should get multiplication output as {int}")
	public void user_should_get_multiplication_output_as(Integer int1) {
		Assert.assertEquals(output, int1);
	}

	@Given("user inputs two int values to div {int} and {int}")
	public void user_inputs_two_int_values_to_div_and(Integer int1, Integer int2) {
		input1=int1;
		   input2=int2;
	}
	@When("user calls div method")
	public void user_calls_div_method() {
		 output=input1/input2;
	}
	@Then("user should get division output as {int}")
	public void user_should_get_division_output_as(Integer int1) {
		Assert.assertEquals(output, int1);
	}
}
