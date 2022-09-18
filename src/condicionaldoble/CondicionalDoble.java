/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionaldoble;

import java.util.Scanner;
/**
 *
 * @author JESUS
 */
public class CondicionalDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Estructura Condicional Doble (Par o Impar).
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.print("Introduzca un número entero: ");
        numero = teclado.nextInt();
        if (numero % 2 == 0) {  // Si el resto de la división entera entre 2 es cero, el número es par
        System.out.println("El número es par.");
        } else { // Si no, el número es impar
        System.out.println("El número es impar.");
        }
    }
}
