/**
 * Fase1 - Ejercico de Restaurant
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */

package restaurantsJava;

import restaurantsJava.Cliente.*;

public class Fase1 {

	// Creamos objeto Menu
	MenuSencillo menuCliente = new MenuSencillo() ;
	
	/*
	 * Constructor. Vacío en este caso, pero se deja.
	 */
	Fase1() {

	}
	
	/*
	 * método que nos muestra el resultado para la fase1 del ejercicio. No hay que mostrar nada. Se muestra la información
	 * de variables.
	 * 
	 */
	
	protected void fase1Print() {
		System.out.println("Tabla Menú para :"+menuCliente.cuantosPlatos()+" platos");

	}
}
