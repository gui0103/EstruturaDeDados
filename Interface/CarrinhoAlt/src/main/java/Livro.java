public class Livro extends Produto
{
    // Atributos
    String nome;
    String autor;
    String ibsn;

    // Construtor
    public Livro(Integer codigo, Double precoCusto, String nome, String autor, String ibsn)
    {
        super(codigo, precoCusto);
        this.nome = nome;
        this.autor = autor;
        this.ibsn = ibsn;
    }

    // Métodos
    public Double getValorVenda()
    {
        return this.precoCusto * 0.10 + this.precoCusto;
    }

    // toString

    @Override
    public String toString()
    {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", ibsn='" + ibsn + '\'' +
                ", valor='" + this.getValorVenda() + '\'' +
                "} " + super.toString();
    }
}
