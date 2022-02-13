public class Alimento extends Produto{

    private Integer qntdCalorias;

    public Alimento(Integer codigo, String descricao, Double preco, Integer qntdCalorias) {
        super(codigo, descricao, preco);
        this.qntdCalorias = qntdCalorias;
    }

    @Override
    public Double getValortributo() {
        return getPreco() * 0.15;
    }

    @Override
    public String toString() {
        return "\nAlimento: " +
                "\nqntdCalorias = " + qntdCalorias +
                "\ntributo = " + getValortributo() +
                 super.toString();
    }
}
