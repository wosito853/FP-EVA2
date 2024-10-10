/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PRACTICA6 {
     
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        String pal = "*" ;
        Scanner captu = new Scanner(System.in);
        System.out.println("ingresa cuakquier numero");
        num = captu.nextInt();
        
        
        for(int i = 1; i <= num; i ++){
            
            System.out.println(pal);
           pal = pal + "*";
        
        }
        for (int i = num ; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
        }
        
        
    }
    
}