package co.com.choucairtesting.emirates.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class GoTo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://cars.cartrawler.com/emirates/en/#/searchcars")

        );
    }
    public static GoTo TheUrl(){
        return Tasks.instrumented(GoTo.class);
    }
}
