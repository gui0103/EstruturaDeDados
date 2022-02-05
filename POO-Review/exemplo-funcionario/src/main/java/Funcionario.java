public abstract class Funcionario {

    private String CPF;
    private String nome;

    public Funcionario(String CPF, String nome) {
        this.CPF = CPF;
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public abstract Double calcularSalario();

    @Override
    public String toString() {
        return  "\nCPF = " + CPF +
                "\nNome = " + nome ;
    }
}
