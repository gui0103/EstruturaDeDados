public class App {

    public static void main(String[] args) {

        FilmeSuperHeroi filme1 = new FilmeSuperHeroi
                ("Deadpool", 135, 70, "Marvel/ Fox");

        FilmeComedia filme2 = new FilmeComedia
                ("A Proposta", 110, 60, "Ryan Reynolds");

        Cinema cinema1 = new Cinema();

        cinema1.addFilme(filme1);

        cinema1.addFilme(filme2);

        cinema1.exibeTodos();

        cinema1.calculaTotalPrecoIngressos();
    }
}
