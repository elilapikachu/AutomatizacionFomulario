#language:es
  Característica: Llenar y enviar formulario contactenos en la pagina de quipux

    Esquema del escenario: Llenar el formulario de cntactenos y enviarlo
      Dado Que me encuentro en la seccion de contactenos en el portal de quipux
      Cuando lleno los dados <nombreCompleto> <correo> <empresa> '<motivo>' y le doy al boton de enviar
      Entonces debe aparecer el mensaje de '¡Contáctanos! Nuestro equipo está disponible para responder todas tus preguntas.'

     Ejemplos:
       | nombreCompleto  | correo                | empresa | motivo   |
       | estoesunaprueba | noContactes@gmail.com | Quipux  | holaaaaa como estan|