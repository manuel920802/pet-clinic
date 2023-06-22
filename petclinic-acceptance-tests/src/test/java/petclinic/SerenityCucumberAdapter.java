package petclinic;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SerenityCucumberAdapter {

    //Call the OnStage.setTheStage() method, to define a cast of actors for Screenplay
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    //Define a Cucumber Expression to convert actor names in our scenarios to Actor objects:
    @ParameterType(".*")
    public Actor actor (String actorName){
        return OnStage.theActorCalled(actorName);
    }
}
