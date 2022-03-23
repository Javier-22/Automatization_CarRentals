package co.com.choucairtesting.emirates.tasks;

import co.com.choucairtesting.emirates.model.LeadDriverData;
import static co.com.choucairtesting.emirates.ui.LeadDriverDetailsPage.*;

import co.com.choucairtesting.emirates.utils.Wait;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

public class FillData implements Task {
    LeadDriverData ldd;
    public FillData(LeadDriverData ld){
        this.ldd = ld;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(ldd.getFirst_name()).into(FIRST_NAME),
                Enter.theValue(ldd.getSurname()).into(SURNAME),
                Enter.theValue(ldd.getE_mail()).into(E_MAIL),
                Click.on(COUNTRY_CODE),
                Click.on(SELECT_CODE.of(ldd.getCountry_code())),
                Enter.theValue(ldd.getPhone()).into(PHONE),
                Click.on(COUNTRY_REGION),
                Click.on(SELECT_CR.of(ldd.getCountry_region())),
                Enter.theValue(ldd.getCity()).into(CITY),
                Enter.theValue(ldd.getAddress()).into(ADDRESS),
                Scroll.to(ASD)
                );
        actor.attemptsTo(
                Switch.toFrame("ct-secure-payment"),
                Enter.theValue(ldd.getCard_number()).into(CARD_NUMBER),
                Enter.theValue(ldd.getName()).into(NAME).thenHit(Keys.TAB)
        );
        String[] splitDate = ldd.getCard_expiration_date().split("/");
        String year = splitDate[0].substring(2,4);
        String month = splitDate[1];
        Wait.Time(1000);
        for (int i =0 ; i< Integer.parseInt(month); i++){
            Wait.Time(200);
            actor.attemptsTo(
                Hit.the(Keys.ARROW_DOWN).into(CARD_EXPIRATION_MONTH)
            );
        }
        Wait.Time(500);
        for (int i =21 ; i< Integer.parseInt(year); i++){
            Wait.Time(200);
            actor.attemptsTo(
                    Hit.the(Keys.ARROW_DOWN).into(CARD_EXPIRATION_YEAR)
            );
        }
        actor.attemptsTo(
                Click.on(SECURITY_CODE),
                Enter.theValue(ldd.getSecurity_code()).into(SECURITY_CODE)
        );
                Serenity.getDriver().switchTo().defaultContent();
        actor.attemptsTo(
                Click.on(ACCEPT_TERMS)
        );
    }
    public static FillData OfLeadDriver(LeadDriverData ld){
        return Tasks.instrumented(FillData.class, ld);
    }
}
