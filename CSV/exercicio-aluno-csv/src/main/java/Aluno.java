public class Aluno {

    private Integer ra;
    private String nome;
    private Double nota;

    public Aluno(Integer ra, String nome, Double nota) {
        this.ra = ra;
        this.nome = nome;
        this.nota = nota;
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
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

    @Override
    public String toString() {
        System.out.printf("%-7s %-14s %7s\n","RA","NOME","NOTA");
        return String.format("%06d %-14s %7.2f", ra, nome, nota);
    }
}
