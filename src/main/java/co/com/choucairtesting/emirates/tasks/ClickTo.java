package co.com.choucairtesting.emirates.tasks;

import co.com.choucairtesting.emirates.ui.OptionsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClickTo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OptionsPage.CONTINUE_BUTTON,isVisible()).forNoMoreThan(30).seconds(),
                Click.on(OptionsPage.CONTINUE_BUTTON)
        );
    }
    public static ClickTo Continue(){
        return Tasks.instrumented(ClickTo.class);
    }
}
