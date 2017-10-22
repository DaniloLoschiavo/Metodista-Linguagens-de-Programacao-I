package distribuir;

import java.util.Scanner;

/**
 *
 * @author Danilo Loschiavo
 * 
 * Projeto destinado para fins educativos referente a tarefa ALPPN_PS_IND_11_Java- Parte 1-a.
 * Solicitar entrada de a e b.
 * Distribuir a em b vezes.
 * Mostrar valor da distribuição e sobra
 */
public class Distribuir {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, resultado = 0;
        
        System.out.println("Olá, por favor entre com o número de itens a ser distribuído.");
        a = entrada.nextInt();
        System.out.println("Muito bem, agora insira o número em que os itens serão distribuidos.");
        b = entrada.nextInt();
        
        while(a >= b){
            resultado++;
            a -= b;
        }   
        System.out.println("Foi possivel dividir em " + resultado + " para cada " + 
                (a > 0 ? "e soubrou " + a + "." : "e não sobrou nada."));
    }
    
}
