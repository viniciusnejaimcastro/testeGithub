/**
 * Imprima o resultado da soma de dois inteiros informados pelo usuario, utilizando o seguinte formato "O resultado é: x"
 * Conclua a Atividade enviado a mesma para o github utilizando o terminal.
 */
import java.util.Scanner;

public class FirstProgram {
    
    public static Scanner ler = new Scanner(System.in);
       
    public static void main(String[] args) {
        
        // Declaração de variáveis
        int valorUm, valorDois;
        
        // Entrada do valor da variavel 1
        System.out.print("Escreva o primeiro valor: ");
        valorUm = ler.nextInt();
        
        // Entrada do valor da variavel 2
        System.out.print("Escreva o segundo valor: ");
        valorDois = ler.nextInt();

        // Calculo de valores e saida do resultado
        int somaValores = valorUm + valorDois;
        System.out.println("O resulado é: " + somaValores);
    }
}