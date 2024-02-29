# Aplicación de Generación de Números Aleatorios

Esta es una aplicación desarrollada con Java y Spring Boot que proporciona endpoints para generar números aleatorios y realizar operaciones relacionadas con ellos.

Funcionalidades Principales:
Obtener 100 Números Aleatorios

Endpoint: GET /random/numbers
Descripción: Devuelve una lista de 100 números aleatorios generados.

Obtener un Número Aleatorio de N Dígitos
Endpoint: GET /random/number/{d}
Descripción: Devuelve un número aleatorio que tiene el número específico de dígitos (N).

Generar un Número Aleatorio Basado en un Número Aleatorio Proporcionado
Endpoint: PUT /random/number
Descripción: Recibe un número aleatorio en formato JSON y devuelve otro número aleatorio con la misma cantidad de dígitos.

Estructura del Proyecto:
Modelo (RandomNumber):
Clase que representa un número aleatorio en formato JSON.

Servicio (RandomNumberService y RandomNumberServiceImpl):
Interfaz y su implementación que define los métodos para generar números aleatorios.

Controlador (RandomNumberController):
Controlador que maneja las solicitudes HTTP relacionadas con números aleatorios y utiliza el servicio para procesarlas.

Instrucciones de Uso:

Clonar el repositorio de la aplicación.
Compilar y ejecutar la aplicación en un entorno de desarrollo de Spring Boot.
Utilizar las herramientas como Postman o curl para enviar solicitudes HTTP a los endpoints especificados.

Requisitos:

Java 8 o superior
Maven
Spring Boot

Ejemplo de Uso:

Obtener 100 números aleatorios:

GET /random/numbers
Obtener un número aleatorio de 5 dígitos:


GET /random/number/5
Generar un número aleatorio basado en un número aleatorio proporcionado (por ejemplo, { "random": 12345 }):


PUT /random/number
Body: { "random": 12345 }
Notas Adicionales:
Asegúrate de enviar los datos en formato JSON adecuado en el cuerpo de las solicitudes para los endpoints que lo requieran.
Verifica las respuestas de la aplicación para asegurarte de que se están procesando correctamente las solicitudes.
