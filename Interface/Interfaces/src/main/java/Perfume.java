public class Perfume extends Produto{

    private String fragrancia;

    public Perfume(Integer codigo, String descricao, Double preco, String fragrancia) {
        super(codigo, descricao, preco);
        this.fragrancia = fragrancia;
    }

    @Override
    public Double getValortributo() {
        return getPreco() * 0.27;
    }

    @Override
    public String toString() {
        return "\nPerfume: " +
                "\nfragrancia = " + fragrancia +
                "\ntributo = " + getValortributo() +
                super.toString();
    }
}
