package petclinic.navigation;

import net.serenitybdd.screenplay.targets.Target;

public class VetList {

    public static final Target VET_NAMES = Target.the("List of vets").locatedBy("#vets tbody tr td:nth-child(1)");
}
