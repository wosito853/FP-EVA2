/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_continue;

/**
 *
 * @author Usuario
 */
public class EVA2_6_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         for (int i = 1; i <= 10; i++) {
            //if(i==8)
              //  continue;
              
              if ((i % 2)== 0)
                  continue; // detiene el ciclo por completo en ese punto 
            System.out.print(i + "-");
            
        }
        
        
    }
    
}
