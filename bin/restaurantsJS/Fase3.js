/**
 * Fase3 - Ejercico de Restaurant en JavaScript
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */

let impresF3 = false


var respostaFase3 = function(){
	let selectElement = document.getElementById('fase3Sortida')
	var totalFactura = 0
	let noEsta= false
	if (impresF3) {}
	else {

		impresF3 = true

		pedidos.forEach( function (pedido) {
			
			if (platos.includes(pedido))
				{
				totalFactura += parseInt(precios[platos.indexOf(pedido)])
				
			}else {
				selectElement.innerHTML += "El plato " +pedido + " no está en el menú"
				noEsta = true
			}
			
			
		})
		
		if (noEsta) 
			selectElement.innerHTML += "Hay platos del pedido que no tenemos"
		else
			selectElement.innerHTML += "el total de la factura es: "+ totalFactura

	}
}




//Nos aseguramos de cargar todo el JS al cargar el document html.


if (document.addEventListener){
    window.addEventListener('load',(function() {
    	document.getElementById('3').onclick = respostaFase3;
    }),false);
} else {
    window.attachEvent('onload',(function() {
    	document.getElementById('3').onclick = respostaFase3;
    }));    
}