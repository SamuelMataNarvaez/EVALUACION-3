/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_arreglos_multi;

/**
 *
 * @author user
 */
public class EVA3_6_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz [][] = new int[3][2];
        matriz[0][0] = 100;
        matriz[1][0] = 400;
        matriz[2][0] = 200;
        matriz[0][1] = 500;
        matriz[1][1] = 300;
        matriz[2][1] = 600;
        //-----------------
        System.out.println("matriz.length = " + matriz.length);
        //voy a correr la primer dimension
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("matriz [" + i + "][" + j + "] = " + matriz[i][j]);
            }
            
        }
        
    }
    
}
