package exercicios;

/*
Elaborar um programa que solicita que o usuário digite 10 valores inteiros
e armazene esses valores em um vetor.

Depois o programa deve solicitar que o usuário digite um número qualquer
e o programa deverá exibir quantas vezes esse número ocorre no vetor.

Exemplo:  considere os números 3  7  9  3  7  1  3  3  5  8
o número 7 ocorre 2 vezes
o número 3 ocorre 4 vezes
o número 2 não ocorre nenhuma vez.
 */

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        // ---------------------------------------------------------------

        Integer[] vetorNumeros = new Integer[10];

        Scanner leitorNumeros = new Scanner(System.in);

        // ---------------------------------------------------------------

        for (int i = 0; i < vetorNumeros.length; i++) {

            System.out.println("\nDigite um número inteiro: ");

            Integer numero = leitorNumeros.nextInt();

            vetorNumeros[i] = numero;
        }

        // ---------------------------------------------------------------

        System.out.println("\nDigite um número qualquer: ");

        Integer numeroEscolhido = leitorNumeros.nextInt();

        // ---------------------------------------------------------------

        String frase = "\nO número " + numeroEscolhido + " não ocorre nenhuma vez";

        String fraseAlternativa = "";

        Integer cont = 0;

        for (int i = 0; i < vetorNumeros.length; i++) {

            if(numeroEscolhido == vetorNumeros[i]){

                cont ++;
            }

            fraseAlternativa = "\nO número " + numeroEscolhido + " ocorre " + cont + " vezes";
        }

        if (cont > 0) {
            System.out.println(fraseAlternativa);
        }
        else {
            System.out.println(frase);
        }

        // ---------------------------------------------------------------
    }
}
