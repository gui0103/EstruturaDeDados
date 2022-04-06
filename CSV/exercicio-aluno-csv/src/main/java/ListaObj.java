public class ListaObj<Aluno> {

    private Aluno[] vetor;
    private int nroElem;

    public ListaObj(int tamanho) {
        vetor = (Aluno[]) new Object[tamanho];
        nroElem = 0;
    }

    public void adiciona(Aluno elemento) {
        if (nroElem >= vetor.length) {
            System.out.println("Lista está cheia");
        }
        else {
            vetor[nroElem++] = elemento;
        }
    }

    public void exibe() {
        if (nroElem == 0) {
            System.out.println("\nA lista está vazia.");
        }
        else {

            for (int i = 0; i < nroElem; i++) {
                System.out.println(vetor[i]);
            }
            System.out.println();
        }
    }

    public int busca(Aluno elementoBuscado) {
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i].equals(elementoBuscado)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removePeloIndice (int indice) {
        if (indice < 0 || indice >= nroElem) {
            System.out.println("\nÍndice inválido!");
            return false;
        }

        for (int i = indice; i < nroElem - 1; i++) {
            vetor[i] = vetor[i+1];
        }
        nroElem--;
        return true;
    }

    public boolean removeElemento(Aluno elementoARemover) {
        return removePeloIndice(busca(elementoARemover));
    }

    public int getTamanho() {
        return nroElem;
    }

    public Aluno getElemento(int indice) {
        if(indice < 0 || indice >= nroElem){
            return null;
        }

        return vetor[indice];
    }
    
    public void limpa() {
        nroElem = 0;
    }

}
