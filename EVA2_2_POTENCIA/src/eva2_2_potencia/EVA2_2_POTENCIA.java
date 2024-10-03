/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_potencia;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_2_POTENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int base, expo;
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce la base;");
        base = captu.nextInt();
        captu.nextLine();
        System.out.println("introudce el exponente;");
        expo = captu.nextInt();
        captu.nextLine();
         
          // System.out.println("Potencia = + Math.pow (base, expo));
         
         int acum = 1;
         for(int i = 1; i <= expo; i++ ){
         acum = acum * base ;
         
         
         
         }
 
         System.out.println("potencia = " + acum);
    
    }
    
}
