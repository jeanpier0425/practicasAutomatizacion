package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import user_interface.HomePage;

public class OpenBrowser implements Interaction {

    HomePage homePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(homePage));
    }

    public static OpenBrowser withUrl(){
        return Tasks.instrumented(OpenBrowser.class);
      }

}
