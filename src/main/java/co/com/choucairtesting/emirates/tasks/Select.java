package co.com.choucairtesting.emirates.tasks;

import co.com.choucairtesting.emirates.ui.BookPage;
import co.com.choucairtesting.emirates.utils.Wait;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.interactions.MouseMoveToLocation;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Select implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(BookPage.SELECT_CAR,isVisible()).forNoMoreThan(30).seconds(),
                MoveMouse.to(BookPage.SELECT_CAR),
                Click.on(BookPage.SELECT_CAR)
        );
        for(String winHandle : Serenity.getDriver().getWindowHandles()){
            Serenity.getDriver().switchTo().window(winHandle);
        }
    }
public static Select AnyCar(){
        return Tasks.instrumented(Select.class);
}
}
