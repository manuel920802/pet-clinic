package petclinic.navigation;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class DisplayedVet {

    public static Question<String> names() {
        return Text.of(VetList.VET_NAMES);
    }
}
