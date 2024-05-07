/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_14_return_2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA3_14_RETURN_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        System.out.println("BASE: ");
        int base = captu.nextInt();
        System.out.println("POTENCIA: ");
        int potencia = captu.nextInt();
        
        int resu = calcularPot (base,potencia);
        System.out.println("EL RESULTADO ES = " + resu);
    }
    //CREAR UNA FUNCION QUE CALCULE LA POTENCIA DE UN VALOR ENTERO
    public static int calcularPot(int base,int potencia){
        int resu = 1;
        for (int i = 0; i < potencia; i++) {
         resu = resu * base;  
        }
    return resu;
}
}
