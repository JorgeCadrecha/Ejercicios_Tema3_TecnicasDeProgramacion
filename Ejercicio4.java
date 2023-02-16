/*4. El tiempo de cocción
Sabiendo que:

Para cocinar 500 gramos de carne de vacuno, se necesita:

10 minutos si quieres una cocción casi cruda

17 minutos si quieres una cocción al punto

25 minutos si quieres una cocción bien hecha

Para cocinar 400 gramos de cordero se necesita:

15 minutos si quieres una cocción casi cruda

25 minutos si quieres una cocción al punto

40 minutos si quieres una cocción bien hecha

El tiempo de cocción es proporcional al peso.

Dependiendo de la información introducida por el usuario (tipo de carne, modo de cocción y peso), 
mostrar el tiempo de cocción de una carne en segundos. */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tipo de carne (vacuno o cordero): ");
        String carne = teclado.nextLine();
        System.out.println("Introduce el modo de cocción (casi cruda, al punto o bien hecha) *DEBE ESCRIBIRSE COMO APARECE*: ");
        String coccion = teclado.nextLine();
        System.out.println("Introduce el peso de la carne en gramos: ");
        int peso = teclado.nextInt();
        int tiempo = 0;
        if (carne.equals("vacuno")) {
            if (coccion.equals("casi cruda")) {
                tiempo = 10;
            } else if (coccion.equals("al punto")) {
                tiempo = 17;
            } else if (coccion.equals("bien hecha")) {
                tiempo = 25;
            }
        } else if (carne.equals("cordero")) {
            if (coccion.equals("casi cruda")) {
                tiempo = 15;
            } else if (coccion.equals("al punto")) {
                tiempo = 25;
            } else if (coccion.equals("bien hecha")) {
                tiempo = 40;
            }
        }
        System.out.println("El tiempo de cocción es de " + tiempo * peso + " segundos");
    }
}