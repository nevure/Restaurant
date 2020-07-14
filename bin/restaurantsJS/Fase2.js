/**
 * Fase2 - Ejercico de Restaurant en JavaScript
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */

//let euroCinc = 5, euroDeu = 10, euroVint = 20, euroCincquanta = 50, euroCent= 100, euroDosCents=200, euroCincCents= 500
//let formulario = document.formulario
let formulario2 = document.formulario2
//let platos = [5]
//let precios = [5]
//let pedidos = []
let impresF2 = false

var respostaFase2 = function(){
	let selectElement = document.getElementById('fase2Sortida')
	let index = 0
	  if (impresF2) {}
	  else {

	    impresF2 = true

		platos[0] = document.formulario.plato1.value
		platos[1] = document.formulario.plato2.value
		platos[2] = document.formulario.plato3.value
		platos[3] = document.formulario.plato4.value	
		platos[4] = document.formulario.plato5.value
		
		precios[0] = document.formulario.preu1.value
		precios[1] = document.formulario.preu2.value
		precios[2] = document.formulario.preu3.value
		precios[3] = document.formulario.preu4.value	
		precios[4] = document.formulario.preu5.value
		
		//Solo guardaremos los campos de texto que tengan contenido
		if (document.formulario2.pedido1.value !=""){
			pedidos[index] = document.formulario2.pedido1.value
			index++
			}
		if (document.formulario2.pedido2.value !=""){
			pedidos[index] = document.formulario2.pedido2.value
			index++
			}
		if (document.formulario2.pedido3.value !=""){
			pedidos[index] = document.formulario2.pedido3.value
			index++
			}
		if (document.formulario2.pedido4.value !="")
			pedidos[index] = document.formulario2.pedido4.value

		
		
		//Plato 1
		
		/*
		 * Revisamos los campos del formulario de pedidos y deshabilitamos tras pasar de fase
		 * 
		 *	
		 */
		
		if (document.formulario2.pedido1.disabled == true) {}
		else  {
		     	document.formulario2.pedido1.disabled=true
		    }	 
		}
		
		//Plato 2

		if (document.formulario2.pedido2.disabled == true) {}
		else  {
	     	document.formulario2.pedido2.disabled=true
	    }
		
	 
		

		//Plato 3

		if (document.formulario2.pedido3.disabled == true) {}
		else  {
			document.formulario2.pedido3.disabled=true
		}
	
 


		//plato 4

		if (document.formulario2.pedido4.disabled == true) {}
		else  {
			document.formulario2.pedido4.disabled=true
		}
	


		// Si todos los campos están deshabilitados es que ya tenemos los campos bien cumplimentados y se imprimen.
		
		if (document.formulario2.pedido1.disabled == true && document.formulario2.pedido2.disabled == true
				&& document.formulario2.pedido3.disabled == true  && document.formulario2.pedido4.disabled == true)
			{
				selectElement.innerHTML += "Listado Platos Pedidos:  "
					pedidos.forEach((elemento) =>{
						selectElement.innerHTML +=  elemento+ ", " 

					})
				document.getElementById('2').disabled = true
			}
		else 
			alert("Fase2 -> Rellena los platos del pedido. ")
	  }
	



//Nos aseguramos de cargar todo el JS al cargar el document html.


if (document.addEventListener){
    window.addEventListener('load',(function() {
    	document.getElementById('2').onclick = respostaFase2;
    }),false);
} else {
    window.attachEvent('onload',(function() {
    	document.getElementById('2').onclick = respostaFase2;
    }));    
}