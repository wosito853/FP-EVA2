/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PRACTICA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cad;
        Scanner captu = new Scanner(System.in);
        System.out.println("ingresa cualquier texto");
        cad = captu.nextLine();
        
        
         int nc = cad.length();
        for(int i = 1; i < nc; i++){
            
         if (cad.charAt(i)=='a' || cad.charAt(i)=='e'|| cad.charAt(i)=='i' || 
         cad.charAt(i)=='o' || cad.charAt(i)=='u' ||cad.charAt(i)=='A'
         || cad.charAt(i)=='E' || cad.charAt(i)=='I' || cad.charAt(i)=='O'
         || cad.charAt(i)=='U'){
        
            System.out.println(cad.charAt(i));
        
        
             }
        }
        
        
        
        
    }
    
}
