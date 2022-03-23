package co.com.choucairtesting.emirates.questions;

import co.com.choucairtesting.emirates.ui.LeadDriverDetailsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class ShouldSeeConfirmBooking implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resp;
        if (LeadDriverDetailsPage.COMFIRM_BOOKING.resolveFor(actor).isClickable()){
            resp = true;
        }else{
            resp = false;
        }
        return resp;
    }
    public static ShouldSeeConfirmBooking isClickeable(){
        return new ShouldSeeConfirmBooking();
    }
}
