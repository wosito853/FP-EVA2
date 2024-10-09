/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica.pkg5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PRATICA5 {

    /**
     * @param args the command line arguments
     */
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
    }
    
}
