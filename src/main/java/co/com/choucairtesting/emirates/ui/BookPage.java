package co.com.choucairtesting.emirates.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BookPage {
    public static final Target SELECT_CAR = Target.the("Seleccionar carro").located(By.xpath("//button[@class='ct-btn ct-fill ct-xlarge ct-btn-p ct-margin-top ct-btn-spinner--xl ct-block']"));
    //filters
    public static final Target AIR_COND = Target.the("Aire acondicionado").located(By.cssSelector("label[for='carSpecifications-aircon']"));
    public static final Target PETROL = Target.the("Gasolina").located(By.cssSelector("label[for='carSpecifications-petrol']"));
    public static final Target RATING_GOOD = Target.the("Buena puntuación").located(By.cssSelector("label[for='hireCompanyRating-good']"));
    public static final Target RATING_AVERAGE = Target.the("Puntuación aceptable").located(By.cssSelector("label[for='hireCompanyRating-average']"));
    public static final Target SANITIZED_CAR = Target.the("Carro desinfectado").located(By.cssSelector("label[for='specialOffers-sanitized_car']"));
    public static final Target DEBIT_CARD = Target.the("Debito y credito").located(By.cssSelector("label[for='debitCard-debit']"));

}
