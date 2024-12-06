/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen_unida3_24550372;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Examen_Unida3_24550372 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner capt = new Scanner(System.in);
        int alum, num, media;
        int acum;
        acum = 1;
        System.out.println("Ingresa el numero de estudiantes");
        alum = capt.nextInt();
                capt.hasNextLine();
                for(int i = 0; i < alum; i++){
            System.out.println("Ingresa la calificacion del alumno " + i);
            num = capt.nextInt();
            capt.hasNextLine();
            
           // acum = num + num;
            //System.out.println(acum);
            
    }
    }
    
}
