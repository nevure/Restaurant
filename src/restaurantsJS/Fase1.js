/**
 * Fase1 - Ejercico de Restaurant en JavaScript
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */

let euroCinc = 5, euroDeu = 10, euroVint = 20, euroCincquanta = 50, euroCent= 100, euroDosCents=200, euroCincCents= 500
let formulario = document.formulario
let platos = [5]
let precios = [5]
let pedidos = []
let impresF1 = false


var respostaFase1 = function(){

  let selectElement = document.getElementById('fase1Sortida')
  

  if (impresF1) {}
  else {
	

    let impresF1 = true

    //recogemos datos del formulario de platos y precios.
    
	let plato1 = document.formulario.plato1.value
	let plato2 = document.formulario.plato2.value
	let plato3 = document.formulario.plato3.value
	let plato4 = document.formulario.plato4.value	
	let plato5 = document.formulario.plato5.value
	
	let preu1 = document.formulario.preu1.value
	let preu2 = document.formulario.preu2.value
	let preu3 = document.formulario.preu3.value
	let preu4 = document.formulario.preu4.value	
	let preu5 = document.formulario.preu5.value
	
	//Plato 1
	
	/*
	 * Según se complenten los campos con precios correctos y una vez se pulsa
	 * el botón Fase1, se deshabilitan éstos.
	 * 
	 *	
	 */
	
	if (document.formulario.plato1.disabled == true && document.formulario.preu1.disabled == true) {}
	else  {
		//comprobamos que el precio es pagable con billetes de Euro
	 if (document.formulario.preu1.value>0 && document.formulario.preu1.value % 2 == 0 && document.formulario.preu1.value % 5 == 0 || document.formulario.preu1.value >0 && document.formulario.preu1.value % 5 == 0 )
		 {
	    	document.formulario.plato1.disabled=true
	    	document.formulario.preu1.disabled=true
	     }
		
	 else {
			alert("Fase1 -> El precio del plato 1 debe ser pagable con billetes de euro")
	 }
	}
	
	//Plato 2

    if (document.formulario.plato2.disabled == true) {}
	else  {
		 if (document.formulario.preu2.value>0 && document.formulario.preu2.value % 2 == 0 && document.formulario.preu2.value % 5 == 0 || document.formulario.preu2.value >0 && document.formulario.preu2.value % 5 == 0 )
		 {
	    	document.formulario.plato2.disabled=true
	    	document.formulario.preu2.disabled=true

	    }
		
	 else {
			alert("Fase1 -> El precio del plato 2debe ser pagable con billetes de euro")
	 }
	}

	//Plato 3

    if (document.formulario.plato3.disabled == true) {}
	else  {
		 if (document.formulario.preu3.value>0 && document.formulario.preu3.value % 2 == 0 && document.formulario.preu3.value % 5 == 0 || document.formulario.preu3.value >0 && document.formulario.preu3.value % 5 == 0 )
		 {
	    	document.formulario.plato3.disabled=true
	    	document.formulario.preu3.disabled=true

	    }
		
	 else {
			alert("Fase1 -> El precio del plato 3 debe ser pagable con billetes de euro")
	 }
	}

	//plato 4

    if (document.formulario.plato4.disabled == true) {}
	else  {
		 if (document.formulario.preu4.value>0 && document.formulario.preu4.value % 2 == 0 && document.formulario.preu4.value % 5 == 0 || document.formulario.preu4.value >0 && document.formulario.preu4.value % 5 == 0 )
		 {
	    	document.formulario.plato4.disabled=true
	    	document.formulario.preu4.disabled=true

	    }
		
	 else {
			alert("Fase1 -> El precio del plato 4 debe ser pagable con billetes de euro")
	 }
	}
	//plato 5

    if (document.formulario.plato5.disabled == true) {}
	else  {
		 if (document.formulario.preu5.value>0 && document.formulario.preu5.value % 2 == 0 && document.formulario.preu5.value % 5 == 0 || document.formulario.preu5.value >0 && document.formulario.preu5.value % 5 == 0 )
		 {
	    	document.formulario.plato5.disabled=true
	    	document.formulario.preu5.disabled=true

	    }
		
	 else {
			alert("Fase1 -> El precio del plato 5 debe ser pagable con billetes de euro")
	 }
	}

	// Si todos los campos están deshabilitados es que ya tenemos los campos bien cumplimentados y se imprimen.
	
	if (document.formulario.plato1.disabled == true && document.formulario.plato2.disabled == true
			&& document.formulario.plato3.disabled == true  && document.formulario.plato4.disabled == true
			 && document.formulario.plato5.disabled == true)
		{
			selectElement.innerHTML += "Listado Platos Menú:  "
			selectElement.innerHTML += plato1 + ", " + plato2  + ", " + plato3  + ", " + plato4  + ", " + plato5  + " "
			document.getElementById('1').disabled = true
			//mostramos campos de pedido de fase 2
			document.getElementById("form2").style.display="block" 
			}
	else 
		alert("Fase1 -> Rellena los platos del menú y sus precios. ")
  }
}

		
// Nos aseguramos de cargar todo el JS al cargar el document html.

if (document.addEventListener){
	    window.addEventListener('load',(function() {
	    	document.getElementById('1').onclick = respostaFase1;
	    }),false);
	    
} else {
	    window.attachEvent('onload',(function() {
	    	document.getElementById('1').onclick = respostaFase1;
	    }));    
}
