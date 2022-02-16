public class DVD extends Produto
{
    // Atributos
    String nome;
    String gravadora;

    // Construtor
    public DVD(Integer codigo, Double precoCusto, String nome, String gravadora)
    {
        super(codigo, precoCusto);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    // Métodos
    public Double getValorVenda()
    {
        return this.precoCusto * 0.20 + this.precoCusto;
    }

    // toString
    @Override
    public String toString()
    {
        return "DVD{" +
                "nome='" + nome + '\'' +
                ", gravadora='" + gravadora + '\'' +
                ", valor='" + this.getValorVenda() + '\'' +
                "} " + super.toString();
    }
}
