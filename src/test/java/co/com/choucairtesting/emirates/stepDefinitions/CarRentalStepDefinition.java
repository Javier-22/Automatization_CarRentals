package co.com.choucairtesting.emirates.stepDefinitions;


import co.com.choucairtesting.emirates.model.LeadDriverData;
import co.com.choucairtesting.emirates.model.SearchCarsData;
import co.com.choucairtesting.emirates.questions.ShouldSeeConfirmBooking;
import co.com.choucairtesting.emirates.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import javax.xml.crypto.Data;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CarRentalStepDefinition {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("The user has been opened the Emirates car rental page")
    public void open_Url() {
        theActorCalled("user").attemptsTo(GoTo.TheUrl());
    }
    @Then("The user types in pick-up, a date in pick-up date and a date in return date with the next data:")
    public void search_Cars(DataTable data){
        List<Map<String,String>> a = data.asMaps(String.class,String.class);
        SearchCarsData scd = new SearchCarsData(a.get(0).get("pick_up"),a.get(0).get("pick_up_date"),a.get(0).get("pick_up_time"),a.get(0).get("return_date"),a.get(0).get("return_time"),"","");
        theActorInTheSpotlight().attemptsTo(Search.Cars(scd));
    }
    @And("The user selects the first car in the list")
    public void selectCar(){
        theActorInTheSpotlight().attemptsTo(Select.AnyCar());
    }
    @And("The user clicks the button continue")
    public void clickContinue(){
        theActorInTheSpotlight().attemptsTo(ClickTo.Continue());
    }
    @And("The user fills form with the next data:")
    public void fillData(DataTable data){
        List<Map<String,String>> a = data.asMaps(String.class, String.class);
        LeadDriverData ldd= new LeadDriverData(a.get(0).get("first_name"), a.get(0).get("surname"), a.get(0).get("e_mail"), a.get(0).get("country_code"), a.get(0).get("phone"), a.get(0).get("country_region"), a.get(0).get("city"), a.get(0).get("address"), a.get(0).get("card_number"), a.get(0).get("name"), a.get(0).get("card_expiration_date"), a.get(0).get("security_code"));
         theActorInTheSpotlight().attemptsTo(FillData.OfLeadDriver(ldd));
    }

    @When("The user must see the button Confirm Booking available")
    public void theUserMustSeeTheButtonConfirmBookingAvailable() {
        theActorInTheSpotlight().should(seeThat(ShouldSeeConfirmBooking.isClickeable()));
    }
}