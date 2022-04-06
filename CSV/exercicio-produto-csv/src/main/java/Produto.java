public class Produto {

    private Integer codProduto;
    private String nome;
    private Double preco;
    private String avaliacao;
    private Integer qntdVendida;

    public Produto(Integer codProduto, String nome, Double preco, String avaliacao) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.preco = preco;
        this.avaliacao = avaliacao;
        this.qntdVendida = 0;
    }

    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Integer getQntdVendida() {
        return qntdVendida;
    }

    public void setQntdVendida(Integer qntdVendida) {
        this.qntdVendida = qntdVendida;
    }

    public void comprar(int novaQuantidade){
        this.qntdVendida += novaQuantidade;
    }

    public Double calcularFaturamento(){
        return (double) this.qntdVendida * this.preco;
    }

    @Override
    public String toString() {
        return String.format
                ("%06d %-14s %7.2f %7s %14.3f", codProduto, nome, preco, avaliacao, calcularFaturamento());
    }
}

