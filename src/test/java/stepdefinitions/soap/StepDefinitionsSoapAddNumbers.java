package stepdefinitions.soap;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import questions.LastResponseStatusCode;
import tasks.AddNumbers;
import util.enums.SoapService;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static util.enums.SoapService.*;

public class StepDefinitionsSoapAddNumbers {
    @Before
    public void prepareStage(){
        setTheStage(new OnlineCast());
        theActorCalled("Brandon").whoCan(CallAnApi.at(BASE_URL.toString()));
    }
    @When("you add two numbers")
    public void youAddTwoNumbers(List<String> values) {
        theActorInTheSpotlight().attemptsTo(AddNumbers.with(values));
    }
    @Then("I should see the response of the service is {int}")
    public void iShouldSeeTheResponseOfTheServiceIs(int code) {
        theActorInTheSpotlight().should(seeThat("last response status code is 200", LastResponseStatusCode.is(code)));
    }
}
