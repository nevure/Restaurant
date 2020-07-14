
/**
 * Ejercico de Restaurant
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 * 
 */

package restaurantsJava.Cliente;

import java.util.ArrayList;
import java.util.List;

/* 
 * Clase MenuSencillo que implementa la interfaz Menu. Un ejemplo de menú sencillo. Podríamos tenerlo 
 * más complejo agregando tipos d eplato (vegetariano, vegano, sin glutem...). Esta clase nos implementa 
 * un Menú "simple".
 * 
 * 'String[] platos' -> Matriz que guarda los platos del menú.
 * 'int[] precios ' -> Matriz que guarda el precio de los platos.
 * 'listaPedido ' -> Lista que guarda el pedido del cliente.
 * 'totalFactura' -> Coste total del pedido del cliente.
 *
 */

public class MenuSencillo implements Menu{
	
	static String [] platos = new String[5];
	static int [] precios = new int[5];
	static List<String> listaPedido = new ArrayList<String>();
	
	static int indice = 0;
	static int totalFactura = 0;
	
	// Guardamos el plato y el precio en sus variables	
	public void agregarPlato(String nombrePlato, int precio) {

		platos[indice] = nombrePlato;
		precios[indice] = precio;
		indice++;
	
	}
	
	/*
	 * Recorremos la matriz de platos del menú.
	 * Si aparece el plato se cambia el precio y se devuelve verdadero.
	 * se devuelve Falso si no se encuentra el plato.
	 */
	public boolean cambiarPrecio(String nombrePlato, int nuevoPrecio) {
		
		for (int i = 0; i < platos.length; i++) {
			if (platos[i] == nombrePlato) {
				precios[i] = nuevoPrecio;
				return true;
			}
		}
		return false;
	}
	
	/*
	 * REcorremos la matriz de platos del menú hasta encontrar el plato que se 
	 * quiere cambiar. Si se encuentra, se cambia el plato y el precio y se
	 * devuelve verdadero.
	 * Falso sino se ha encontrado.
	 */
	public boolean cambiarPlato(String nombrePlatoAnterior, String nuevoPlato, int nuevoPrecio) {
		
		for (int i = 0; i < platos.length; i++) {
			if (platos[i] == nombrePlatoAnterior) {
				platos[i] = nuevoPlato;
				precios[i] = nuevoPrecio;
				return true;
			}
		}
		return false;
		
		
	}
	
	/*
	 * Método que agrega un plato a la lista de pedido del cliente.
	 */
	public void agregarPlatoPedido(String nombrePlato) {
		
		listaPedido.add(nombrePlato);
	}
	
	
	/*
	 * Método que comprueba si el plato que se pasa como parámetro
	 * se encuentra dentro de la matriz de platos del menú. Devuelve verdadero si
	 * lo encuentra o falso sino lo encuentra. 
	 */
	public boolean tenemosPlato(String nombrePlatoPedido) {
		
		for (int i = 0; i< platos.length; i++ ) {
			if (platos[i].equals(nombrePlatoPedido) ) 
				return true;
		}
		
		return false;		
	}
	
	/*
	 * Busca el plato en la matriz de platos. Si lo encuentra recoge de la matriz
	 * de precios el precio (recordemos que la posición del precio es la misma que 
	 * la del plato, por lo que comparten índice).
	 * sino encuentra el plato devuelve 0.
	 */
	public int precioPlato (String nombrePlato)
	{
		for (int i=0; i<5; i++) {

			if (platos[i].equals(nombrePlato)) {
				return precios[i];
				
			}
		}
		return 0;
	}
	
	/*
	 * Devuelve el tamaño de la matriz de platos.
	 */
	public byte cuantosPlatos() {
		return (byte) platos.length;
	}
	
	/*
	 * Recibe un valor entero que suma al total de la factura del cliente.
	 * 
	 */
	public void sumaAFactura(int valor) {
		totalFactura += valor;
	}
	
	//Getter de la matriz del menú
	public String [] getMenu () {
		return platos;
	}
	
	//getter de la lista de pedidos.
	public List<String> getPedido(){
		return listaPedido;
	}
	
	//getter del entero que guarda el total de factura
	public int getTotalFactura() {
		return totalFactura;
	}

	
}
