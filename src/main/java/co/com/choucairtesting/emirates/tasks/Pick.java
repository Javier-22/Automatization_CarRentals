package co.com.choucairtesting.emirates.tasks;

import co.com.choucairtesting.emirates.ui.BookPage;
import co.com.choucairtesting.emirates.ui.OptionsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Pick implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OptionsPage.GPS),
                Click.on(OptionsPage.CHILD_SEAT),
             //   Click.on(OptionsPage.BOOSTER_SEAT)
                Click.on(OptionsPage.INFANT_CHILD_SEAT)
        );

    }
    public static Pick Extras(){
        return Tasks.instrumented(Pick.class);
    }
}
