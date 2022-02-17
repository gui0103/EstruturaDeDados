public class FilmeComedia extends Filme{

    private String atorPrincipal;

    public FilmeComedia(String nome, Integer duracaoMinutos, Integer qntdPaisesDistribuido, String atorPrincipal) {
        super(nome, duracaoMinutos, qntdPaisesDistribuido);
        this.atorPrincipal = atorPrincipal;
    }

    @Override
    public Double getPrecoIngresso() {
        return ((super.getDuracaoMinutos() * 1.0) / (super.getQntdPaisesDistribuido() * 1.0)) * 8;
    }

    @Override
    public String toString() {
        return "\nFilmeComedia: " +
                "\natorPrincipal = " + atorPrincipal +
                super.toString() +
                "\npreço do ingresso = " + this.getPrecoIngresso();
    }

    public String getAtorPrincipal() {
        return atorPrincipal;
    }

    public void setAtorPrincipal(String atorPrincipal) {
        this.atorPrincipal = atorPrincipal;
    }
}
