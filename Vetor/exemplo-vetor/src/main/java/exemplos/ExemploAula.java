package exemplos;
import java.util.Scanner;

public class ExemploAula{

    public static void exibeVetor(int[] v) {
        for(int i=0; i < v.length; i++) {
            System.out.print("v[" + i + "]= " + v[i] + "\t");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        // Criação de um objeto leitor
        Scanner leitor = new Scanner(System.in);

        // Criação de um vetor de inteiros, de tamanho 5
        int[] vetor = new int[5];

        // Criando um 2o vetor, com lista de inicializadores
        // O vetor já "nasce" com os valores passados entre as chaves
        // Nesse caso, não é necessário usar o new
        int[] vet1 = {100, 200, 300, 400, 500, 600, 700};

        // Criando um 3o vetor, de Strings, de tamanho 4
        String[] vet2 = new String[4];

        // Criando um 4o vetor, de Strings, com os dias da semana
        String[] vet3 = {"Domingo", "Segunda", "Terça", "Quarta",
                "Quinta", "Sexta", "Sábado"};

        // Criando um 5o vetor de inteiros, sendo que o tamanho
        // desse vetor será digitado pelo usuário
        int[] vet4;

        int numDigitado;
        int soma = 0;
        int contadorPares = 0;
        int tamanho;

        // Loop para preencher os valores do vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 10;
        }

        // Exibe o vetor
        exibeVetor(vetor);

        // Exibe o vet1
        exibeVetor(vet1);

        // Solicita que o usuário digite os valores para preencher
        // o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor para vetor[" + i + "]:");
            vetor[i] = leitor.nextInt();
        }
        // Exibe o vetor
        exibeVetor(vetor);

        // Solicita que o usuário digite os valores para preencher
        // o vet2 de Strings
        for (int i = 0; i < vet2.length; i++) {
            System.out.println("Digite o valor para vet2[" + i + "]:");
            vet2[i] = leitor.next();
        }

        // Exibe o vetor vet2
        for (String nome : vet2) {
            System.out.print(nome + "\t");
        }
        System.out.println();

        // 1o desafio:
        // Criar um 4o vetor de Strings contendo os dias da semana:
        // "Domingo", "Segunda", "Terça", etc....
        // Ficar num loop até que o usuário digite um número entre 1 e 7
        // Exibir o dia da semana correspondente
        // Se o usuário digitar 1, exiba Domingo, e assim por diante
        do {
            System.out.println("Digite um número de 1 a 7");
            numDigitado = leitor.nextInt();
        } while (numDigitado < 1 || numDigitado > 7);

        System.out.println("O dia da semana correspondente é " +
                vet3[numDigitado - 1]);

        // 2o desafio: exibir a soma dos valores do vetor
        for (int num : vetor) {
            soma += num;
        }
        System.out.println("A soma dos elementos de vetor é " + soma);

        // 3o desafio: exibir a quantidade de números pares do vetor
        for (int num : vetor) {
            if (num % 2 == 0) {
                contadorPares++;
            }
        }
        System.out.println("A quantidade de pares de vetor é " + contadorPares);


        // Solicita que o usuário digite o tamanho do vetor vet4
        // Esse tamanho deve ser maior do que 3
        do {
            System.out.println("Digite um valor maior do que 3");
            tamanho = leitor.nextInt();
        } while (tamanho <= 3);

        // Cria o vetor vet4 com o tamanho digitado pelo usuário
        vet4 = new int[tamanho];

        // Solicita que o usuário digite os valores para preencher
        // o vetor vet4
        for (int i = 0; i < vet4.length; i++) {
            System.out.println("Digite o valor para vet4[" + i + "]:");
            vet4[i] = leitor.nextInt();
        }

        // Exibe o vetor
        exibeVetor(vet4);
    }


}
