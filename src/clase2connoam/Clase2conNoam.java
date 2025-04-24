/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2connoam;

import java.util.Scanner;
/**
 *
 * @author MALAG
 */
public class Clase2conNoam {

    public static int factorial(int n){
    if (n == 0 | n == 1){
        return 1;
    }
    // Caso Recursivo  n! = n * (n-1)!
    return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Hola Soy Kevin Colombiano
        // 2. Hola soy Noam
        // 3. Como te ha parecido colombia?
        // 4. Trucha con patacones
        System.out.println("Ingrese el numero: ");
        int numero = sc.nextInt();
        int resultado = factorial(numero);
        System.out.println("Factorial de " + numero + " es: " + resultado);
    }
    
}
