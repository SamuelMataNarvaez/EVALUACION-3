/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_arreglos;

/**
 *
 * @author user
 */
public class EVA3_1_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //LOS ARREGLOS EN JAVA SON OBJETOS.
        //TENEMOS QUE CREARLOS ANTES DE USARLOS.
        //[]--> manejar los indices: arreglo [3] acceso a la posicion
        //declaracion = creacion (new)[tamaño del arreglo]
        int arreglo[] = new int [10]; //un arreglo de 10 enteros.
        //atraves de los indices: conocer las posiciones de los valores:
        //primer posicion de un arreglo es cero --> 0
        //ultima posicion de un arreglo es --> N-1, donde n es el tamaño del arreglo.
        arreglo [1] = 100;
        System.out.println("valor de arreglo [1] = " + arreglo[1]);
        System.out.println(arreglo);
        System.out.println(arreglo.length); //es la cantidad de elementos
    }
    
}
