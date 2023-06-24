package tasks;

import models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;

import static userinterfaces.CMRAlkomprarHomePage.*;

public class LogIn implements Task {

    private User user;

    public LogIn(User user) {
        this.user = user;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("adminpqr3").into(SELECT_NAME),
                Enter.theValue("123").into(SELECT_PASS),
                Click.on(BUTTON_INGRESAR)
        );
    }
    public static LogIn withThe(User user){
        return Tasks.instrumented(LogIn.class, user);
    }
}
