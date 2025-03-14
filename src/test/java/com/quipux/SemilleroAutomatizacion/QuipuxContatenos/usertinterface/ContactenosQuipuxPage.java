package com.quipux.SemilleroAutomatizacion.QuipuxContatenos.usertinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContactenosQuipuxPage {
    public static Target INPUT_NOMBRE_COMPLETO = Target.the("Input para ingresar el nombre completo")
            .located(By.id("input_1_1"));

    public static Target INPUT_CORREO = Target.the("Input para ingresar el correo")
            .located(By.id("input_1_4"));

    public static Target INPUT_EMPRESA = Target.the("Input para ingresar la empresa a la que pertenece el usuario")
            .located(By.id("input_1_5"));

    public static Target TEXTAREA_MOTIVO = Target.the("TextArea para ingresar el motivo por el cual se esta contactando")
            .located(By.id("input_1_6"));

    public static Target BTN_ENVIAR = Target.the("Boton para enviar los datos ingresados")
            .located(By.id("gform_submit_button_1"));

    public static Target TXT_CONFIRMACION = Target.the("Boton para enviar los datos ingresados")
            .locatedBy("//h1[contains(text(), '{0}')]");
}
