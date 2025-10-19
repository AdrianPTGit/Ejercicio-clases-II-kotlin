package org.example

/**
 * -- También se pueden enviar mensajes de Whatsapp,
 *      -- en el que se necesita el número del teléfono del destinatario
 *      -- y la cantidad máxima de caracteres a enviar es de 600.
 */
class Whatsapp(var receptorWhatsapp : String) : Notificacion(mensaje = "") {
    override fun obtenerInformacionMensaje(mensaje: String): Int {
        val longitud = mensaje.length

        return longitud
    }

    override fun enviarMensaje(mensaje: String) {
        // guarda la info del mensaje
        val info = obtenerInformacionMensaje(mensaje)
        //Comprueba si ee mensaje es mayor a 1500 caracteres
        if (info >= 600){
            println("el mensaje tiene mas de 600 caracteres. Escribe un mensaje mas corto")
        } else {
            this.mensaje = mensaje
            println("Enviado Whatsapp A $receptorWhatsapp")
            println("Contenido: $mensaje")
        }
    }
}