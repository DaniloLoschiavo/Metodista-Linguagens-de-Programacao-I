package calcula.imc;

import java.util.Scanner;

/**
 *
 * @author Danilo Loschiavo
 * 
 * Projeto destinado para fins educativos referente a tarefa ALPPN_PS_IND_11_Java- Parte 1-a.
 * Solicita entrada de padrão de unidade de medida
 * Solicita entrada de altura em metros
 * Solicita entrada de peso em quilos
 * Imprime resultado e tabela imc
 */
public class CalculaIMCBMC {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        double altura;
        double peso;
        double imc;
        
        System.out.println("Bem vindo a calculadora de IMC, insira 'BR' para padrão Brasileiro.\n"
                + "Welcome to the BMC calculator, enter 'USA' to American standard.");
        String padrao = entrada.next();
        
        switch (padrao.toUpperCase()) {
            case "BR":
                System.out.println("Por favor insira a altura em metros.");
                altura = entrada.nextDouble();
                System.out.println("Muito bem, agora por favor insira o peso em quilos.");
                peso = entrada.nextDouble();
                imc = peso / (altura*altura);
                System.out.println("O IMC é: " + imc);
                System.out.println("Verifique a tabela:\n"
                        + "Abaixo de 18,5 você está abaixo do peso.\n"
                        + "De 18,5 até 24,9 seu peso é normal.\n"
                        + "De 25,0 até 29,9 você está acima do peso.\n"
                        + "Acima de 30 você está muito acima do peso.");
                break;
            case "USA":
                System.out.println("Please enter height in feets.");
                altura = entrada.nextDouble();
                System.out.println("Okay, now please insert the weight in pounds.");
                peso = entrada.nextDouble();
                imc = peso / (altura*altura);
                System.out.println("BMI is: " + imc);
                System.out.println("Check the table:\n"
                        + "Below 18.5 you are underweight.\n"
                        + "From 18.5 to 24.9 your weight is normal.\n"
                        + "From 25.0 to 29.9 you are overweight.\n"
                        + "Above 30 you are very overweight.");                        
                break;
            default:
                System.out.print("Padrão não reconhecido.\n"
                        + "Standard not recognized.");
                break;
        }
    }
    
}
