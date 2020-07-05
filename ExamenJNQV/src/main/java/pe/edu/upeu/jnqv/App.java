package pe.edu.upeu.jnqv;

import java.util.Scanner;

import pe.edu.upeu.utils.LeerTeclado;

/**
 * Jhoselyn Noemí Quispe Valero!
 *
 */
public class App {

   static Scanner leer=new Scanner(System.in);
    public static void main( String[] args ){
        LeerTeclado teclado=new LeerTeclado();
        System.out.println( "Sistema de Pruebas *****" );        
        String opcion="SI";
        int numAlg;
        String name_algoritmos=
          "1= automovil"+
          "2=table"+
          "3=num_perfect"+
          "4=";
        do{
          System.out.println(name_algoritmos);          
          numAlg=teclado.leer(0,"Ingrese el Algoritmo que desea probar: ");
          switch(numAlg){
            case 1:         
            break;


            case 2:

            break;


            case 3:         

            break; 
            
            
            case 4:         

            break; 
            
            
            default: System.out.println("Num de Algoritmo no existe!!"); break;
          }          
          opcion=teclado.leer("","Desea probar mas algoritmos? SI/NO");  
        }while(opcion.equals("SI"));  
    }
}