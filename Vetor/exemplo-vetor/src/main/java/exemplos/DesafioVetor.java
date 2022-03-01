package exemplos;

import java.util.Scanner;

public class DesafioVetor {

    public static void main(String[] args) {

        Scanner leitorNumero = new Scanner(System.in);

        String[] vetorSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        Integer numeroDigitado = 1;

        do{
            System.out.println("\nDigite um número de 1 a 7:");
            numeroDigitado = leitorNumero.nextInt();

        }while (numeroDigitado <= 0 || numeroDigitado >= 8);

        System.out.println("\nO dia de número " + numeroDigitado + " é: " + vetorSemana[numeroDigitado - 1]);

    }
}
