/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_num_.ayor;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_12_NUM_AYOR {

    /**
     * @param args te command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, no = -9999;
        
        
        Scanner captu = new Scanner(System.in);
        
       
        do{
        
             System.out.println("ingresa un numero entero positivo");
             num = captu.nextInt();
                captu.nextLine();
          if(num > no)
          no = num;
          
              
        } while(num != -1);
                System.out.println(no);
            
            
    
     
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
