/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PRACTICA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String palabra;
        int num;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("dame una palabra");
        palabra = captu.nextLine();
        
        System.out.println("dame un numero ");
         num = captu.nextInt();
         
         int acum;
         for(int i = 1; i<= num  ;i ++ ){
             System.out.println(palabra);
        }
         
         
         
         
         
             
        
        
    }
    
}
