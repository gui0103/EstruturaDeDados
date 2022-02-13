public class Servico implements Tributavel{

    private String descricao;
    private Double preco;

    public Servico(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public Double getValortributo() {
        return getPreco() * 0.12;
    }

    @Override
    public String toString() {
        return "\nServico: " +
                "\ndescricao = " + descricao +
                "\npreco = " + preco +
                "\ntributo = " + getValortributo();
    }
}
