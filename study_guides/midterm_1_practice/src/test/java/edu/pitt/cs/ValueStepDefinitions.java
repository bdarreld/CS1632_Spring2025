package edu.pitt.cs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class ValueStepDefinitions {
	Value value;

	@Given("a Value")
	public void aValue(){
		value = new Value();
	}

	@When("I call incVal {int} time(s)")
	public void iCallIncValTime(Integer num){
		for(int i = 0; i < num; i++){
			value.incVal();
		}
	}

	@Then("getVal returns {int}")
	public void getValReturns(Integer result){
		assertEquals( (int) result, value.getVal());
	}
}
