public class Produto implements Vendavel{

    private String nome;
    private Integer codigo;
    private Double precoCusto;

    public Produto(String nome, Integer codigo, Double precoCusto) {
        this.nome = nome;
        this.codigo = codigo;
        this.precoCusto = precoCusto;
    }

    public Double getValorVenda() {

        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    @Override
    public String toString() {
        return  "\nnome = " + nome +
                "\ncodigo = " + codigo +
                "\nprecoCusto = " + precoCusto +
                "\nValor de venda = " + this.getValorVenda();
    }

}
