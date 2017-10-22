package desenha.diamante;

import java.util.Scanner;

/**
 *
 * @author Danilo Loschiavo
 * 
 * Projeto destinado para fins educativos referente a tarefa ALPPN_PS_IND_11_Java- Parte 1-b.
 * Solicitar entrada de numeros maximo de caracteres para o desenho
 * enquanto desenha linha pula linha no final:
 * enquanto desenha caracter menor que n.
 * verifica menor valor de linha desenhada ou a linha atual para acrecenstar ou diminuir caracteres.
 */
public class DesenhaDiamante {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n = entrada.nextInt();
        
        for (int linha = 0; linha < n; linha++) {
            for (int desenhado = 0; desenhado < n; desenhado++) {
                int menor = (linha+1 < n-linha ? linha+1 : n-linha);
                if (desenhado <= n / 2 - menor-1 || desenhado >= n / 2 + menor-1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
    }
    
}
