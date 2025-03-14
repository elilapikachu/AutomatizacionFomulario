package com.quipux.SemilleroAutomatizacion.usertinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioDemoqaPage {

    public static final Target INPUT_NOMBRE = Target.the("Input para ingresar el nombre del usuario")
            .located(By.id("firstName"));

    public static final Target INPUT_APELLIDO = Target.the("Input para ingresar el apellido del usuario")
            .located(By.id("lastName"));

    public static final Target INPUT_CORREO = Target.the("Input para ingresar el correo/email del usuario")
            .located(By.id("userEmail"));

    public static final Target CHECKBOX_GENERO = Target.the("Checkbox para seleccionar el genero")
            .locatedBy("//input[@value='{0}']/..");

    public static final Target INPUT_TELEFONO = Target.the("Input para ingresar el telefono del usuario")
            .located(By.id("userNumber"));

    public static final Target INPUT_FECHA_NACIMIENTO = Target.the("Input para ingresar la fecha de nacimiento")
            .located(By.id("dateOfBirthInput"));

    public static final Target OPTION_DIA_FECHA = Target.the("Option para seleccionar el dia de la fecha")
            .locatedBy("//div[@role='option' and normalize-space(text())='{0}']");

    public static final Target SELECT_ANIO = Target.the("Option para seleccionar el dia de la fecha")
            .locatedBy("//select[@class='react-datepicker__year-select']");

    public static final Target SELECT_MES = Target.the("Option para seleccionar el dia de la fecha")
            .locatedBy("//select[@class='react-datepicker__month-select']");

    public static final Target OPTION_ANIOYMES = Target.the("Option para seleccionar el año y la fecha")
            .locatedBy("//option[@value='{0}']");


    public static final Target INPUT_DIRECCION_ACTUAL = Target.the("Input para ingresar la direccion actual")
            .located(By.id("currentAddress"));

    public static final Target INPUT_SUJETOS = Target.the("Input para ingresar el sujeto actual")
            .locatedBy("//div[@id=\"subjectsContainer\"]//div[contains(@class, \"subjects-auto-complete__control\")]\n");


    public static final Target CHECKBOX_HOBBIE = Target.the("Checkbox para clickear los hobbies del usuario")
            .locatedBy("//label[contains(text(), '{0}')]");



    public static final Target MENU_ESTADO = Target.the("Menu/input para ingresar el estado")
            .located(By.id("react-select-3-input"));

    public static final Target MENU_CIUDAD = Target.the("Menu/input para ingresar la ciudad")
            .located(By.id("react-select-4-input"));

    public static final Target BTN_SUBMIT = Target.the("Boton para enviar el formulario")
            .located(By.id("submit"));

    public static final Target TXT_AGRADECIMIENTO_FORMULARIO = Target.the("Boton para enviar el formulario")
            .located(By.id("example-modal-sizes-title-lg"));

    public static final Target TXT_CONFIRMACION = Target.the("texto para confirmar el nombre y el correo ingresados")
            .locatedBy("//td[contains(text(), '{0}')]");
}
