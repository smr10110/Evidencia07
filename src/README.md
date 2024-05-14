Integrante: Angelo Huaiquil

1) Clases Identificadas:

Calculadora: Esta clase realiza operaciones simples como sumar y multiplicar números.
CarroCompra: Esta clase representa un carrito de compras que guarda productos con su cantidad y precio, y puede calcular el total a pagar por todos los productos.

Contexto del Problema:

Este sistema simula una compra en una tienda. Cada producto en el carrito tiene un precio y una cantidad especificada. La clase Calculadora ayuda a hacer los cálculos necesarios, como multiplicar el precio por la cantidad de cada producto. La clase CarroCompra se encarga de manejar el carrito, sumar los costos de todos los productos y mostrar el total a pagar.

2) Atributos y metodos:

- Clase Calculadora:

Atributos:
'n1': privado y tipo entero. Almacena el primer numero para operaciones 
'n2': privado y tipo entero. Almecana el segundo numero para operaciones 

Metodos:
'sumar()': Devuelve la suma de n1 y n2.
'multiplicar()': Devuelve el producto de n1 y n2.
'setN1(int num1)': Establece el primer número.
'setN2(int num2)': Establece el segundo número.

- Clase CarroCompra:

Atributos:

 'int[][] productos': privado. Arreglo bidimensional que guarda la cantidad y el precio de cada producto.

Metodos:

'calcularTotal()': Calcula el total del costo de los productos en el carro.
'subTotal(int cant, int precio)': Utiliza una instancia de Calculadora para multiplicar cantidad y precio de un producto.
'mostrarTotal()': Muestra el total del costo de los productos.

