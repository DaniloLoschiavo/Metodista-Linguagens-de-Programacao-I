package pontua;

import java.util.Scanner;
/**
 *
 * @author Danilo Loschiavo
 * 
 * Projeto destinado para fins educativos referente a tarefa ALPPN_PS_IND_11_Java- Parte 1-a.
 * Solicitar entrada da pontuação de 0 a 3.
 * caso pontuação 3: “Perfeito!”
 * caso pontuação 2: “Progresso aceitável!”
 * caso pontuação 1: “Progresso insatisfatório!”
 * caso pontuação 0: “Você está tentando?”
 * default: “Essa pontuação não existe.”
 */
public class Pontua {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Olá, por favor insira a pontuação de 0 a 3.");
        
        int pontuacao = entrada.nextInt();
        
        switch(pontuacao){
            case 3:
                System.out.println("Perfeito!");
                break;
            case 2:
                System.out.println("Progresso aceitável!");
                break;
            case 1:
                System.out.println("Progresso insatisfatório!");
                break;
            case 0:
                System.out.println("Você está tentando?");
                break;
            default:
                System.out.println("Essa pontuação não existe.");
                break;
        }
        
    }
    
}
