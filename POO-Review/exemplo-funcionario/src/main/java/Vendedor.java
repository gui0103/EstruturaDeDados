public class Vendedor extends Funcionario{

    private Double vendas;
    private Double taxa;

    public Vendedor(String CPF, String nome, Double vendas, Double taxa) {
        super(CPF, nome);
        this.vendas = vendas;
        this.taxa = taxa; // 10% = 0.1
        // Venda é o valor do produto, taxa é comissão
    }

    @Override
    public Double calcularSalario() {
        return vendas * taxa;
    }

    @Override
    public String toString() {
        return "\nVendedor" +
                "\nvendas = " + vendas +
                "\ntaxa = " + taxa +
                "\nsalário = " + this.calcularSalario() +
                super.toString();
    }
}
