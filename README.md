# Ejercicio POO Kotlin - II
## Clases abstractas, internas y anidadas

### Enunciado 1: Utilización de clases abstractas

Modela un **sistema de notificaciones** como una **clase abstracta**.  

El sistema de notificaciones debe ser capaz de:

- Enviar un mensaje tecleado (enviado como parámetro).
- Obtener información del mensaje, devolviendo una cadena de texto con:
  - El propio mensaje.
  - La longitud del mensaje.

### Tipos de mensajes

1. **Correo electrónico**
   - Contiene:
     - Emisor (dirección de email)
     - Receptor (dirección de email)
   - Longitud máxima del mensaje: **1500 caracteres**.

2. **Whatsapp**
   - Contiene:
     - Número de teléfono del destinatario
   - Longitud máxima del mensaje: **600 caracteres**.

### Funcionalidades en la función principal (`main`)

- Agregar las notificaciones a una **cola de notificaciones**.
- Enviar **todas las notificaciones**, sin importar su tipo.
- Contar y mostrar el tipo de notificaciones existentes, por ejemplo:  
  - `4 notificaciones de correo electrónico`  
  - `5 notificaciones de Whatsapp`
