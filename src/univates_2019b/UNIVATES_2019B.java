/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
   autor: Luan Castoldi
*/
package univates_2019b;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author luan.castoldi
 */
public class UNIVATES_2019B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
   

  Pessoa pessoa1 = new Pessoa(); 
  Pessoa pessoa2 = new Pessoa();
           
   //Para Depositar para o Luan é só colocar o numero POSITIVO
   //Para Depositar para o Renan é só colocar o numero NEGATIVO-
    
       Scanner teclado = new Scanner(System.in);
       System.out.println("Digite o valor da tranferencia (numero inteiro)");
       int valorTransferencia = teclado.nextInt();
    
      //int valorTransferencia = 200;
        
        System.out.println("Saldo incial " + "\n"); 
        
        
       pessoa1.setNome("Luan");
       pessoa1.setValorConta(500);
       System.out.println(pessoa1);
       
       
        pessoa2.setNome("Renan");
        pessoa2.setValorConta(500);
        System.out.println(pessoa2);
       
        
        
      transferencia(pessoa1.getNome(), pessoa2.getNome(), pessoa1.getValorConta(), valorTransferencia);

    }
          
        public static void transferencia(String nomeP, String nomeS, double tra1, double tra2) {    
        double result = tra1 + tra2;
        double result1 = tra1 - tra2;
        System.out.println("Valores Atualizados da Tranferencia: R$ " + tra2 + "\n"  + "\n" + "Nome = " + nomeP + "\n" + "Valor = "+ result + "\n" + 
                                                               "--------------------" + "\n" +
                                                             "Nome = " + nomeS + "\n" + "Valor = "+ result1);
    
         
         }
        
       
        
}