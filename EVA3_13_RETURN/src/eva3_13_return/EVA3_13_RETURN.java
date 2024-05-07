/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_return;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA3_13_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // TODO code application logic here
    Scanner captu = new Scanner (System.in);
        System.out.println("VALOR 1: ");
        int val1 = captu.nextInt();
        System.out.println("VALOR 2: ");
        int val2 = captu.nextInt();
        //LLAMAR A LA FUNCION
        //1.GUARDAR EL RESULTADO
        //int resu = sumar(val1,val2);
        //System.out.println("LA SUMA = " + resu);
        //2.USAR DIRECTAMENTE EL RESULTADO DE LA FUNCION
        //System.out.println("LA SUMA = " + sumar(val1,val2));
        //3. IGNORAR EL RESULTADO
        sumar(val1,val2);
    }
        public static int sumar (int num1, int num2){
            int resu = num1 + num2;
            return resu; // ES LA ULTIMA INSTRUCCION DEL METODO, DESPUES DEL RETURN YA NO PUEDE HABER MAS INSTRUCCIONES.
            
        }
    }
    
