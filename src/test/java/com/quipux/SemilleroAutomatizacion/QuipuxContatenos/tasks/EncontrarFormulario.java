package com.quipux.SemilleroAutomatizacion.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.quipux.SemilleroAutomatizacion.usertinterface.HomeDemoqaPage.*;


public class EncontrarFormulario {
    public static Performable enLaPaginaDemoqa(){
        return Task.where("{0} ingresa al formulario de practica",

        actor -> {
            actor.attemptsTo(
                Scroll.to(OPTION_FORMULARIO),
                Click.on(OPTION_FORMULARIO),
                Click.on(OPTION_INGRESO_AL_FORMULARIO)
            );
        }
        );
    }
}
