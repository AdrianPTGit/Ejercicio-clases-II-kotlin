package org.example

/**
 * El sistema de notificaciones debe ser capaz de enviar:
 *
 *        -- un mensaje tecleado (enviado como parámetro).
 *
 *        -- Además tiene una función de obtener información del mensaje el cual  devuelve una cadena de texto con el
 *           propio mensaje y la longitud del mismo.
 */
abstract class Notificacion (var mensaje : String){

    abstract  fun obtenerInformacionMensaje(mensage : String) : Int
    abstract fun enviarMensaje(mensaje: String)


}