/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_temperaturas;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA3_18_TEMPERATURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Seleccione una opción de conversión de temperatura:");
            System.out.println("1. Convertir Celsius a Fahrenheit");
            System.out.println("2. Convertir Celsius a Kelvin");
            System.out.println("3. Convertir Fahrenheit a Celsius");
            System.out.println("4. Convertir Kelvin a Fahrenheit");
            System.out.println("5. Convertir Fahrenheit a Kelvin");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            int opcion = input.nextInt();

            if (opcion == 6) {
                System.out.println("Saliendo del programa...");
                break;
            }
            
            System.out.print("Ingrese la temperatura a convertir: ");
            double temp = input.nextDouble();
            double resultado = 0;
            switch (opcion) {
                case 1:
                    resultado = convertirCaF(temp);
                    System.out.println(temp + " °C son " + resultado + " °F");
                    break;
                case 2:
                    resultado = convertirCaK(temp);
                    System.out.println(temp + " °C son " + resultado + " K");
                    break;
                case 3:
                    resultado = convertirFaC(temp);
                    System.out.println(temp + " °F son " + resultado + " °C");
                    break;
                case 4:
                    resultado = convertirKaF(temp);
                    System.out.println(temp + " K son " + resultado + " °F");
                    break;
                case 5:
                    resultado = convertirFaK(temp);
                    System.out.println(temp + " °F son " + resultado + " K");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor intente de nuevo.");
            }
        }
    }

    public static double convertirCaF(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double convertirCaK(double celsius) {
        return celsius + 273.15;
    }

    public static double convertirFaC(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double convertirKaF(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static double convertirFaK(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }
}