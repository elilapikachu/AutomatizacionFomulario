package com.quipux.SemilleroAutomatizacion.QuipuxContatenos.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.quipux.SemilleroAutomatizacion.QuipuxContatenos.usertinterface.HomeQuipuxPage.OPTION_CONTACTENOS;


public class EncontrarContactenos {
    public static Performable enLaPaginaDeQuipux(){
        return Task.where("{0} ingresa al formulario de contactenos",

                actor -> {
                    actor.attemptsTo(
                           Click.on(OPTION_CONTACTENOS)
                    );
                }
        );
    }
}
