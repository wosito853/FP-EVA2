/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PRACTICA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String pal;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("ingresa una cadena de texto");
        pal = captu.nextLine();
        int nc = pal.length();
        for(int i = 1; i < nc; i++){
            
            System.out.println(pal.charAt(i));
        }
        
    }
    
}
