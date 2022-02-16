public class Servico implements Vendavel
{
    // Atributos
    String descricao;
    Integer codigo;
    Integer quantHoras;
    Double valorHora;

    // Construtor
    public Servico(String descricao, Integer codigo, Integer quantHoras, Double valorHora)
    {
        this.descricao = descricao;
        this.codigo = codigo;
        this.quantHoras = quantHoras;
        this.valorHora = valorHora;
    }

    // Getters and Setters

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public Integer getCodigo()
    {
        return codigo;
    }

    public void setCodigo(Integer codigo)
    {
        this.codigo = codigo;
    }

    public Integer getQuantHoras()
    {
        return quantHoras;
    }

    public void setQuantHoras(Integer quantHoras)
    {
        this.quantHoras = quantHoras;
    }

    public Double getValorHora()
    {
        return valorHora;
    }

    public void setValorHora(Double valorHora)
    {
        this.valorHora = valorHora;
    }

    // Métodos
    public Double getValorVenda()
    {
        return this.valorHora * this.quantHoras;
    }

    // toString
    @Override
    public String toString()
    {
        return "Servico{" +
                "descricao='" + descricao + '\'' +
                ", codigo=" + codigo +
                ", quantHoras=" + quantHoras +
                ", valorHora=" + valorHora +
                ", valor='" + this.getValorVenda() + '\'' +
                '}';
    }
}
