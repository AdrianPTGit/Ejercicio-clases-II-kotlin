package org.example.Enunciado1

/**
 * Enunciado 1: (Utilización de clases abstractas).
 *
 * Modela un sistema de notificaciones como una clase abstracta.
 *
 * El sistema de notificaciones debe ser capaz de enviar:
 *
 *      -- un mensaje tecleado (enviado como parámetro).
 *
 *      -- Además tiene una función de obtener información del mensaje el cual  devuelve una cadena de texto con el
 *         propio mensaje y la longitud del mismo.
 *
 * Mediante este sistema se pueden enviar dos tipos de mensajes:
 *
 *      -- Mensajes de correo electrónico:
 *              -- el cual contiene un emisor,
 *              -- un receptor (ambas direcciones de email),
 *              -- y cuya longitud máxima del mensaje es de 1500 caracteres.
 *
 *      -- También se pueden enviar mensajes de Whatsapp,
 *              -- en el que se necesita el número del teléfono del destinatario
 *              -- y la cantidad máxima de caracteres a enviar es de 600.
 *
 * El sistema de notificaciones se implementará en la función principal (main) y en el se podrán:
 *
 * -- Agregar las notificaciones a una cola de notificaciones.
 * -- Enviar todas las notificaciones (sean del tipo que sean)
 * --  Contar (y mostrar) el tipo de notificaciones existentes: Ejemplo 4 notificaciones de correo electronico ,
 *     5 notificaciones de Whatsapp
 *
 */
fun main() {
    val colaNotificaciones = mutableListOf<Notificacion>()  // Cola (lista) de notificaciones

    var opcion: Int

    do {
        println("===== MENÚ PRINCIPAL =====")
        println("1. Enviar Email")
        println("2. Enviar Whatsapp")
        println("3. Enviar todas las notificaciones")
        println("4. Mostrar conteo de notificaciones")
        println("0. Salir")
        print("Elige una opción: ")

        opcion = readLine()?.toIntOrNull() ?: -1  // Lee la opción y maneja errores

        when (opcion) {
            1 -> {println("Enviar Email")
                print("Introduce el email del emisor: ")
                val emisor = readLine() ?: ""

                print("Introduce el email del receptor: ")
                val receptor = readLine() ?: ""

                val email = Email(emisor, receptor)

                print("Escribe el mensaje: ")
                val mensaje = readLine() ?: ""

                // Mostrar información del mensaje
                println(email.obtenerInformacionMensaje(mensaje))

                // Enviar mensaje
                email.enviarMensaje(mensaje)

                colaNotificaciones.add(email)

                println("Email agregado a la cola.\n")
            }

            2 -> {

                print("Introduce el Numero de telefono  del receptor: ")
                val receptor = readLine() ?: ""

                val whatsapp = Whatsapp(receptor)

                print("Escribe el mensaje: ")
                val mensaje = readLine() ?: ""

                // Mostrar información del mensaje
                println(whatsapp.obtenerInformacionMensaje(mensaje))

                // Enviar mensaje
                whatsapp.enviarMensaje(mensaje)
                // Agregar notificacion a la lista
                colaNotificaciones.add(whatsapp)

                println("Whatsapp agregado a la cola.\n")
            }
            3 -> {
                println("=== Enviando todas las notificaciones... ===")
                if (colaNotificaciones.isEmpty()) {
                    println("No hay notificaciones en la cola.\n")
                } else {
                    for (n in colaNotificaciones) {
                        n.enviarMensaje(n.mensaje)
                    }
                    colaNotificaciones.clear() // vacía la cola tras enviar
                    println("Todas las notificaciones fueron enviadas.\n")
                }
            }
            4 -> {
                println("=== Numero de notificaciones Enviadas ===")
                val emails = colaNotificaciones.count { it is Email }
                val whatsapps = colaNotificaciones.count { it is Whatsapp }

                println("Emails en cola: $emails")
                println("Whatsapps en cola: $whatsapps\n")
            }
            0 -> println("Saliendo del programa...")
            else -> println("Opción no válida, intenta de nuevo.")
        }

        println() // Línea en blanco para separar ciclos
    } while (opcion != 0)
}


