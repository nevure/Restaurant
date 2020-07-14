/**
 * Ejercico de Restaurant
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 * 
 * Paquete Cliente. Intento abstraer las funciones de un Restaurante; llamamos Cliente a aquellos aspectos 
 * de relación con el cliente.
 * Podríamos tener otro paquete para las relaciones que se dan en cocina: stocks, pedidos proveedores, etc.
 * Igualmente otro paquete para, por ejemplo, las relaciones del personal.
 *
 */

package restaurantsJava.Cliente;


/*
 *  Interfaz Menu. Este interfaz nos presenta los principales métodos en relación 
 *  al menú de platos  ofrecidos y su precio.
 *  
 *  'agregarPlato' -> Método que recibe un nombre de plato y precio.
 *  'cambiarPrecio' -> Método que recibe un nombre de plato y el nuevo precio a poner.
 *  'cambiarPlato' -> Método que recibe dos nombres de platos, el que se elimina y el nuevo,
 *  y el precio del nuevo plato.
 *  'agregarPlatoPedido' -> agrega un plato al pedido de un cliente.
 *  'tenemosPlato' ->Devuelve verdadero si el plato solicitado por el cliente está en el menú.
 *  'cuantosPlatos' -> devuelve el número de platos del menú.
 */

public interface Menu {
	
	public void agregarPlato(String nombrePlato, int precio);
	public boolean cambiarPrecio(String nombrePlato, int nuevoPrecio);
	public boolean cambiarPlato(String nombrePlatoAnterior, String nuevoPlato, int nuevoPrecio);
	public void agregarPlatoPedido(String nombrePlato);
	public boolean tenemosPlato(String nombrePlato);
	public byte cuantosPlatos();

	
}
