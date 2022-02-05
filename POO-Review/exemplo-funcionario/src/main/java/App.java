public class App {

    public static void main(String[] args) {

        Engenheiro funcionarioEngenheiro = new Engenheiro("59902377839", "Paulo", 5000.00);

        Vendedor funcionarioVendedor = new Vendedor("489308438024", "Flávio", 20000.00, 0.1);

        Horista funcionarioHorista = new Horista("47780357382", "Pedro", 200, 35.00);

        Empresa empresa1 = new Empresa();

        empresa1.adicionaFuncionario(funcionarioEngenheiro);
        empresa1.adicionaFuncionario(funcionarioVendedor);
        empresa1.adicionaFuncionario(funcionarioHorista);

        empresa1.mostraFuncionario();

        empresa1.exibeTotalSalarios();

        empresa1.exibeHorista();

        System.out.println(funcionarioEngenheiro);
        System.out.println(funcionarioVendedor);
        System.out.println(funcionarioHorista);
    }
}
