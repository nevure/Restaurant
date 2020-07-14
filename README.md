# Restaurant

El aplicativo consta de su paquete principal y dentro de este los siguietnes subpaquetes:

1- Paquete utils:

  a. paquete utils.IOConsole

  b. paquete Utils.Monedes

2- Paquete Cliente.

Se ha intentado en la medida de lo posible estructurar el programa para darle un aire más de POO. Evidentemente de forma muy limitada al ser el problema muy pequeño.

El paquete Cliente nos provee de herramientas para tratar con el cliente del restaurante. El menú del restaurante, el precio de cada plato, el pedido del cliente, la factura final...

El paquete Utils.IOConsole no es más que un "adorno" sobre la entrada y salida de Consola, pero que podría facilitar el trabajo y automatizar algunos procesos.

El paquete Utils.Monedes apenas hace nada. En nuestro ejercicio apenas nos verifica  si el precio del plato es pagable con billetes de Euro. Hemos creado esta limitación, sin más motivo que darle una vuelta más al ejercicio. Teniendo en cuenta que se nos dice que creemos una variable por billete de Euro.

Luego Las clases de las fases donde la fase 1 apenas hace nada y la fase 2 es la responsable de recoger de consola por medio de los métodos del paquete Utils.IOConsole, los platos del menú y el pedido del cliente.

La fase 3 recibe el objeto de la fase 2 para poder seguir trabajando con el menú ya creado y los platos pedidos por el cliente. Con estos datos solo comprueba que el pedido es correcto, verificando que los platos que se piden están en el menú.


