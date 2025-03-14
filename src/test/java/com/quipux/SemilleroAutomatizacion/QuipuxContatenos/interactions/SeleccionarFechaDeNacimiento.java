package com.quipux.SemilleroAutomatizacion.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;

import static com.quipux.SemilleroAutomatizacion.usertinterface.FormularioDemoqaPage.*;



public class SeleccionarFechaDeNacimiento {

    public static Performable delusuario(String fechaDeNacimiento) {
        return Task.where("{0} busca la fecha de nacimiento",
                actor -> {
                    String[] fechaEnPartes = fechaDeNacimiento.split("-");
                    String dia = fechaEnPartes[0];
                    String mes = fechaEnPartes[1];
                    String anio = fechaEnPartes[2];
                    actor.attemptsTo(
                            Click.on(INPUT_FECHA_NACIMIENTO),
                            Click.on(SELECT_MES),
                            Click.on(OPTION_ANIOYMES.of(mes)),
                            Click.on(SELECT_ANIO),
                            Click.on(OPTION_ANIOYMES.of(anio)),
                            Click.on(OPTION_DIA_FECHA.of(dia))

                    );


                }
        );
    }
}
