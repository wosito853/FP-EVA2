/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_unidad_2;
    import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EXAMEN_UNIDAD_2 {

    public static void main(String[] args) {
      


        Scanner captu = new Scanner(System.in);
        Random random = new Random();

        String[] opciones = {"Piedra", "Papel", "Tijera"};
        
        int winPersona = 0;
        int winComputadora = 0;
        int empates = 0;
        String jugarOtravez;

        System.out.println(" Piedra, Papel o Tijera");
        
        do {
            System.out.print("Elige una opcion (piedra, papel o tijera): ");
            String eleccionHum = captu.nextLine();

            
            String eleccionCompu = opciones[random.nextInt(opciones.length)];
            System.out.println("La computadora elige: " + eleccionCompu);

            
            if (eleccionHum.equalsIgnoreCase(eleccionCompu)) {
                System.out.println("Empate.");
                empates++;
    }else if ((eleccionHum.equalsIgnoreCase("piedra") && eleccionCompu.equals("tijera")) ||
     (eleccionHum.equalsIgnoreCase("papel") && eleccionCompu.equals("piedra")) ||
     (eleccionHum.equalsIgnoreCase("tijera") && eleccionCompu.equals("papel"))) {
                System.out.println("Ganaste");
                winPersona++;
            } else {
                System.out.println("La computadora gano");
                winComputadora++;
            }

            
            System.out.print("Quieres jugar otra? (s/n): ");
            jugarOtravez = captu.nextLine();

        } while (jugarOtravez.equalsIgnoreCase("s"));

        
        System.out.println("Resultados finales:");
        System.out.println("wins del usuario: " + winPersona);
        System.out.println("wins de la computadora: " + winComputadora);
        System.out.println("Empates: " + empates);

        captu.close();
    }
}

        
        
        