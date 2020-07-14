/**
 * Fase2 - Ejercico de Restaurant
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */

package restaurantsJava;

import restaurantsJava.Cliente.*;
import restaurantsJava.Utils.Monedes.*;
import restaurantsJava.Utils.IOConsole.*;

/*
 * En esta Fase 2 creamos los objetos que trabajarán con los menús (menuCliente).
 * Utilizamos también la clase InteraccionBasicaConsola del paquete IOConsole.
 * 
 *  También un objeto de la clase Euro del paquete Utils.Monedes. Aunque realmente solo 
 *  utilizaremos el metodo que verifica que el coste el plato es pagable con billetes de Euro.
 *  
 */
public class Fase2 {
	
	protected MenuSencillo menuCliente = new MenuSencillo() ;
	protected InteraccionBasicaConsola ioConsola = new InteraccionBasicaConsola();
	Euro valorMonetariEuro = new Euro();
		
    protected void crearMenuRest () {
    	
    	/*'nomPlato' -> nombre del plato introducido para el menú.
    	 *'numPlato' -> Texto para solicitar el plato del menú.
    	 *'preuPlat' -> Precio del plato del menú.
    	 */
    	String nomPlato;
    	
    	String numPlato;
    	
    	int preuPlat;
    	
    	/* Preguntamos por los 5 platos del menú.
    	 * ioConsolta.respuestaAPregunta -> nos devuelve la entrada de teclado. 
    	 * Le pasamos el texto a mostrar antes de la entrada de teclado.
    	 */
    	
    	for (byte i=0; i<5; i++) {

    		numPlato = "Introduce el plato " + (i+1) + " del menú: ";
    		nomPlato = ioConsola.repuestaAPregunta(numPlato);
    		
    	    //condicional para repetir la solicitud del precio del plato
    	    while(true){
    		   /*try catch para almacenar una excepcion en caso 
    		    * de que no se introduzca un número
    		    * */
    	    	try {
    		          /*Llamamos método "respuestaAPregunta" que nos devuelve
    		          * la entrada de teclado.
    		          */
    	    		  preuPlat = Integer.parseInt(ioConsola.repuestaAPregunta(" \nIntroduce precio del plato: "));
    		          break;
    		     } catch(NumberFormatException e){
    		           System.err.println("Por favor, introduce un número." );
    		           continue; 
    		     }// cierre del try catch
    		 }//cierre del while
    		    
    	    /*Verificamos que la cantidad introducida es pagable con billetes de Euro.
    	     * Si es así guardamos el plato y precio utilizando el objeto menucliente 
    	     * y su método agregarplato.
    	     */
    	    
    	    if (valorMonetariEuro.valorCorrecto(preuPlat))
    		 menuCliente.agregarPlato(nomPlato, preuPlat); 
    	    else {
    	         i--;
       		 System.out.println("el precio del plato debe ser pagable con billetes de Euro");  			   
    	     }
			
    	}
    	 	 	
    }
	
    protected void fase2Print() {
		
	String platoPedido;
		
	// Llamos al método de la clase que creará el menú del restaurant
	crearMenuRest();
								
	/*
	 * Interacción con el cliente donde le pedimos que nos diga que desea comer.
	 * guarda en platoPedido la solicitud del cliente y lo pasa a la lista de 
	 * pedidos del objeto menuCliente.
	 */
	while ((platoPedido = ioConsola.repuestaAPregunta("Dime el plato del menú que deseas. Para dejar de pedir introduce 0: ")).charAt(0) !='0')
	{
		menuCliente.agregarPlatoPedido(platoPedido);
	}
			
   }
}
