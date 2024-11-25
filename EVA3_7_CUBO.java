/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_7_cubo;

/**
 *
 * @author invitado
 */
public class EVA3_7_CUBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][][] cubo = new int[2][5][3];//30 enteros 
        //LLENAR CON VALORES ALEATORIOS 
        System.out.println(cubo.length);
        System.out.println(cubo[0].length);
        System.out.println(cubo[0][0].length);
        
        
        for(int i = 0; i < cubo.length; i++){
           for(int j = 0; j < cubo[i].length; j++){
              for(int k = 0; k < cubo[i][j].length; k++){
                 cubo[i][j][k] = (int)(Math.random() * 100);
              }
           }
        }
        
        //IMPRIMIR
        
        
        
        for(int i = 0; i < cubo.length; i++){
           for(int j = 0; j < cubo[i].length; j++){
              for(int k = 0; k < cubo[i][j].length; k++){
                 System.out.println("[" + cubo[i][j][k] + "]");
              }
           }
        }
        
        
    }
    
}
