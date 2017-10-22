package calcula.imc;

import java.util.Scanner;

/**
 *
 * @author Danilo Loschiavo
 * 
 * Projeto destinado para fins educativos referente a tarefa ALPPN_PS_IND_11_Java- Parte 1-a.
 * Solicita entrada de altura em metros
 * Solicita entrada de peso em quilos
 * Imprime resultado e tabela imc
 */
public class CalculaIMC {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double altura;
        double peso;
        
        System.out.println("Bem vindo a calculadora de IMC\n"
                + "Por favor, insira a altura em metros.");
        altura = entrada.nextDouble();
        
        System.out.println("Muito bem, agora por favor insira o peso em quilos.");
        peso = entrada.nextDouble();
        
        double imc = peso / (altura*altura);
        
        System.out.println("O IMC é: " + imc);
        System.out.println("Verifique o enquadramento na tabela:\n"
                + "Abaixo de 18,5 você está abaixo do peso.\n"
                + "De 18,5 até 24,9 seu peso é normal.\n"
                + "De 25,0 até 29,9 você está acima do peso.\n"
                + "Acima de 30 seu peso é normal.");
    }
    
}
