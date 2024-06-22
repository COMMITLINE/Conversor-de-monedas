Este proyecto fue pensado para desarrollar el desafio de Alura Latam

Conversor de Monedas
Este proyecto es una aplicación de consola en Java que permite convertir entre diferentes monedas utilizando datos de una API de tasas de cambio.

Estructura del Proyecto
El proyecto se compone de las siguientes clases:

Principal.java
SelectorMonedaMenu.java
ConsultaMoneda.java
Moneda.java
Descripción de las Clases
Principal.java
Función: Esta es la clase principal que ejecuta el programa.
Flujo del Programa:
Muestra un menú con diferentes opciones de monedas.
Permite al usuario seleccionar una moneda principal o salir del programa.
Llama a SelectorMonedaMenu para manejar la conversión.
Pregunta al usuario si desea realizar otra conversión y maneja entradas inválidas.
SelectorMonedaMenu.java
Función: Maneja la lógica del menú de selección de monedas y realiza las conversiones.
Métodos:
menuOperador(int seleccion, Scanner sc): Gestiona la selección de la moneda origen y destino, y la cantidad a convertir.
consultarYMostrarMoneda(String tipoMonedaOrigen, String tipoMonedaDestino, double cantidad): Consulta la tasa de conversión desde la API y muestra el resultado de la conversión.
ConsultaMoneda.java
Función: Consulta la API de tasas de cambio para obtener las tasas de conversión.
Métodos:
consultaMonedaorigen(String tipoMoneda): Realiza una solicitud HTTP a la API y devuelve un objeto Moneda con las tasas de conversión.
Moneda.java
Función: Representa la estructura de la respuesta de la API.
Atributos:
result: Resultado de la solicitud.
base_code: Código de la moneda base.
conversion_rates: Mapa que contiene las tasas de conversión a otras monedas.
Ejecución del Programa
Inicialización: Ejecutar Principal.java.
Menú Principal: Seleccionar la moneda principal o presionar 0 para salir.
Seleccionar Moneda Destino: Seleccionar la moneda a la que se desea convertir.
Ingresar Cantidad: Ingresar la cantidad de dinero a convertir.
Mostrar Resultado: El programa muestra la cantidad convertida y la tasa de conversión.
Repetir o Salir: El programa pregunta si desea realizar otra conversión. Presionar 1 para realizar otra conversión o 0 para salir.