public class Filme {

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

    public String toString() {
        System.out.printf("%4s %-15s %-9s %4s %-4s\n","IDFILME","NOME","NOTA","GENERO","IDADE");
        return String.format("%4d %-15s %-9.2f %4s %4d", idFilme, nome, nota, genero, idade);
    }
}
