package co.com.choucair.certification.proyectobase.tasks;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ChoucairLoginPage.LOGIN_BUTTON, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue("haltamirandas").into(ChoucairLoginPage.INPUT_USER),
                Enter.theValue("Choucair2021*").into(ChoucairLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairLoginPage.ENTER_BUTTON)
        );
    }
}
