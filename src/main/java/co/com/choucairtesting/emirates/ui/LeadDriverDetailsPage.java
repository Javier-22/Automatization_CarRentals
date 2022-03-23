package co.com.choucairtesting.emirates.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LeadDriverDetailsPage {
    public static final Target FIRST_NAME = Target.the("Nombre").located(By.id("firstname"));
    public static final Target SURNAME = Target.the("Apellido").located(By.id("surname"));
    public static final Target E_MAIL = Target.the("Email").located(By.id("email"));
    public static final Target COUNTRY_CODE = Target.the("Código de país").located(By.id("contactPrefix"));
    public static final Target SELECT_CODE = Target.the("Seleecionar codigo").locatedBy("//option[contains(text(),'{0}')]");
    public static final Target PHONE = Target.the("Telefono").located(By.id("contactNo"));
    public static final Target COUNTRY_REGION = Target.the("Region o país").located(By.id("country"));
    public static final Target SELECT_CR = Target.the("Seleccionar país o región").locatedBy(("//option[.='{0}']"));
    public static final Target CITY = Target.the("Ciudad").located(By.id("city"));
    public static final Target ADDRESS = Target.the("Direccion").located(By.id("address1"));
    public static final Target SWITCH_TO_PAY_FORM = Target.the("Cambiar a pago").located(By.id("ct-payment"));
    public static final Target CARD_NUMBER = Target.the("Número de tarjeta").located(By.cssSelector("input[name='cardNumber']"));
    public static final Target NAME = Target.the("Nombre").located(By.id("cardName"));
    public static final Target CARD_EXPIRATION_MONTH = Target.the("Mes de expiración").located(By.id("expiryDateMonth"));
    public static final Target SELECT_MONTH_AND_YEAR = Target.the("Seleccionar mes o año").locatedBy("option[value='{0}']");
    public static final Target CARD_EXPIRATION_YEAR = Target.the("Año de expiración").located(By.id("expiryDateYear"));
    public static final Target SECURITY_CODE = Target.the("cvv").located(By.id("seriesCode"));
    public static final Target ACCEPT_TERMS = Target.the("Aceptar terminos").located(By.xpath("//div[@class='ct-form-field'] // div[@name='confirmationAllConditions'] //label"));
    public static final Target ASD = Target.the("").located(By.xpath("//span[contains(text(),'Secure Payment Details')]"));
    public static final Target COMFIRM_BOOKING = Target.the("Botón confirmar reserva").located(By.cssSelector("div.ct-grid-row.ct-text-center.ct-cta-block > button[ct-tracking='ConfirmBk']"));
}
