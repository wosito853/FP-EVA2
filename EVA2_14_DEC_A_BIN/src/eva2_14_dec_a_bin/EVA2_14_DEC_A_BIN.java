/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_dec_a_bin;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_14_DEC_A_BIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dec,un,dos;
        
      
        String acum = "h";
        
         Scanner captu = new Scanner(System.in);
        System.out.println("ingresa tu numero decimal");
        dec = captu.nextInt();
         while(dec != 0){
             un = dec % 2;
             dos = dec / 2;
             dec = dos;
             acum = un + acum ;
             
        
             System.out.println(un + dos + dec);
        
        
        
         }
         System.out.println(acum);
    }
    
}
