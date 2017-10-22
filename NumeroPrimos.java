package numeroprimos;

import java.util.Scanner;

/**
 *
 * @author Danilo Loschiavo
 * 
 * Projeto destinado para fins educativos referente a tarefa ALPPN_PS_IND_11_Java- Parte 1-a.
 * Solicitar um número inteiro.
 * Verificar divisores possiveis do número.
 * Caso seja apenas divisivel por 1 e ele mesmo é um numero primo
 */
public class NumeroPrimos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, contador = 0;
        
        System.out.println("Olá, por favor insira um número inteiro.");
        numero = entrada.nextInt();
        
        for (int i=1; i <= numero; i++){
         if(numero%i == 0){
            contador += 1;
            System.out.println("Divisível por: " + i);
         }
        }
        if(contador == 2){
         System.out.println("Este é um número primo");
        }else{
         System.out.println("Este não é um número primo");
        }  
    }
    
}
