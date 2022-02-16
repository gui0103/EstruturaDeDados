public class DVD extends Produto{

    private String gravadora;

    public DVD(String nome, Integer codigo, Double precoCusto, String gravadora) {
        super(nome, codigo, precoCusto);
        this.gravadora = gravadora;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    @Override
    public Double getValorVenda() {
        return (this.getPrecoCusto() * 0.20) + this.getPrecoCusto();
    }

    @Override
    public String toString() {
        return "\nDVD: " +
                "\ngravadora = " + gravadora +
                super.toString();
    }
}
