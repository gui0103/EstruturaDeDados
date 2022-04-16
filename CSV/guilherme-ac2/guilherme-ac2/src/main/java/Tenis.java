/*
a) Crie uma classe de tema livre, não podendo ser Aluno, nem Filme, nem Produto, nem Cachorro.
Se preferir, pode se basear nos temas sorteados dos exercícios da Sprint 1.
Ela deverá ter um atributo id (inteiro) e, além do id, pelo menos mais 5 atributos (no total, 6 atributos).
Pelo menos um desses atributos deverá ser String e pelo menos um desses deverá ser Double e deverá ter
pelo menos mais um inteiro além do id. Os atributos deverão estar encapsulados.

Implemente o construtor que inicializa os atributos, os setters e getters e o toString().

Os objetos dessa classe serão armazenados numa lista e os dados desses objetos serão gravados num arquivo CSV.

Os atributos devem fazer sentido dentro do contexto da classe escolhida.
 */
public class Tenis {

    private Integer idTenis;
    private String nome;
    private String marca;
    private Integer numeracao;
    private Integer anoLancamento;
    private Double preco;

    public Tenis(Integer idTenis, String nome, String marca, Integer numeracao, Integer anoLancamento, Double preco) {
        this.idTenis = idTenis;
        this.nome = nome;
        this.marca = marca;
        this.numeracao = numeracao;
        this.anoLancamento = anoLancamento;
        this.preco = preco;
    }

    public Integer getIdTenis() {
        return idTenis;
    }

    public void setIdTenis(Integer idTenis) {
        this.idTenis = idTenis;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(Integer numeracao) {
        this.numeracao = numeracao;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\nTênis: " +
                "\nID = " + idTenis +
                "\nNome = " + nome +
                "\nMarca = " + marca +
                "\nNumeração = " + numeracao +
                "\nAno de lançamento = " + anoLancamento +
                "\nPreco = " + preco;
    }
}
