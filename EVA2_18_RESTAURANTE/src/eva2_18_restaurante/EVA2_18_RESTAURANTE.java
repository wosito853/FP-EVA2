/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_restaurante;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_18_RESTAURANTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String menu[] = {"dogos", "hamburguesa", " boneless", "Tacos", 
            "montados", "camarones"};
        int precios[] = {50, 80, 120, 150, 70, 200};
        Scanner captu = new Scanner(System.in);
        int can, produ;
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + "-" + menu[i] + " $" + precios[i]);
            
            
        }
        
        
     System.out.println("cual es tu orden? (introduce el numero del producto)");
       produ = captu.nextInt();
       captu.hasNextLine();
       System.out.println("cuantas ordenes");
       can = captu.nextInt();
       captu.hasNextLine();
        System.out.println("el costo es de = $" + can * precios[produ]);
        
    }
    
}
