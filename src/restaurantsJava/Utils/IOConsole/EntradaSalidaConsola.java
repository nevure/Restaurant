/**
 * Ejercico de Restaurant
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */
package restaurantsJava.Utils.IOConsole;

import java.util.ArrayList;

/*
 * Interfaz que intenta automatizar entradas/salidas de consola más elaboradas o
 * parametrizadas.
 * 
 * 'respuestaAPregunta' -> Recoge una entrada por consola pero imprimiendo antes el 
 * string del parámetro.
 * 'respuestaMismaPregunta' -> Devuelve una Lista de respuestas a una misma pregunta. La pregunta 
 * y un carácter de escape los recibe por parámetros.
 * 'imprimirMatriz' -> imprime una matriz de cualquier objeto con un texto de cabecera .
 * 
 */

public interface EntradaSalidaConsola {
	
	public String repuestaAPregunta (String textoPregunta);
	public ArrayList<String> respuestasMismaPregunta (String textoPregunta, char caracterEscape);
	public void imprimirMatriz (Object[] matriz, String textoCabecera);
	
}
