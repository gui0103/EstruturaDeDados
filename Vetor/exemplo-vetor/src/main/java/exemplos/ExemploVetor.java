package exemplos;

import java.util.Scanner;

public class ExemploVetor {

    // não precisa de return Integer[], pois ele altera o vetor diretamente
    // usar static para não ser necessário criar um objeto na instância
    public static void exibeVetor(Integer[] vetorPassado) {

        for (int i = 0; i < vetorPassado.length; i++) {

            //"print" em vez de "printIn" para ficar na mesma linha
            System.out.print("v[" + i + "] = " + vetorPassado[i] + "\t");
        }

        System.out.println();
    }

    public static void exibeVetorString(String[] vetorPassado) {

        System.out.println("\n\n");

        for (int i = 0; i < vetorPassado.length; i++) {

            //"print" em vez de "printIn" para ficar na mesma linha
            System.out.print("v[" + i + "] = " + vetorPassado[i] + "\t");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        //criando leitor
        Scanner leitor = new Scanner(System.in);

        Scanner leitorString = new Scanner(System.in);

        //criando vetor (de Inteiros)
        Integer[] vetor = new Integer[10];

        //criando um vetor (de String)
        String[] vetorString = new String[5];

        //criando vetor com lista de inicializadores, não é necessário usar o "new"
        Integer[] vetorComValoresDentro = {100, 200, 300, 400, 500};

        //solicita que o usuário insira os valores no vetor
        for (int i = 0; i < vetor.length; i++) {

            System.out.println("Digite o valor para o vetor [" + i + "]: ");

            Integer valor = leitor.nextInt();

            vetor[i] = valor;
        }

        for (int i = 0; i < vetorString.length; i++) {

            System.out.println("Digite o valor para o vetor String [" + i + "]: ");

            String valor = leitorString.nextLine();

            vetorString[i] = valor;
        }

        exibeVetor(vetor);

        exibeVetorString(vetorString);

    }
}
