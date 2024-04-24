/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_arreglos_2;

/**
 *
 * @author user
 */
public class EVA3_2_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JAVA: 0 PRIMER ELEMENTO
        //N - 1 ULTIMO ELEMENTO
        //N--> TOTAL DE ELEMENTOS ALMACENADOS EN EL ARREGLO
        
        
        //VAMOS A CREAR UN ARREGLO Y LLENARLO DE NUMEROS ALEATORIIOS.
        // INT DATOS [] X,Y; --> SOLO DATOS ES UN ARREGLO
        
        //INT [] DATOS X,Y; --> TODAS LAS VARIABLES SON ARREGLOS
        int datos [] = new int[10];
        
        //asignar valores aleatorios entre 0 y 99.
        for (int i = 0; i<datos.length; i++){
            datos[i] = (int) (Math.random()*100); //0-99
        }
    //IMPRIMIR LOS ELEMENTOS DEL ARREGLO.
    for (int i = 0; i<datos.length; i++){
            System.out.print("[" + datos[i] + "]");
}
    }}
