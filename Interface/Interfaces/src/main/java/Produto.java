public abstract class Produto implements Tributavel{

    private Integer codigo;
    private String descricao;
    private Double preco;

    public Produto(Integer codigo, String descricao, Double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return  "\ncodigo = " + codigo +
                "\ndescricao = " + descricao +
                "\npreco = " + preco;
    }

    public Double getPreco() {
        return preco;
    }
}
