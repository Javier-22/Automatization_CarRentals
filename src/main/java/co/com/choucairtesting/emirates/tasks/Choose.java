package co.com.choucairtesting.emirates.tasks;

import static co.com.choucairtesting.emirates.ui.BookPage.*;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Choose implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AIR_COND),
                Click.on(PETROL),
                Click.on(RATING_GOOD),
                Click.on(RATING_AVERAGE),
                Click.on(SANITIZED_CAR),
                Click.on(DEBIT_CARD)
        );
    }
    public static Choose AnyFilters(){
        return Tasks.instrumented(Choose.class);
    }
}
