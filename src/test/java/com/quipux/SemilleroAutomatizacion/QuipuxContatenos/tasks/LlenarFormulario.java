package com.quipux.SemilleroAutomatizacion.tasks;

import com.quipux.SemilleroAutomatizacion.interactions.SeleccionarFechaDeNacimiento;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static com.quipux.SemilleroAutomatizacion.usertinterface.FormularioDemoqaPage.*;


public class LlenarFormulario {
    public static Performable conLosDatosSolicitados(String nombre, String apellido, String email, String genero, String telefono, String fechaDeNacimiento, String sujetos, String hobbie, String direccion, String estado, String ciudad){
        return Task.where("{0} ingresa los datos solicitados al formulario",
                actor -> {
                    actor.attemptsTo(
                            Scroll.to(INPUT_DIRECCION_ACTUAL),
                            SendKeys.of(nombre).into(INPUT_NOMBRE),
                            SendKeys.of(apellido).into(INPUT_APELLIDO),
                            SendKeys.of(email).into(INPUT_CORREO),
                            Click.on(CHECKBOX_GENERO.of(genero)),
                            SendKeys.of(telefono).into(INPUT_TELEFONO),
                            SeleccionarFechaDeNacimiento.delusuario(fechaDeNacimiento),
                            SendKeys.of(direccion).into(INPUT_DIRECCION_ACTUAL),
//                            Click.on(INPUT_SUJETOS),
//                            SendKeys.of(sujetos).into(INPUT_SUJETOS),
                            Click.on(CHECKBOX_HOBBIE.of(hobbie)),
                            SendKeys.of(estado).into(MENU_ESTADO),
                            Hit.the(Keys.ENTER).into(MENU_ESTADO),
                            SendKeys.of(ciudad).into(MENU_CIUDAD),
                            Hit.the(Keys.ENTER).into(MENU_CIUDAD),
                            Scroll.to(BTN_SUBMIT),
                            Click.on(BTN_SUBMIT)

                    );
                }
        );
    }
}

