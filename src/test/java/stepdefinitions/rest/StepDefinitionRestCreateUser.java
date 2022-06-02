package stepdefinitions.rest;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import questions.LastResponseStatusCode;
import tasks.CreateUserRest;

import java.util.List;
import java.util.Map;

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
    public void youCreateAnUser(DataTable data){
        List<Map<String, String>> newlista = data.asMaps();
        theActorInTheSpotlight().attemptsTo(CreateUserRest.with(newlista.get(0)));
    }
    @Then("I should see the user created")
    public void iShouldSeeTheUserCreated(){
        theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(VALUE)));
    }
}
