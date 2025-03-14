package com.quipux.SemilleroAutomatizacion.tasks;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.quipux.SemilleroAutomatizacion.usertinterface.FormularioDemoqaPage.TXT_AGRADECIMIENTO_FORMULARIO;
import static com.quipux.SemilleroAutomatizacion.usertinterface.FormularioDemoqaPage.TXT_CONFIRMACION;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConfirmarDatos {
    public static Performable solicitadosDelFormulario(String agradecimiento, String nombre, String apellido, String email ){
        return Task.where("{0} Confirma los datos del formulario",
                actor -> {
                    actor.attemptsTo(
                            Ensure.that(agradecimiento).isEqualTo(TXT_AGRADECIMIENTO_FORMULARIO.resolveFor(theActorInTheSpotlight()).getText()),
                            Ensure.that(TXT_CONFIRMACION.of(nombre + " " + apellido)
                                            .resolveFor(theActorInTheSpotlight()).getText())
                                    .isEqualTo(nombre + " " + apellido),
                            Ensure.that(TXT_CONFIRMACION.of(email).resolveFor(theActorInTheSpotlight()).getText()).isEqualTo(email)

                    );
                }
        );
    }
}
