public class Teste {

    public static void main(String[] args) {
        int indRetornado;

        ListaEstatica listaEstatica = new ListaEstatica(5);

        listaEstatica.exibe();

        listaEstatica.adiciona(5);
        listaEstatica.adiciona(10);
        listaEstatica.adiciona(15);

        listaEstatica.exibe();

        listaEstatica.adiciona(20);
        listaEstatica.adiciona(25);
        System.out.println("\nTentando adicionar o sexto elemento");
        listaEstatica.adiciona(30);

        listaEstatica.exibe();

        System.out.println("\nBuscando o elemento 5");
        indRetornado = listaEstatica.busca(5);
        if (indRetornado == -1) {
            System.out.println("\nElemento 5 não foi encontrado");
        }
        else {
            System.out.println("\nElemento 5 encontrado no índice " + indRetornado);
        }

        System.out.println("\nBuscando o elemento 20");
        indRetornado = listaEstatica.busca(20);
        if (indRetornado == -1) {
            System.out.println("\nElemento 20 não foi encontrado");
        }
        else {
            System.out.println("\nElemento 20 encontrado no índice " + indRetornado);
        }

        System.out.println("\nRemovendo o elemento do índice 2");
        if (listaEstatica.removePeloIndice(2)) {
            System.out.println("\nRemovido elemento do índice 2");
        }
        else {
            System.out.println("Remoção inválida");
        }

        listaEstatica.exibe();

        System.out.println("\nRemovendo o elemento do índice 0");
        if (listaEstatica.removePeloIndice(0)) {
            System.out.println("\nRemovido elemento do índice 0");
        }
        else {
            System.out.println("Remoção inválida");
        }

        listaEstatica.exibe();

        System.out.println("\nRemovendo o elemento do índice 10");
        if (listaEstatica.removePeloIndice(10)) {
            System.out.println("\nRemovido elemento do índice 10");
        }
        else {
            System.out.println("\nRemoção inválida");
        }

        listaEstatica.exibe();

        System.out.println("\nRemovendo o elemento 5");
        if (listaEstatica.removeElemento(5)) {
            System.out.println("\nRemovido elemento 5");
        }
        else {
            System.out.println("\nRemoção inválida");
        }

        listaEstatica.exibe();

        System.out.println("\nRemovendo o elemento 25");
        if (listaEstatica.removeElemento(25)) {
            System.out.println("\nRemovido elemento 25");
        }
        else {
            System.out.println("\nRemoção inválida");
        }

        listaEstatica.exibe();

        listaEstatica.subistitui(30, 50);

        listaEstatica.exibe();

        listaEstatica.subistitui(20, 80);

        listaEstatica.exibe();

        System.out.println("\nNumero de vezes que o numero escolhido aparece na lista: ");
        System.out.println( listaEstatica.contaOcorrenciaas(25));

        listaEstatica.adicionaInicio(172);

        listaEstatica.exibe();

        listaEstatica.adicionaInicio(4);

        listaEstatica.exibe();

        listaEstatica.adicionaInicio(54);

        listaEstatica.exibe();

        listaEstatica.adicionaInicio(10);


    }



}
