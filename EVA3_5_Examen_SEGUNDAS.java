/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_5_examen_segundas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_5_Examen_SEGUNDAS {
    
   public static final int PIEDRA = 1;
 public static final int PAPEL = 2;
   public static final int TIJERAS = 3;
   
   public static final int EMPATE = 0;
   public static final int GANA = 1;
   public static final int PIERDE = 2;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resu;
        int jugada;
        int resuJug;
        do{
        resu = pedirJugada("Introduse tu jugada (1-piedra, 2-papel, 3-tijera, 0-salir)");
        jugada = generarJugada();
        System.out.println(jugada);
        resuJug = evaluarPartida(resu, jugada);
        System.out.println(resuJug);
        
        }while(resu != 0);
        
       
    }
    
    //PEDIR DATOS AL USUARIO
   public static int pedirJugada(String mensaje){
   Scanner captu = new Scanner(System.in);
   System.out.println(mensaje);
   int seleción = captu.nextInt();
   return seleción;
   
   }
   
   //generar la jugada de la computatora
   public static int generarJugada(){
   int jugada;
      
   double valor = Math.random();   
//¿COMO GENERAR la jugada
   if((valor >= 0) && (valor < 0.3))
       jugada = 1;//piedra
   else if((valor >= 0.3) && (valor < 0.6))
       jugada = 2; //papel
   else
       jugada = 3;//tijera
   return jugada;
   
   }
    //evaluar la jugada
   public static int evaluarPartida(int jugadaUsu, int jugadaComp){
   int resu;//1-pedra 2-papel 3-rijeras
       if((jugadaUsu == PIEDRA) && (jugadaComp == PIEDRA))
           resu = EMPATE;
   else if((jugadaUsu == PIEDRA) && (jugadaComp == PAPEL))
       resu = PIERDE;
   else if((jugadaUsu == PIEDRA) && (jugadaComp == TIJERAS))
       resu = GANA;
   else if((jugadaUsu == PAPEL) && (jugadaComp == PIEDRA))
       resu = PIERDE;
   else if((jugadaUsu == PAPEL) && (jugadaComp == PAPEL))
       resu = EMPATE;
   else if((jugadaUsu == PAPEL) && (jugadaComp == TIJERAS))
       resu = PIERDE;
   else if((jugadaUsu == TIJERAS) && (jugadaComp == PIEDRA))
       resu = PIERDE;
   else if((jugadaUsu == TIJERAS) && (jugadaComp == PAPEL))
       resu = GANA;   
   else
       resu = EMPATE;
       return resu;
   }
    
}
