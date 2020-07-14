/* Ejercico de Restaurants MAIN
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */


package restaurantsJava;
/*
import Fase1;
//import Fase2;
//import Fase3;
//import Fase4;*/

public class RestaurantMain {

	
	public static void main(String[] args) {
	
		Fase1 fase1 = new Fase1();
		Fase2 fase2 = new Fase2();
		Fase3 fase3 = new Fase3();

		
		System.out.println("FASE 1------------->");
		fase1.fase1Print();
		
		System.out.println("\nFASE 2------------->");
		fase2.fase2Print();
		
		System.out.println("\nFASE 3------------->");
		fase3.fase3Print(fase2);
		
		
	}

}
