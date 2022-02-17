public class Coordenador extends Professor{

    private Integer qntdHorasCoordSemana;
    private Double valorHoraCoord;

    public Coordenador(String nome, Double valorHoraAula, Integer qntdAulasSemana, Integer qntdHorasCoordSemana, Double valorHoraCoord) {
        super(nome, valorHoraAula, qntdAulasSemana);
        this.qntdHorasCoordSemana = qntdHorasCoordSemana;
        this.valorHoraCoord = valorHoraCoord;
    }

    @Override
    public Double getValorBonus() {

        return (super.getQntdAulasSemana() * super.getValorHoraAula() * 4.5 * 0.15) +
                (qntdHorasCoordSemana * valorHoraCoord * 4.5 * 0.2);
    }

    @Override
    public String toString() {
        return "\nCoordenador: " +
                "\nqntdHorasCoordSemana = " + qntdHorasCoordSemana +
                "\nvalorHoraCoord = " + valorHoraCoord +
                super.toString();
    }
}
