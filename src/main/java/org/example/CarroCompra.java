package org.example;

import example.Calculadora;

public class CarroCompra {
    private int[][] productos = new int[2][5];

    /** Constructor para objetos de clase CarroCompra */
    public CarroCompra() {
        // inicializar variables de instancia
        for (int i = 0; i < 5; i++) {
            productos[0][i] = 1; // cantidad
            productos[1][i] = 1000; // precio
        }
    }

    private int calcularTotal() {
        int total = 0, subtotal = 0;
        for (int i = 0; i < 5; i++) {
            total += subTotal(productos[0][i], productos[1][i]);
        }
        return total;
    }

    private int subTotal(int cant, int precio) {
        example.Calculadora calc = new Calculadora(cant, precio);
        return calc.multiplicar();
    }

    public void mostrarTotal() {
        System.out.println("El total de la compra es: " + this.calcularTotal());
    }
}
