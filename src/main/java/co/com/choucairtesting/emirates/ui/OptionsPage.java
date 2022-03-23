package co.com.choucairtesting.emirates.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OptionsPage {
    public static final Target CONTINUE_BUTTON = Target.the("Botón continuar").located(By.cssSelector("button[data-auto-id='btnContinue1']"));
    //extras
    public static final Target GPS = Target.the("GPS").located(By.xpath("//span[contains(text(),'GPS')]/ancestor::strong/parent::div/parent::div[@class='ct-grid']/parent::div/parent::div[@class='ct-grid ct-hybrid-grid']//div[@class='ct-grid-unit-4-16 ct-text-center']//button[@class='btn-action-extras btn-action-extras_plus ct-transition']"));
    public static final Target CHILD_SEAT = Target.the("Asiento de niños").located(By.xpath("//span[contains(text(),'Child toddler seat')]/ancestor::strong/parent::div/parent::div[@class='ct-grid']/parent::div/parent::div[@class='ct-grid ct-hybrid-grid']//div[@class='ct-grid-unit-4-16 ct-text-center']//button[@class='btn-action-extras btn-action-extras_plus ct-transition']"));
    public static final Target BOOSTER_SEAT = Target.the("GPS").located(By.xpath("//span[contains(text(),'Booster Seat')]/ancestor::strong/parent::div/parent::div[@class='ct-grid']/parent::div/parent::div[@class='ct-grid ct-hybrid-grid']//div[@class='ct-grid-unit-4-16 ct-text-center']//button[@class='btn-action-extras btn-action-extras_plus ct-transition']"));
    public static final Target INFANT_CHILD_SEAT = Target.the("Asiento para bebes").located(By.xpath("//span[contains(text(),'Infant child seat')]/ancestor::strong/parent::div/parent::div[@class='ct-grid']/parent::div/parent::div[@class='ct-grid ct-hybrid-grid']//div[@class='ct-grid-unit-4-16 ct-text-center']//button[@class='btn-action-extras btn-action-extras_plus ct-transition']"));
   // public static final Target CHILD_SEAT = Target.the("GPS").located(By.xpath("//span[contains(text(),'Child toddler seat')]/ancestor::strong/parent::div/parent::div[@class='ct-grid']/parent::div/parent::div[@class='ct-grid ct-hybrid-grid']//div[@class='ct-grid-unit-4-16 ct-text-center']//button[@class='btn-action-extras btn-action-extras_plus ct-transition']"));
    //public static final Target CHILD_SEAT = Target.the("GPS").located(By.xpath("//span[contains(text(),'Child toddler seat')]/ancestor::strong/parent::div/parent::div[@class='ct-grid']/parent::div/parent::div[@class='ct-grid ct-hybrid-grid']//div[@class='ct-grid-unit-4-16 ct-text-center']//button[@class='btn-action-extras btn-action-extras_plus ct-transition']"));


}