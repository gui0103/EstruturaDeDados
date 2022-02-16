public class Livro extends Produto{

    private String autor;
    private String isbn;

    public Livro(String nome, Integer codigo, Double precoCusto, String autor, String isbn) {
        super(nome, codigo, precoCusto);
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public Double getValorVenda() {
        return (this.getPrecoCusto() * 0.10) + this.getPrecoCusto();
    }

    @Override
    public String toString() {
        return  "\nLivro: " +
                "\nautor = " + autor +
                "\nisbn = " + isbn +
                super.toString();
    }
}
