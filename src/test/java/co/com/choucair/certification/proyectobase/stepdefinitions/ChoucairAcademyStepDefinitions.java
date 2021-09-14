package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than harold wants to learn automation at the academy Choucair$")
    public void thanHaroldWantsToLearnAutomationAtTheAcademyChoucair(){
        OnStage.theActorCalled("Harold").attemptsTo(OpenUp.thePage(),(Login.onThePage()));
    }

    @When("^he search for the course (.*) on the Choucair academy platform$")
    public void heSearchForTheCourseBDDDesarrolloGuiadoPorPruebasOnTheChoucairAcademyPlatform(String course){
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesBDDDesarrolloGuiadoPorPruebas(String question){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
