/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PRACTICA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num, Num;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("dame un numero");
        num = captu.nextInt();
        
       
        System.out.println("dame otro numero");
        Num = captu.nextInt();
        
        
        for(int i = num ; i <= Num; i++){ 
            
             
             System.out.println("x" + i);    
        }
        
        for(int i = Num ; i >= num; i--){
            
            System.out.println("y" + i);
        }
        
        
        
        
       
        
        
    }
    
}
