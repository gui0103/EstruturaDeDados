import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TesteArquivoTxt {

    public static void gravaRegistro(String registro, String nomeArq) {

        BufferedWriter saida = null;

        try {
            saida = new BufferedWriter(new FileWriter(nomeArq, true));
        }
        catch (IOException erro) {
            System.out.println("Erro na abertura do arquivo: " + erro);
        }

        try {
            saida.append(registro + "\n");
            saida.close();
        }
        catch (IOException erro) {
            System.out.println("Erro na gravaçâo do arquivo: " + erro);
        }
    }

    public static void gravaArquivoTxt(List<Aluno> lista, String nomeArq) {

        int contaRegistroCorpo = 0;

        String header = "00NOTA20221";
        header += LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        header += 01;

        gravaRegistro(header, nomeArq);

        String corpo;
        for (Aluno aluno : lista) {
            corpo = "02";
            corpo += String.format("%-5.5s", aluno.getCurso());
            corpo += String.format("%-8.8s", aluno.getRa());
            corpo += String.format("%-50.50s", aluno.getNome());
            corpo += String.format("%-40.40s", aluno.getDisciplina());
            corpo += String.format("%05.2f", aluno.getMedia());
            corpo += String.format("%03d", aluno.getQtdFaltas());
            gravaRegistro(corpo, nomeArq);
            contaRegistroCorpo++;
        }

        String trailer = "01";
        trailer += String.format("%010d", contaRegistroCorpo);
        gravaRegistro(trailer, nomeArq);
    }

    public static void leArquivoTxt(String nomeArq) {

        BufferedReader entrada = null;

        String registro, tipoRegistro;
        String ra, curso, nome, disciplina;
        Double media;
        Integer qtdFaltas;
        int contaRegDadoLido = 0;
        Integer qtdRegDadoGravado;

        List<Aluno> listaLida = new ArrayList<>();

        try {
            entrada = new BufferedReader(new FileReader(nomeArq));
        }
        catch (IOException erro) {
            System.out.println("Erro na abertura do arquivo: " + erro);
        }

        try {
            registro = entrada.readLine();

            while (registro != null) {

                tipoRegistro = registro.substring(0,2);

                if (tipoRegistro.equals("00")) {
                    System.out.println("É um registro de header");
                    System.out.println("Tipo do arquivo: " + registro.substring(2,6));
                    System.out.println("Ano e semestre: " + registro.substring(6,11));
                    System.out.println("Data e hora de gravação: " + registro.substring(11,30));
                    System.out.println("Versão do documento de layout: " + registro.substring(30,31));
                }
                else if (tipoRegistro.equals("01")) {

                    System.out.println("É um registro de trailer");

                    qtdRegDadoGravado = Integer.valueOf(registro.substring(2,12));

                    if (contaRegDadoLido == qtdRegDadoGravado) {
                        System.out.println("Quantidade de registros lidos compatível " +
                                "com a quantidade de registros gravados");
                    }
                }
                else if (tipoRegistro.equals("02")) {
                    System.out.println("É um registro de corpo");
                    curso = registro.substring(2,7).trim();
                    ra = registro.substring(7,15).trim();
                    nome = registro.substring(15,65).trim();
                    disciplina = registro.substring(65,105).trim();
                    media = Double.valueOf(registro.substring(105,110).replace(',','.'));
                    qtdFaltas = Integer.valueOf(registro.substring(110,113));
                    contaRegDadoLido++;

                    listaLida.add(new Aluno(ra,nome,curso,disciplina,media,qtdFaltas));
                }
                else {
                    System.out.println("Tipo de registro inválido");
                }
                registro = entrada.readLine();
            }
            entrada.close();
        }
        catch (IOException erro) {
            System.out.println("Erro ao ler");
        }
    }

    public static void main(String[] args) {

        List<Aluno> lista = new ArrayList<>();

        lista.add(new Aluno("01211050", "Gui", "ADS", "Estrutura de Dados", 9.0, 5));
        lista.add(new Aluno("01211050", "Gui", "ADS", "Progrmação Web", 8.5, 5));
        lista.add(new Aluno("01211048", "Flavio", "ADS", "Progrmação Web", 8.5, 0));
        lista.add(new Aluno("01211048", "Flavio", "ADS", "Estrutura de Dados", 9.0, 0));

        for (Aluno aluno : lista) {
            System.out.println(aluno.toString());
        }

        gravaArquivoTxt(lista, "alunos.txt");

        leArquivoTxt("alunos.txt");
    }
}
