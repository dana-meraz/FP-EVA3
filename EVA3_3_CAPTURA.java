/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_3_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String nombre = capturarTex("Introduce tu nombre");
    String apellido = capturarTex("Introduce tu apellido");
    int edad = capturarEdad("Introduse tu edad: ");
    int sueldo = capturarSueldo("Introduse tu edad: ");
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("Edad: " + edad);
    System.out.println("Salario: " + sueldo);
    
    
    
    
    }
   
    public static String capturarTex(String mensaje){
      Scanner captu = new Scanner(System.in);
      String texto;
      System.out.println(mensaje);
      texto = captu.nextLine();
      return texto;
    }
    
    public static int capturarEdad(String valor){
    Scanner captu = new Scanner(System.in);
    int num;
    System.out.println(valor);
    num = captu.nextInt();
    return num;
    }
     public static int capturarSueldo(String val){
    Scanner captu = new Scanner(System.in);
    int num;
    System.out.println(val);
    num = captu.nextInt();
    return num;
    }
    
}
