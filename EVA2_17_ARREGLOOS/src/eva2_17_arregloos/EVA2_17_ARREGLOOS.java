/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_arregloos;

/**
 *
 * @author Usuario
 */
public class EVA2_17_ARREGLOOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String DS[]={"Lunes", "martes", "miercoles", "jueves", "viernes",
        "sabado", "domingo"};
        int valores[] = {20, 50, 100, 200, 500};
        for (int i = 0; i < DS.length; i++) {
            System.out.print(DS[i]+"-");   
        }
        System.out.println("");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i]+"-");   
        }
        
        
        
    }
    
}
