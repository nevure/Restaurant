/**
 * Ejercico de Restaurant
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */

package restaurantsJava.Utils.Monedes;

/*
 * Implementación de la interfaz Monetario.
 * Declaramos los valores d elos billetes de Euro como estáticos y finales.
 * 
 * 'cambiar' -> Método de interfaz 
 * 'valorCorrecto' -> Método propio de la clase Euro que comprueba si la cantidad
 * parametrizada es pagable solo con billetes de Euros.  
 * 
 */
public final class Euro implements Monetario {
	
	static final int EUCINC = 5;
	static final int EUDEU = 10;
	static final int EUVINT = 20, EUCINQUANTA = 50, EUCENT = 100, EUDOSCENTS = 200, EUCINCENTS = 500;
	
	public float cambiar (float valorA, float tasaConversion) {
		return  valorA * tasaConversion;
	}
		
	public boolean valorCorrecto(int valor  ) {
		
		if (valor % 2 == 0 && valor % 5 == 0 || valor % 5 == 0 ) 
			return true;
		return false;
		
	}
	
	

	
}
