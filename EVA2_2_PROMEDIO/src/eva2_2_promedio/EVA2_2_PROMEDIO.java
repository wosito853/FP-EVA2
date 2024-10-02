/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_2_PROMEDIO {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int calif, acum;
        Scanner captu = new Scanner (System.in);
        acum = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println("Estudiante #" + i);
        System.out.println("dame tu calificacion");
       calif = captu.nextInt();
       captu.nextLine();
        acum = acum + calif;
        
        }
        System.out.println("promedio = " + (acum / 10.0));
    }
    
}
