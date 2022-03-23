package co.com.choucairtesting.emirates.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCarsPage {
    public static final Target PICK_UP= Target.the("Recogida").located(By.id("pickupLocation"));
    public static final Target COUNTRY_LIST = Target.the("lista de paises").locatedBy(("#div-options-id-{0}"));
    public static final Target PICK_UP_CALENDAR = Target.the("Fecha de recogida").located(By.cssSelector("#ct-pickup-calendar"));
    public static final Target GET_MONTH= Target.the("Obtener mes").located(By.xpath("//button[@data-comp-id='ct-calendar-nav-pre']/parent::div//p[@class='ct-name']"));
    public static final Target SELECT_DATES = Target.the("Seleecionar dia").locatedBy("#{0}");
    public static final Target PICK_UP_TIME = Target.the("Hora de recogida").located(By.cssSelector("#pickupTime"));
    public static final Target SELECT_TIME_PICK_UP = Target.the("Seleccionar hora recogida").locatedBy("//ul[@data-auto-id='pickupTimesList']//li//a[.='{0}']");
    public static final Target SELECT_TIME_RETURN = Target.the("Seleccionar hora regreso").locatedBy("//ul[@data-auto-id='returnTimesList']//li//a[.='{0}']");
    public static final Target RETURN_DATE = Target.the("Fecha de regreso").located(By.cssSelector("#ct-return-calendar"));
    public static final Target RETURN_TIME = Target.the("Hora de regreso").located(By.cssSelector("#returnTime"));
    public static final Target SEARCH_BUTTON = Target.the("Botón buscar").located(By.cssSelector("button[name='searchCarsFormBtn']"));
    public static final Target ACCEPT_COOKIES = Target.the("Aceptar cookies").located(By.cssSelector("div.w-100.c.v-mid.pb3 >button"));
    public static final Target AGE_18_29_BUTTON = Target.the("18 a 29 años").located(By.id("ct-age-btn-0"));
    public static final Target AGE_18_29 = Target.the("18 a 29 años").located(By.id("ct-age-input-0"));
    public static final Target RETURN_LOCATION_LABEL= Target.the("Devolver en otra ubicación").located(By.cssSelector("label[aria-label='dropoffCheckbox2'] "));
    public static final Target RETURN_LOCATION = Target.the("Devolvida").located(By.id("returnLocation"));

    public static final Target NEXT_MONTH = Target.the("Siguiente mes").located(By.cssSelector("button[data-comp-id='ct-calendar-nav-next']"));
   /* public static final Target PICK_UP_TIME = Target.the("").located();
    public static final Target PICK_UP_TIME = Target.the("").located();
*/
}
