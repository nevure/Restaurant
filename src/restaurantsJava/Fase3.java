/**
 * Fase3 - Ejercico de Restaurant
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */

package restaurantsJava;

import restaurantsJava.Cliente.*;
import restaurantsJava.Utils.IOConsole.*;

/*
 * Fase 3. Recogemos el objeto fase2 para poder interactuar con el objeto menucliente.
 * 
 */
 
public class Fase3 {
	
	//protected MenuSencillo menuCliente = new MenuSencillo() ;
	protected InteraccionBasicaConsola ioConsola = new InteraccionBasicaConsola();
	 	 	 	   	
	protected void fase3Print(Fase2 fase2) {
		
		boolean error= false;
		
		/*
		 * REcorremos la lista del pedido del cliente. Por cada plato solicitado
		 * llamamos al método 'tenemosPlato' para verficiar si el plato solicitado
		 * está o no en el menú. Guardamos en error verdadero si ha habido algún plato
		 * que no se ha encontrado en el menú. 
		 */
		
		for (String platoSolicitado: fase2.menuCliente.getPedido()) {
			if (!fase2.menuCliente.tenemosPlato(platoSolicitado)) {
					System.out.println("El plato  "+platoSolicitado+" no está en el menú");
					error = true;
			}
			fase2.menuCliente.sumaAFactura(fase2.menuCliente.precioPlato(platoSolicitado));
		}
		
		/*Si todos los platos pedidos están en el menú, error será false y podemos
		 * imprimir el coste total del pedido. 
		 */
		if (!error)
			System.out.println("Su cuenta asciende a : " + fase2.menuCliente.getTotalFactura());
			
		
		
		
		
	}
}
