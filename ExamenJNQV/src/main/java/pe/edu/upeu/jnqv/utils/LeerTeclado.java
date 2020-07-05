package pe.edu.upeu.jnqv.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LeerTeclado {
    
    BufferedReader leerQ=new BufferedReader(new InputStreamReader(System.in));

    public int leer(int dato, String mensaje){
        try {
            System.out.println(mensaje);
            dato=Integer.parseInt(leerQ.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return dato;
    }

    public String leer(String dato, String mensaje){
        try {
            System.out.println(mensaje);
            dato=leerQ.readLine();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return dato;
    }

    public char leer(char dato, String mensaje){
        try {
            System.out.println(mensaje);
            dato=leerQ.readLine().charAt(0);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return dato;
    }        

    public double leer(double dato, String mensaje){
        try {
            System.out.println(mensaje);
            dato=Double.parseDouble(leerQ.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return dato;
    }   

}