package petclinic.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Displayed;
import petclinic.navigation.DisplayedVet;
import petclinic.navigation.Navigate;


public class VetStepDefinitions {

    @Given("{actor} is a Pet Clinic Owner")
    public void peter_is_a_pet_clinic_owner(Actor actor) {
        actor.attemptsTo(Navigate.toTheApplicationHomePage());

    }
    @When("{actor} views the vets in his clinic")
    public void he_views_the_vets_in_his_clinic(Actor actor) {
        actor.attemptsTo(Navigate.toTheVeterinariansList());

    }
    @Then("{actor} should see the name of each vet in the clinic")
    public void he_should_see_the_name_of_each_vet_in_the_clinic(Actor actor) {
        actor.attemptsTo(Ensure.that(DisplayedVet.names()).isNotEmpty());

    }
}
