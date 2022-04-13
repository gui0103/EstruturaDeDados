public class Filme {

    /*
    Crie um projeto chamado lista-filme.

    a) Crie uma classe chamada Filme.

    Esta classe terá os atributos idFilme (inteiro), nome (String), nota (double), genero (String),
    idade (inteiro), sendo que nota representa um valor de 0 a 10 atribuído pela crítica,
    e idade representa a idade mínima para assistir o filme. Os atributos devem ser encapsulados
    e a classe deve fornecer os getters e os setters.

    Implemente também o construtor que recebe os valores dos atributos e inicializa os atributos.

    Implemente o toString que exibe os valores dos atributos
    */
    private Integer idFilme;
    private String nome;
    private Double nota;
    private String genero;
    private Integer idade;

    public Filme(Integer idFilme, String nome, Double nota, String genero, Integer idade) {
        this.idFilme = idFilme;
        this.nome = nome;
        this.nota = nota;
        this.genero = genero;
        this.idade = idade;
    }

    public Integer getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(Integer idFilme) {
        this.idFilme = idFilme;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "\nFilme:" +
                "\nidFilme = " + idFilme +
                "\nnome = " + nome +
                "\nnota = " + nota +
                "\ngenero = " + genero +
                "\nidade = " + idade;
    }
}
