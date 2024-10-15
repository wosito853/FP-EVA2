/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_acceso;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_8_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String usu,cont;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("dame tu usuario");
        usu = captu.nextLine();
        
        System.out.println("dame tu contraseña ");
        cont = captu.nextLine();
        
        
        
        do {
             System.out.println("dame tu usuario");
        usu = captu.nextLine();
        
        System.out.println("dame tu contraseña ");
        cont = captu.nextLine();
            
        } while(!(usu.equals("admin") && cont.equals("admin")));
        System.out.println("PROGRAMA PRINCIPAL!!");
        
    }
    
}
