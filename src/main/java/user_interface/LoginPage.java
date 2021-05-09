package user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.xpath;

public class LoginPage {

    public static final Target LBL_SIGNIN =
            the("SIGN IN").located(xpath("//a[contains(text(),'Sign in')]"));

    public static final Target TXT_EMAIL =
            the(" EMAIL").located(By.id("email"));


    public static final Target TXT_PASS =
            the(" PASS").located(By.id("passwd"));


    public static final Target BTN_SUBMIT =
            the(" SUBMIT").located(By.id("SubmitLogin"));
}
