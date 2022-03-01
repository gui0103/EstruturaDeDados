package exercicios;

/*
Escreva um programa que cria um vetor para armazenar 10 Strings.

O programa deve solicitar que o usuário digite 10 nomes, que devem ser armazenados nesse vetor.

Depois, o programa deve pedir que se digite um nome qualquer.

O programa deverá pesquisar se esse nome está no vetor.

Se estiver, deve exibir a mensagem: “Nome encontrado no índice x”,
sendo x o índice do nome no vetor, senão deve exibir uma mensagem de “Nome não encontrado”.
 */

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        // ---------------------------------------------------------------

        String[] vetorNomes = new String[10];

        Scanner leitorNomes = new Scanner(System.in);

        // ---------------------------------------------------------------

        for (int i = 0; i < vetorNomes.length; i++) {

            System.out.println("\nDigite um nome: ");

            String nomeLido = leitorNomes.nextLine();

            vetorNomes[i] = nomeLido;
        }

        // ---------------------------------------------------------------

        System.out.println("\nDigite um nome qualquer: ");

        String nomeEscolhido = leitorNomes.nextLine();

        // ---------------------------------------------------------------

        String frase = "\nNome não encontrado";

        for (int i = 0; i < vetorNomes.length; i++) {

            if(nomeEscolhido.equals(vetorNomes[i])){

                frase = "\nNome encontrado no índice: " + i;
            }
        }

        System.out.println(frase);

        // ---------------------------------------------------------------
    }
}
