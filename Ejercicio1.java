//1. El tiempo
//Escriba un algoritmo que muestre "riesgo de hielo", si la temperatura introducida es inferior a 2°C.

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la temperatura: ");
        int temperatura = teclado.nextInt();
        if (temperatura < 2) {
            System.out.println("Riesgo de hielo");
        }
    }
}