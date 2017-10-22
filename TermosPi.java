package termospi;

import java.util.Scanner;

/**
 *
 * @author Danilo Loschiavo
 * 
 * Projeto destinado para fins educativos referente a tarefa ALPPN_PS_IND_11_Java- Parte 1-a.
 * Solicitar numeros de termos para calcular pi.
 * 
 */
public class TermosPi {

   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int qtdTermos, contador, pi=4, denominador = 3;
       double retorno = pi;
       
       System.out.println("Olá, digite a quantidade de termos para pi.");
       qtdTermos = contador = entrada.nextInt();
       
       while(contador > 1){
           if(contador % 2 != 0)
               retorno -= (double)pi/denominador;
           else
               retorno += (double)pi/denominador;
           denominador += 2;
           contador -= 1;
       }
       System.out.println("pi com " + qtdTermos + " com termos é: "+ retorno);
    }
    
}
