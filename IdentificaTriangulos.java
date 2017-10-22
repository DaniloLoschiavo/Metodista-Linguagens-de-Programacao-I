package identifica.triangulos;

import java.util.Scanner;

/**
 *
  * @author Danilo Loschiavo
 * 
 * Projeto destinado para fins educativos referente a tarefa ALPPN_PS_IND_11_Java- Parte 1-a.
 * Solicitar vertices do triângulo dadas por A, B e C.
 * Verificar se as entradas formam um triângulo sendo: < (A < B + C && B < A + C && C < A + B) />.
 * Identificar tipo do triangulo isósceles, escaleno ou equilátero.
  * equilátero: todos lados iguais < (A == B && B == C) />
 * isóceles: dois lados iguais < (A == B || A == C || B == C)/>
 * escaleno: todos os lados diferentes < (A != B && A != C && B != C) />
 */
public class IdentificaTriangulos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A, B, C;
        
        System.out.println("Olá, por favor entrar com as medidas para análisar o triângulo.");
        System.out.println("Medida de A:");
        A = entrada.nextDouble();
        System.out.println("Medida de B:");
        B = entrada.nextDouble();
        System.out.println("Medida de C:");
        C = entrada.nextDouble();
        
        if(A < B + C && B < A + C && C < A + B){
            if(A == B && B == C){
                System.out.println("Você informou as medidas de um triângulo equilátero, "
                        + "pois todos os lados são iguais."); 
            }else if(A == B || A == C || B == C){
                System.out.println("Você informou as medidas de um triângulo isóceles, "
                        + "pois possui dois lados iguais.");               
            }else{
                System.out.println("Você informou as medidas de um triângulo escaleno, "
                        + "pois todos os lados são diferentes.");
            }
        
        }else{
            System.out.println("As medidas informadas não formam um triângulo.");
        }
    }
    
}
