package exercicios;

/*
Escreva um programa que cria um vetor para armazenar 10 inteiros.
O programa deve solicitar que o usuário digite 10 números, que devem ser armazenados nesse vetor.
O programa deverá calcular a média dos números digitados e exibir a média.
Depois, deverá exibir os números que estão no vetor que estão acima da média.
 */

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        // ---------------------------------------------------------------

        Integer[] vetorInteiros = new Integer[10];

        Scanner leitorInteger = new Scanner(System.in);

        // ---------------------------------------------------------------

        for (int i = 0; i < vetorInteiros.length; i++) {

            System.out.println("\nDigite um número inteiro: ");
            Integer numeroLido = leitorInteger.nextInt();

            vetorInteiros[i] = numeroLido;
        }

        // ---------------------------------------------------------------

        Integer somador = 0;

        Double media = 0.0;

        for (int i = 0; i < vetorInteiros.length; i++) {

            somador += vetorInteiros[i];
        }

        media = (somador * 1.0) / vetorInteiros.length;

        System.out.println("\nA média dos números digitados é = " + media);

        for (int i = 0; i < vetorInteiros.length; i++) {

            if ((vetorInteiros[i] * 1.0) > media) {

                System.out.println("\nO número: " + vetorInteiros[i] + " está acima da média.\n" +
                        "Sua posição no vetor é: [" + i + "]\n");
            }
        }
    }
}
