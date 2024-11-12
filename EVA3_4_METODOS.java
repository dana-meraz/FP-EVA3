/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_4_metodos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_4_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Mayor de 8 y 7 = " + buscarMayor(8, 7));
        int dias = buscarDia("Numero del uno al 7");
        System.out.println("Dia: " + dias);
        
        
        
        
        
    }
    
    
    
    //determinar el mayor de los dos
    public static int buscarMayor(int num1, int num2){
     if(num1 > num2){
     return num1;
     }else{
     return num2;
     
     }
    }
    public static String buscarDia(int dia){
    Scanner capru = new Scanner(System.in);
    switch(dia){
            case 1:
               return "lunes";
            case 2:
                return "martes";
            case 3:
                return "miercoles";
            case 4:
                return "jueves";
            case 5:
          return "viernes";
            case 6:
                return "sabado";
            case 7:
                return "domingo";
            default: //OPCIONAL, SIN BREAK, ULTIMA SECCIÓN DEL SWITCH 
                return "Dia no valido";
        }
    
    }

}
