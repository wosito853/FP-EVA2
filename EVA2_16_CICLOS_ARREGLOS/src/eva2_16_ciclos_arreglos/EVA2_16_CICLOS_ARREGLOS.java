/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_ciclos_arreglos;

/**
 *
 * @author Usuario
 */
public class EVA2_16_CICLOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] datos, x, y, z; // tods son arreglos
        int val1,val2, arreglo[], val3; 
        arreglo = new int [10];
        
        // llenamos el arreglo con nnumeros entre 0 y 100
        for (int i = 0; i < 10; i++) {
            arreglo[i] = (int)(Math.random() * 100);
            
            
        }
        // imprimimos los numeros 
        for (int i = 0; i < 10; i++) {
            System.out.println(arreglo [i]); 
        }
    }
    
}
