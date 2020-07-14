/**
 * Ejercico de Restaurant
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */

package restaurantsJava.Utils.IOConsole;


import java.util.ArrayList;
import java.util.Scanner;


/*
 * Clase que implementa la interfaz EntradaSalidaConsola
 * 
 * 'leerDeConsola' -> este método propio d eesta clase recibe como parámetro la pregunta 
 * y devuelve la respuesta tecleada en consola.
 */
public class InteraccionBasicaConsola implements EntradaSalidaConsola {

    private Scanner lector = new Scanner(System.in);

	
    //Llama al método leerDeConsola 
    public String repuestaAPregunta (String textoPregunta) {
		return leerDeConsola(textoPregunta);	
	}

	/*
	 * Este método recibe un string que es una pregunta y un char que es el carácter 
	 * de escape que debe teclear como primer carácter el usuario para salir de la iteración
	 * Tras salir con el carácter de escape devuelve la lista de respuestas dadas por consola.
	 * Utiliza el método leerDeConsola para cada recoger la respuesta en cada iteración.
	 */
    public ArrayList<String> respuestasMismaPregunta (String textoPregunta, char caracterEscape) {
		
		ArrayList<String> listaRespuestas = new ArrayList<>();
		int i = -1;
		do {
			listaRespuestas.add(leerDeConsola(textoPregunta));
			i++;
		}while (listaRespuestas.get(i).charAt(0) !=  caracterEscape);
		
		return listaRespuestas;
	}
    
    
	
	/*
	 * Método que imprime una matriz de objetos recibidos como parámetros con un texto
	 * de cabecera. 
	 */
	public void imprimirMatriz (Object[] matriz, String textoCabecera) {
		
		System.out.println(textoCabecera);
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i]+ "  ");			
		}
	}
	
	/*
	 * Método que recibe la pregunta por parámetro y devuelve la respuesta tecledada 
	 * en consola en formato String.
	 * 
	 */
	private String leerDeConsola(String textoPregunta) {
		
		String entrada;
			
		System.out.print(textoPregunta);
		entrada = lector.nextLine();
			
		return entrada;
				
	}	
}
