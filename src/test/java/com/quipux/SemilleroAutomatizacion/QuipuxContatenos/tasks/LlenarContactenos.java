package com.quipux.SemilleroAutomatizacion.QuipuxContatenos.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;


import static com.quipux.SemilleroAutomatizacion.QuipuxContatenos.usertinterface.ContactenosQuipuxPage.*;


public class LlenarContactenos {
    public static Performable conLosDatosSolicitados(String nombreCompleto, String correo, String empresa, String motivo){
        return Task.where("{0} ingresa los datos en el formulario del contactenos",

                actor -> {
                    actor.attemptsTo(
                            SendKeys.of(nombreCompleto).into(INPUT_NOMBRE_COMPLETO),
                            SendKeys.of(correo).into(INPUT_CORREO),
                            SendKeys.of(empresa).into(INPUT_EMPRESA),
                            SendKeys.of(motivo).into(TEXTAREA_MOTIVO),
                            Click.on(BTN_ENVIAR)
                    );
                }
        );
    }
}
