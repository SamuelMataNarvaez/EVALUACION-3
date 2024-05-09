/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_busqueda;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA3_11_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CREAR UN ARREGLO (ENTEROS)
   int arreglo [] = new int [10];
   //LLENARLO CON VALORES ALEATORIOS
   for (int i = 0; i<arreglo.length; i++){
       arreglo [i] = (int) (Math.random()*100) + 1;
       
   }
   //IMPRIMIRLO
   for (int cant: arreglo){
       System.out.print("[" + cant + "]");
   }
   //PREGUNTAR AL USUARIO EL VALOR A BUSCAR
   Scanner captu = new Scanner (System.in);
   System.out.println("Que valor buscas");
        int valor = captu.nextInt();
        
        //BUSCAR:
        //RECORRER EL ARREGLO (CICLO FOR)
        //COMPARAR VALOR BUSCADO CONTRA EL VALOR EN EL ARREGLO (IF)
        //DETERMERME SI LO ENCUENTRO, SI NO, SEGUIR BUSCANDO
        //REGRESAR EL RESULTADO: PUEDE VARIAR > PUEDE SER LA POCISION 
        //O VERDADERO (SI LO ENCUENTRA) O FALSO (NO LO ENCUENTRA)
        
        int posicion = -1; //una posicion que no existe
        
        for (int i = 0; i < arreglo.length; i++) {
            if(valor == arreglo[i]);{
        posicion = i; //Almaceno la posicion donde esta el valor 
            break;
            
        
        
            }   
        }
        System.out.println("posicion = " + posicion);
    }
}
