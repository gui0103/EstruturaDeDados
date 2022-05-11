public class Exercicio {

    public static Boolean ehPalindromo(int[] vetor) {
        Pilha pilha = new Pilha(vetor.length);

        // percorre o vetor, empilhando todos os elementos do vetor
        for (int i = 0; i < vetor.length; i++) {
            pilha.push(vetor[i]);
        }

        // percorre novamente o vetor, comparando cada elemento do vetor
        // com o pop da pilha; se algum for diferente, já retorna false
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != pilha.pop()) {
                return false;
            }
        }
        // se chegou aqui, é porque é palindromo
        return true;
    }

    public static Boolean ehPalindromoOtimizado(int[] vetor) {
        Pilha pilha = new Pilha(vetor.length/2);
        int i;

        // percorre o vetor, empilhando todos os elementos do vetor
        for ( i = 0; i < vetor.length/2; i++) {
            pilha.push(vetor[i]);
        }

        if (vetor.length % 2 != 0) {    // se o tam do vetor for ímpar
            i++;                        // incrementa i, para "pular" o elemento do meio
        }
        // percorre novamente o vetor, comparando cada elemento do vetor
        // com o pop da pilha; se algum for diferente, já retorna false
        for ( ; i < vetor.length; i++) {
            if (vetor[i] != pilha.pop()) {
                return false;
            }
        }
        // se chegou aqui, é porque é palindromo
        return true;
    }

    public static void converteParaBinario(int numero) {
        Pilha pilha = new Pilha((int) (Math.log(numero) / Math.log(2)) + 1);
        int numeroOriginal = numero;

        while (numero != 0) {
            pilha.push(numero % 2);
            numero /= 2;
        }

        System.out.print(numeroOriginal + " em binário é ");
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] vetor1 = {1, 3, 3, 1};
        int[] vetor2 = {10, 20, 30, 40};
        int[] vetor3 = {1, 2, 3, 2, 1};

        if (ehPalindromoOtimizado(vetor1)) {
            System.out.println("vetor1 é palíndromo");
        }
        else {
            System.out.println("vetor1 não é palíndromo");
        }

        if (ehPalindromoOtimizado(vetor2)) {
            System.out.println("vetor2 é palíndromo");
        }
        else {
            System.out.println("vetor2 não é palíndromo");
        }

        if (ehPalindromoOtimizado(vetor3)) {
            System.out.println("vetor3 é palíndromo");
        }
        else {
            System.out.println("vetor3 não é palíndromo");
        }

        converteParaBinario(12);
        converteParaBinario(1024);
        converteParaBinario(2040);

    }
}
