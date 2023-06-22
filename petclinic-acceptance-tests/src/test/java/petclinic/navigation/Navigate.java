package petclinic.navigation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {

    public static Performable toTheApplicationHomePage() {
        return Open.url("http://localhost:4200/petclinic");
    }

    public static Performable toTheVeterinariansList() {
        return Click.on(MenuBar.VETERINARIANS).then(Click.on(MenuBar.ALL_VETERINARIANS));
    }
}
