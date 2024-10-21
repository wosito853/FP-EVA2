/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_arreglos;

/**
 *
 * @author Usuario
 */
public class EVA2_15_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // DECLARACION de arreglos
        
        int[] arreglo = new int [10];// ocupa 40 bytes 
        
        // manejo por índices
        // perimero elementode un arreglo --> cer
        arreglo[0] = 100;
                arreglo[1] = 200;
                        arreglo[2] = 300;
                             arreglo[3] = 400;

                     arreglo[4] = 500;

                           arreglo[5] = 600;
                      arreglo[6] = 700;
                    arreglo[7] = 800;
           arreglo[8] = 900;
        // ultimo elemento de un arreglo --> tamaño menos 1
        arreglo[9] = 1000;
        // el acceso siempre es a traves de las posiciones 
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        System.out.println(arreglo[3]);
        
        
    }
    
}
