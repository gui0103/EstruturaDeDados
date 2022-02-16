public class Servico implements Vendavel{

    private String descricao;
    private Integer codigo;
    private Integer qntdHoras;
    private Double valorHora;

    public Servico(String descricao, Integer codigo, Integer qntdHoras, Double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.qntdHoras = qntdHoras;
        this.valorHora = valorHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getQntdHoras() {
        return qntdHoras;
    }

    public void setQntdHoras(Integer qntdHoras) {
        this.qntdHoras = qntdHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorVenda() {
        return this.getQntdHoras() * this.getValorHora();
    }

    @Override
    public String toString() {
        return "\nServico: " +
                "\ndescricao = " + descricao +
                "\ncodigo = " + codigo +
                "\nqntdHoras = " + qntdHoras +
                "\nvalorHora = " + valorHora +
                "\nValor de venda = " + this.getValorVenda();
    }
}
