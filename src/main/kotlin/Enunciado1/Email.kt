package org.example.Enunciado1

/**
 * -- Mensajes de correo electrónico:
 *        -- el cual contiene un emisor,
 *        -- un receptor (ambas direcciones de email),
 *        -- y cuya longitud máxima del mensaje es de 1500 caracteres.
 */
class Email (var emisorEmail : String, var receptorEmail : String) : Notificacion(mensaje = ""){

    override fun obtenerInformacionMensaje(mensaje: String): Int {

        val longitud = mensaje.length

        return longitud

    }

    override fun enviarMensaje(mensaje: String ) {
        // guarda la info del mensaje
        val info = obtenerInformacionMensaje(mensaje)
        //Comprueba si ee mensaje es mayor a 1500 caracteres
        if (info >= 1500){
            println("el mensaje tiene mas de 1500 caracteres. Escribe un mensaje mas corto")
        } else {
            this.mensaje = mensaje
            println("Enviado Email de $emisorEmail, A $receptorEmail")
            println("Contenido: $mensaje")
        }
    }
}