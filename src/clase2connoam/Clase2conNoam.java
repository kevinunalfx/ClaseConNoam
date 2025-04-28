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
        String nombre2 = "Noam Grea";
        int edadprimitivo2 = 22;
        String carrera2 = "Ingeniería en Sistemas y Computacion, Universidad Nacional de Colombia";
        long telefonoprimitivo2 = 3009426539L;

        // Conversión de primitivos a objetos
        Integer edadObjeto = Integer.valueOf(edadprimitivo);    
        Long telefonoObjeto = Long.valueOf(telefonoprimitivo);
        Integer edadObjeto2 = Integer.valueOf(edadprimitivo2);    
        Long telefonoObjeto2 = Long.valueOf(telefonoprimitivo2);

        // También usando parseo si vienen en String
        String edadtexto = "25";
        Integer edadDesdeTexto = Integer.parseInt(edadtexto);
        String edadtexto2 = "22";
        Integer edadDesdeTexto2 = Integer.parseInt(edadtexto2);

        String telefonotexto = "3212843253";
        Long telefonoDesdeTexto = Long.parseLong(telefonotexto);
        String telefonotexto2 = "3009426539";
        Long telefonoDesdeTexto2 = Long.parseLong(telefonotexto2);

        // Mostrar resultados
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad (Objeto Integer): " + edadObjeto);
        System.out.println("Carrera: " + carrera);
        System.out.println("Teléfono (Objeto Long): " + telefonoObjeto);

        System.out.println("\nConversión desde texto:");
        System.out.println("Edad (desde texto): " + edadDesdeTexto);
        System.out.println("Teléfono (desde texto): " + telefonoDesdeTexto);

        System.out.println("Nombre: " + nombre2);
        System.out.println("Edad (Objeto Integer): " + edadObjeto2);
        System.out.println("Carrera: " + carrera2);
        System.out.println("Teléfono (Objeto Long): " + telefonoObjeto2);

        System.out.println("\nConversión desde texto:");
        System.out.println("Edad (desde texto): " + edadDesdeTexto2);
        System.out.println("Teléfono (desde texto): " + telefonoDesdeTexto2);
    
    }
    
}
