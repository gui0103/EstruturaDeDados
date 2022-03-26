public class ExemploSiadaFormatada {

    public static void main(String[] args) {

        String nome1 = "Gui";
        String nome2 = "Celia";
        int ra1 = 50000;
        int ra2 = 50001;
        double nota1 = 9.2;
        double nota2 = 7.4;

        System.out.printf("----------------------------------------------\n");

        System.out.printf("%-7s %-14s %5s\n", "RA", "NOME", "NOTA");

        System.out.printf("%07d %-14s %5.2f\n", ra1, nome1, nota1);
        System.out.printf("%07d %-14s %5.2f\n", ra2, nome2, nota2);
    }
}
