/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_2_return;

/**
 *
 * @author invitado
 */
public class EVA3_2_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //si regresa resultado, tenemos dos opciones
           //hacer algo con el valor 
           //guardarlo y uarlo varias veces
           int valor;
           valor = sumarDosEnteros(100, 50);
           System.out.println("Resultado = " + valor);
           //Usar una sola vez
           System.out.println("Resultado = " + sumarDosEnteros(100, 50));
        //ignorar el valor
           sumarDosEnteros(100, 50);
           
           
    }
    //SUMA DOS ENTEROS
    public static int sumarDosEnteros(int num1, int num2){
      int resu;
      resu = num1 + num2;
      return resu;
    
    }
    
    
    
}
