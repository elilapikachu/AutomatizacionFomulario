package com.quipux.SemilleroAutomatizacion.QuipuxContatenos.stepdefinitions;

import com.quipux.SemilleroAutomatizacion.QuipuxContatenos.tasks.EncontrarContactenos;
import com.quipux.SemilleroAutomatizacion.QuipuxContatenos.tasks.LlenarContactenos;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;


import static com.quipux.SemilleroAutomatizacion.QuipuxContatenos.usertinterface.ContactenosQuipuxPage.TXT_CONFIRMACION;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EnviarContactenosStepDefinitions {

    @Dado("Que me encuentro en la seccion de contactenos en el portal de quipux")
    public void queMeEncuentroEnLaSeccionDeContactenosEnElPortalDeQuipux() {
        theActorInTheSpotlight().attemptsTo(
                EncontrarContactenos.enLaPaginaDeQuipux()
        );

    }
    @Cuando("lleno los dados {} {} {} '{}' y le doy al boton de enviar")
    public void llenoLosDadosYLeDoyAlBotonDeEnviar(String nombreCompleto, String correo, String empresa, String motivo) {
        theActorInTheSpotlight().attemptsTo(
                LlenarContactenos.conLosDatosSolicitados(nombreCompleto , correo , empresa , motivo)
        );

    }
    @Entonces("debe aparecer el mensaje de '{}'")
    public void debeAparecerElMensajeDe(String mensaje) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(TXT_CONFIRMACION.of(mensaje).resolveFor(theActorInTheSpotlight()).getText()).isEqualTo(mensaje)
        );
    }


}
