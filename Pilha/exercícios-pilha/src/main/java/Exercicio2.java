public class Exercicio2 {

    public static void converteBinario(int numero) {

        Pilha pilha = new Pilha((int) (Math.log(numero)/Math.log(2)) +1);
        int numeroOriginal = numero;

        while (numero != 0) {
            pilha.push(numero % 2);
            numero /= 2;
        }
        System.out.print(numeroOriginal + " em binario é ");
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        converteBinario( 32);
        converteBinario( 1024);
        converteBinario( 2040);
    }
}
