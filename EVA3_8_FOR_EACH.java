/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_8_for_each;

/**
 *
 * @author invitado
 */
public class EVA3_8_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", 
            "Sabado", "domingo"};
        /*for (int i = 0; i < dias.length; i++){
        System.out.println(dias[i]);
        }*/
        
        for(String cade: dias){
            System.out.println(cade);
            
        }
        
        int[] billetes = {20, 50, 100, 200, 500, 1000};
        
        for(int billete: billetes){
        System.out.println(billete);
        }
        
    }
    
}
