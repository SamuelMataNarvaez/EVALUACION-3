/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_16_metodos_arreglos;

/**
 *
 * @author user
 */
public class EVA3_16_METODOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] datos = new int [10];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random()*100);
            
        }
        datos = llenar (datos);//MANDAMOS EL ARREGLO, NO LO DEVUELVE LLENOS
        imprimir (datos);//IMPRIME LOS VALORES DEL ARREGLO
        System.out.println("");
        int [] datos2 = new int [15];
        for (int i = 0; i < datos2.length; i++) {
            datos2[i] = (int) (Math.random()*100);
    }
        datos2= llenar (datos2); //MANDAMOS EL ARREGLO, NO LO DEVUELVE LLENOS
         imprimir (datos2);//IMPRIME LOS VALORES DEL ARREGLO
    }
    public static void imprimir (int [] arreglo){
       for (int i = 0; i < arreglo.length; i++) {
           System.out.print("[" + arreglo[i] + "]");
            
            
        }
    }
    public static int[] llenar (int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random()*100);
        }
        return arreglo;
}}

