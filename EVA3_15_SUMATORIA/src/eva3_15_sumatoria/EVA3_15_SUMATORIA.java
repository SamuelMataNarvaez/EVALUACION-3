/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_15_sumatoria;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA3_15_SUMATORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner captu = new Scanner(System.in);
        System.out.println("cual es la sumatoria? ");
        
        int suma = captu.nextInt();
        int sum = sumarSumatoria(suma);
        System.out.print("La sumatoria total =  " + sum);   
    }
    public static int sumarSumatoria(int Sumatoria){
        int sum = 0;
        for (int i = 1; i <= Sumatoria; i++) 
            sum += i;
        return sum;
    
    }}