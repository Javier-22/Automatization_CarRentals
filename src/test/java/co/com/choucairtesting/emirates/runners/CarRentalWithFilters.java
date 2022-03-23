package co.com.choucairtesting.emirates.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"co.com.choucairtesting.emirates.stepDefinitions"},
        features = {"src/test/resources/features/CarRentalWithFilters.feature"}
)
public class CarRentalWithFilters {
}
