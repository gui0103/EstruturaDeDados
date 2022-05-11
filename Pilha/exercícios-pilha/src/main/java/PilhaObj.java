public class PilhaObj {

    private String[] pilha;
    private int topo;

    public PilhaObj(int capacidade) {
        pilha = new String[capacidade];
        topo = -1;
    }

    public Boolean isEmpty() {
        return topo == -1;
    }

    public Boolean isFull() {
        return topo == pilha.length - 1;
    }

    public void push(String info) {
        if (isFull()) {
            System.out.println("Pilha cheia!");
        } else {
            pilha[++topo] = info;
        }
    }

    public String pop() {
        if (isEmpty()) {
            return null;
        }
        return pilha[topo--];
    }

    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return pilha[topo];
    }

    public void exibe() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
        } else {
            for (int i = topo; i >= 0; i--) {
                System.out.println(pilha[i]);
            }
        }
    }
    
}
