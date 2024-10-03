/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_4_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

      int num, facto;
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce el numero;");
        num = captu.nextInt();
        captu.nextLine();
        
        facto = 1;
        for (int i =1; i <= num; i++){
        
        facto = facto * i;
        }
        
        System.out.println("factorial de " + num + "=" + facto);
        
        
        
        
        
        
        
        
        
        
        
        
        
     
    }
    
}











































