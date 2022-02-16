public class Produto implements Vendavel
{
    // Atributos
    Integer codigo;
    Double precoCusto;

    // Construtor
    public Produto(Integer codigo, Double precoCusto)
    {
        this.codigo = codigo;
        this.precoCusto = precoCusto;
    }

    // Getters and Setters
    public Integer getCodigo()
    {
        return codigo;
    }

    public void setCodigo(Integer codigo)
    {
        this.codigo = codigo;
    }

    public Double getPrecoCusto()
    {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto)
    {
        this.precoCusto = precoCusto;
    }

    // toString
    @Override
    public String toString()
    {
        return "Produto{" +
                "codigo=" + codigo +
                ", precoCusto=" + precoCusto +
                '}';
    }

    // Métodos
    public Double getValorVenda()
    {
        return null;
    }
}
