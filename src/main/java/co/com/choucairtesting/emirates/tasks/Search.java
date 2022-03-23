package co.com.choucairtesting.emirates.tasks;

import co.com.choucairtesting.emirates.model.SearchCarsData;
import static co.com.choucairtesting.emirates.ui.SearchCarsPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.choucairtesting.emirates.utils.MonthsCalendar;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.Objects;

public class Search implements Task {
    SearchCarsData sd;
    ArrayList<String> mc;
    public Search(SearchCarsData data) {
        this.sd = data;
        this.mc = MonthsCalendar.addMonths().getMonths();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if(ACCEPT_COOKIES.resolveFor(actor).isVisible()){
            actor.attemptsTo(Click.on(ACCEPT_COOKIES));
        }
        actor.attemptsTo(
                Enter.theValue(sd.getPick_up()).into(PICK_UP),
                WaitUntil.the(COUNTRY_LIST.of("0"),isVisible()).forNoMoreThan(15).seconds(),
                Hit.the(Keys.ARROW_DOWN,Keys.ENTER).into(PICK_UP),
                WaitUntil.the(PICK_UP_CALENDAR,isVisible()).forNoMoreThan(15).seconds(),
                Click.on(PICK_UP_CALENDAR)
                );
        String[] fecha = sd.getPick_up_date().split("/");
        String aux = "day-"+fecha[0]+fecha[1]+fecha[2];
        int Month = Integer.parseInt(fecha[1]);
        String get_month = GET_MONTH.resolveFor(actor).getText();
        String aux2 = mc.get(Month-1)+ " " + fecha[0];
        while (!Objects.equals(get_month, aux2)){
            actor.attemptsTo(Click.on(NEXT_MONTH));
            get_month = GET_MONTH.resolveFor(actor).getText();
        }
        actor.attemptsTo(
                Click.on(SELECT_DATES.of(aux)),
                Click.on(PICK_UP_TIME),
                Click.on(SELECT_TIME_PICK_UP.of(sd.getPick_up_time()))
        );
        fecha = sd.getReturn_date().split("/");
        aux = "day-"+fecha[0]+fecha[1]+fecha[2];
        Month = Integer.parseInt(fecha[1]);
        get_month = GET_MONTH.resolveFor(actor).getText();
        aux2 = mc.get(Month-1)+ " " + fecha[0];
        while (!Objects.equals(get_month, aux2)){
            actor.attemptsTo(Click.on(NEXT_MONTH));
            get_month = GET_MONTH.resolveFor(actor).getText();
        }
        actor.attemptsTo(
                Click.on(SELECT_DATES.of(aux)),
                Click.on(RETURN_TIME),
                Click.on(SELECT_TIME_RETURN.of(sd.getReturn_time()))
        );
        if(sd.getAge()!=""){
            actor.attemptsTo(
                    Click.on(RETURN_LOCATION_LABEL),
                    Enter.theValue(sd.getReturn_location()).into(RETURN_LOCATION),
                    WaitUntil.the(COUNTRY_LIST.of("1"),isVisible()).forNoMoreThan(15).seconds(),
                    Hit.the(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).into(RETURN_LOCATION),
                    Click.on(AGE_18_29_BUTTON),
                    Enter.theValue(sd.getAge()).into(AGE_18_29)
            );
        }
        actor.attemptsTo(
                Click.on(SEARCH_BUTTON)
        );
    }
    public static Search Cars(SearchCarsData listData){
        return Tasks.instrumented(Search.class,listData);
    }
}
