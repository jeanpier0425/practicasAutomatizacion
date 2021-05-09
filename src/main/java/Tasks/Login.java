package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import user_interface.LoginPage;

import static user_interface.LoginPage.*;

public class Login implements Task {

    private String email;
    private String pass;


    public Login(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LBL_SIGNIN),
                Enter.theValue(email).into(TXT_EMAIL),
                Enter.theValue(pass).into(TXT_PASS),
                Click.on(BTN_SUBMIT)
        );
    }


    public static Login enLaPagina(String email, String pass){
        return Tasks.instrumented(Login.class,email,pass);
    }
}
