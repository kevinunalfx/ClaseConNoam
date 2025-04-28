/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2connoam;

import java.util.Scanner;



public class Clase2conNoam {

    
    public static void main(String[] args) {
        
        // Datos
        String nombre = "Kevin Malagon Leal";
        int edadprimitivo = 25;
        String carrera = "Ingeniería en Sistemas y Computacion, Universidad Nacional de Colombia";
        long telefonoprimitivo = 3212843253L;

        // Conversión de primitivos a objetos
        Integer edadObjeto = Integer.valueOf(edadprimitivo);    
        Long telefonoObjeto = Long.valueOf(telefonoprimitivo);

        // También usando parseo si vienen en String
        String edadtexto = "25";
        Integer edadDesdeTexto = Integer.parseInt(edadtexto);

        String telefonotexto = "3212843253";
        Long telefonoDesdeTexto = Long.parseLong(telefonotexto);

        // Mostrar resultados
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad (Objeto Integer): " + edadObjeto);
        System.out.println("Carrera: " + carrera);
        System.out.println("Teléfono (Objeto Long): " + telefonoObjeto);

        System.out.println("\nConversión desde texto:");
        System.out.println("Edad (desde texto): " + edadDesdeTexto);
        System.out.println("Teléfono (desde texto): " + telefonoDesdeTexto);
    
    }
    
}
