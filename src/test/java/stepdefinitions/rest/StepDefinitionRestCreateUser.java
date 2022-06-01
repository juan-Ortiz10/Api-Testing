package stepdefinitions.rest;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.ModelCreateUserRest;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import questions.LastResponseStatusCode;
import tasks.CreateUserRest;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static util.enums.Constant.VALUE;
import static util.enums.RestService.BASE_URL;

public class StepDefinitionRestCreateUser {
    @Before
    public void prepareStage(){
        setTheStage(new OnlineCast());
        theActorCalled("Brandon").whoCan(CallAnApi.at(BASE_URL.toString()));
    }
    @When("you create an user")
    public void youCreateAnUser(List<ModelCreateUserRest> modelCreateUserRests){
        theActorInTheSpotlight().attemptsTo(CreateUserRest.with(modelCreateUserRests));
    }
    @Then("I should see the user created")
    public void iShouldSeeTheUserCreated(){
        theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(VALUE)));
    }
}
