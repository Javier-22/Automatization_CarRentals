package co.com.choucairtesting.emirates.stepDefinitions;

import co.com.choucairtesting.emirates.model.SearchCarsData;
import co.com.choucairtesting.emirates.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CarRentalWithStepDefinition {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Then("The user types in pick-up, a date in pick-up date, a date in return date and age with the next data:")
    public void search_Cars(DataTable data){
        List<Map<String,String>> a = data.asMaps(String.class,String.class);
        SearchCarsData scd = new SearchCarsData(a.get(0).get("pick_up"),a.get(0).get("pick_up_date"),a.get(0).get("pick_up_time"),a.get(0).get("return_date"),a.get(0).get("return_time"),a.get(0).get("age"),a.get(0).get("return_location"));
        theActorInTheSpotlight().attemptsTo(Search.Cars(scd));
    }
    @Then("The user selects some filters and selects the first car in the list")
    public void Select_Filters_and_Cars(){
        theActorInTheSpotlight().attemptsTo(Choose.AnyFilters());
        theActorInTheSpotlight().attemptsTo(Select.AnyCar());
    }

    @Then("The user picks some extras and clicks the button continue")
    public void theUserPicksSomeExtrasAndClicksTheButtonContinue() {
        theActorInTheSpotlight().attemptsTo(Pick.Extras());
        theActorInTheSpotlight().attemptsTo(ClickTo.Continue());
    }
}
