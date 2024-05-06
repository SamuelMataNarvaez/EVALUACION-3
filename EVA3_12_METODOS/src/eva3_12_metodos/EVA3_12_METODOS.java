/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_12_metodos;

/**
 *
 * @author user
 */
public class EVA3_12_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    mostrarMensaje("Hola mundo cruel!!!");
        mostrarMensajes("holaa!!!", 5);
    }
        // TODO code application logic here
        //PUBLIC STATIC --> PARA LA MATERIA DE POO
        //VOID --> TIPO DE DATO VALOR QUE REGRESA EL METODO
        //VOID --> NO REGRESA NADA
        //NOMBRE DEL METODO --> IDENTIFICADOR VALIDO, EMPEZAR EN MINUSCULAS, DEBE SER UN VERBO
        //()<----- PARAMETROS DEL METODO (ARGUMENTOS) --> VALORES QUE NECESITAN PARA FUNCIONAR 
        public static void mostrarMensaje (String mensaje){ //ENCABEZADO(NOMBRE DEL METODO)
        //CUERPO DEL METODO: AQUI VA NUESTRO CODIGO
            System.out.println(mensaje);
        }
         public static void mostrarMensajes(String mensaje, int veces){
            for (int i = 0; i < veces; i++) {
                System.out.println(mensaje);
                 
                 
             }
             
         }
        
}