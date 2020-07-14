/**
 * Ejercico de Restaurant
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */

package restaurantsJava.Utils.Monedes;

/*
 * Interfaz para manejar temas monetarios. 
 * 'cambiar' -> Método que devuelve el valor aplicándole una tasa de conversión especificada.
 * 
 */

public interface Monetario {
	
	public float cambiar (float valorA, float tasaConversion);
		
}
