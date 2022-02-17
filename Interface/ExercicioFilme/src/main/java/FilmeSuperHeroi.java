public class FilmeSuperHeroi extends Filme{

    private String produtora;

    public FilmeSuperHeroi(String nome, Integer duracaoMinutos, Integer qntdPaisesDistribuido, String produtora) {
        super(nome, duracaoMinutos, qntdPaisesDistribuido);
        this.produtora = produtora;
    }

    @Override
    public Double getPrecoIngresso() {
        return ((super.getDuracaoMinutos() * 1.0) / (super.getQntdPaisesDistribuido() * 1.0)) * 10;
    }

    @Override
    public String toString() {
        return "\nFilmeSuperHeroi: " +
                "\nprodutora = " + produtora +
                super.toString() +
                "\npreço do ingresso = " + this.getPrecoIngresso();
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }
}
