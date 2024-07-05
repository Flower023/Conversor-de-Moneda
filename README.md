# Conversor de divisas 🪙

Este proyecto es un convertidor de monedas en Java que utiliza un llamado a una API 
para obtener los tipos de cambio actuales y permite convertir entre varias divisas. 
Además mantiene un historial de conversiones el cuál se puede visualizar.

## Funcionalidades

- Convertir entre varias divisas (USD, CLP, EUR,  <em>próximamente más</em>).
- Registrar y mostrar el historial de conversiones.

## Requisitos del Sistema

- Java 8 o superior.
- Biblioteca Gson para parsear el JSON de la API.
- Conexión a internet para obtener las divisas actuales.
- Algun IDE de desarrollo de Java.

## Instalación

- Clonar el repositorio o descargar los archivos fuentes 
`https://github.com/Flower023/Conversor-de-Moneda.git`
- Asegurarse de tener Java instalado en tu sistema.
- Añadir la biblioteca Gson. Puedes descargarlo desde
`[Maven Repository]https://mvnrepository.com/artifact/com.google.code.gson/gson`

## Uso 

- Al iniciar la aplicación, se te pedirá que selecciones la divisa deseada para realizar su conversión.
- Después tendrás que introduccir la cantidad a convertir.
- La aplicación calculará automáticamente el monto convertido y lo mostrará. Al mismo tiempo creará un archivo .txt en el que se guardara el historial.
- Puedes realizar otra conversión o revisar el historial.
- Para salir se debe escoger la opción 6. 



## Autor

- Erik Flores (https://www.linkedin.com/in/erik-flores-mamani-a925bb46)

## Agradecimiento

Agradecimiento especialmente al equipo de Alura por el material y el contenido del curso.
