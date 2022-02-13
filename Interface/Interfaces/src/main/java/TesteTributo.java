public class TesteTributo{

    public static void main(String[] args) {

        Alimento alimento1 = new Alimento(1724, "maçã", 1.20, 56);
        Perfume perfume1 = new Perfume(9572, "perfume masculino", 300.0, "212");
        Servico servico1 = new Servico("Professor de TI", 10000.0);
        Tributo tributo1 = new Tributo();

        tributo1.adicionaTributavel(alimento1);
        tributo1.adicionaTributavel(perfume1);
        tributo1.adicionaTributavel(servico1);

        System.out.println("\ntotal de tributos = " + tributo1.calculaTotalTributo());

        tributo1.exibeTodos();

    }
}
