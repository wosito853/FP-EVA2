/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_while_do_while;

/**
 *
 * @author Usuario
 */
public class EVA2_7_WHILE_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //FOR --> numero exacto de repeticiones
        // while --> cero a mas repes
        // Do While una o mas repeticiones 
        
        
        // While :
        System.out.println("WHILE");
        
        int val = 1;
        
        while(val <= 10){// (mientras (esto sea verdad )(repite estas instrucciones ))
            System.out.print(val + "-");
            val ++;
        }
        
        // DO WHILE 
         System.out.println("");
         System.out.println("DO WHILE ");
        
        val = 1;
        do{
            System.out.print(val + "-");
            val++;
            
        } while(val <= 10); // repetir éstas instrucciones mientras ésto sea verdad 
        
        
        
        
        
        
        
        
        
    }
    
}
