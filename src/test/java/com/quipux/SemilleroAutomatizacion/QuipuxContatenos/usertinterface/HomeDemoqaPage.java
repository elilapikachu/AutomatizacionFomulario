package com.quipux.SemilleroAutomatizacion.usertinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeDemoqaPage {
    public static final Target OPTION_FORMULARIO  = Target.the("Opcion para seleccionar el formulario de practica")
            .locatedBy("//div[@class='card-body']//h5[contains(text(), 'Forms')]");

    public static final Target OPTION_INGRESO_AL_FORMULARIO  = Target.the("Opcion para poder ingresar al formulario de practica")
            .locatedBy("//ul[@class='menu-list']//span[contains(text(), 'Practice Form')]");
}
