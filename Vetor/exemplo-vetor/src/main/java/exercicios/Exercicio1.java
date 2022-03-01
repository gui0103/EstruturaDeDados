package exercicios;

/*
Escreva um programa que leia 7 números e armazene-os em um vetor.
Depois, o programa deve percorrer o vetor exibindo os números na ordem em que foram inseridos.
E depois, deve percorrer o vetor de trás para frente,
exibindo os números na ordem inversa em que foram inseridos (dica: utilize o for ao contrário).
 */

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        // ---------------------------------------------------------------

        Integer[] vetorNumeros = new Integer[7];

        Scanner leitorInteger = new Scanner(System.in);

        // ---------------------------------------------------------------

        for (int i = 0; i < vetorNumeros.length; i++) {

            System.out.println("\nDigite um número inteiro: ");
            Integer numeroLido = leitorInteger.nextInt();

            vetorNumeros[i] = numeroLido;
        }

        // ---------------------------------------------------------------

        System.out.println("\n");

        for (int i = 0; i < vetorNumeros.length; i++) {

            System.out.print("v[" + i + "] = " + vetorNumeros[i] + "\t");
        }

        System.out.println();

        // ---------------------------------------------------------------

        System.out.println("\n");

        for (int i = 6; i >= 0; i--) {

            System.out.print("v[" + i + "] = " + vetorNumeros[i] + "\t");
        }

        System.out.println();

    }
}
