public abstract class Filme{

    private String nome;
    private Integer duracaoMinutos;
    private Integer qntdPaisesDistribuido;

    public Filme(String nome, Integer duracaoMinutos, Integer qntdPaisesDistribuido) {
        this.nome = nome;
        this.duracaoMinutos = duracaoMinutos;
        this.qntdPaisesDistribuido = qntdPaisesDistribuido;
    }

    public abstract Double getPrecoIngresso();

    @Override
    public String toString() {
        return  "\nnome = " + nome +
                "\nduracaoMinutos = " + duracaoMinutos +
                "\nqntdPaisesDistribuido = " + qntdPaisesDistribuido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(Integer duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public Integer getQntdPaisesDistribuido() {
        return qntdPaisesDistribuido;
    }

    public void setQntdPaisesDistribuido(Integer qntdPaisesDistribuido) {
        this.qntdPaisesDistribuido = qntdPaisesDistribuido;
    }
}
