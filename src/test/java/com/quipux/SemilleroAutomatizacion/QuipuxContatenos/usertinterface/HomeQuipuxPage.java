package com.quipux.SemilleroAutomatizacion.QuipuxContatenos.usertinterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomeQuipuxPage {

    public static final Target OPTION_CONTACTENOS  = Target.the("Opcion para seleccionar el formulario de contactenos en el portal")
            .locatedBy("//li[@id='mega-menu-item-18135']//a[contains(text(), 'Contáctanos')]");

}
