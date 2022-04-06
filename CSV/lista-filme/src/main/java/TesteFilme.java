import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TesteFilme {
    public static void gravaArquivoCsv(ListaObj<Filme> lista, String nomeArq) {
        FileWriter arq = null; // arq é o objeto que corresponde ao arquivo
        Formatter saida = null; // obj que sera usado para escrever no arquivo
        nomeArq += ".csv";
        Boolean deuRuim = false;

        // Bloco try catch para abrir no arquivo
        try {
            arq = new FileWriter(nomeArq); // colocar o ',true' pós nomeArq para acresentar + 1
            saida = new Formatter(arq);
        }
        catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo");
            System.exit(1);
        }

        // Bloco try catch para gravar no arquivo
        try {
            // Percorro a lista de alunos
            for (int i = 0; i < lista.getTamanho(); i++) {
                Filme filme = lista.getElemento(i);
                saida.format("%d;%s;%d;%s,%d\n",
                        filme.getIdFilme(), filme.getNome(), filme.getNota(), filme.getGenero(), filme.getIdade()); // uma linha do arquivo
            }
        }
        catch (FormatterClosedException erro) {
            System.out.println("Erro ao gravar o arquivo!");
            deuRuim = true;
        }
        finally {
            saida.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo!");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void leExibeArquivoCsv (String nomeArq){
        FileReader arq = null;
        Scanner entrada = null;
        nomeArq += ".csv";
        Boolean deuRuim = false;

        //Bloco try catch para abrir o arquivo
        try {
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        }
        catch (FileNotFoundException erro) {
            System.out.println("Arquivo não encontrado");
            System.exit(1);
        }

        // Bloco try catch para ler o arquivo
        try {
            System.out.printf("%4s %-15s %-9s %4s %-4s\n","IDFILME","NOME","NOTA","GENERO","IDADE");
            while (entrada.hasNext()) {
                Integer idFilme = entrada.nextInt();
                String nome = entrada.next();
                String nota = entrada.next();
                String genero = entrada.next();
                Integer idade = entrada.nextInt();
                System.out.printf("%4d %-15s %-9.2f %4s %4d", idFilme, nome, nota, genero, idade);
            }
        }
        catch (NoSuchElementException erro) {
            System.out.println("Arquivo com problemas");
            deuRuim = true;
        }
        catch (IllegalStateException erro) {
            System.out.println("Erro na leitura do arquivo");
            deuRuim = true;
        }
        finally {
            entrada.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo!");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }
    public static void main(String[] args) {
            Boolean fim = false;
            ListaObj<Filme> lista = new ListaObj<>(10);

            while (!fim) {
                Integer idFilme;
                String nome;
                Double nota;
                String genero;
                Integer idade;
                String nomeArq;
                Scanner leitor = new Scanner(System.in);
                Scanner leitorNL = new Scanner(System.in);
                Integer opcao;
                int indice;

                System.out.println("\n1. adicionar um filme," +
                        "\n2. Exibir a lista," +
                        "\n3. Gravar a lista num arquivo CSV," +
                        "\n4. Ler e exibir um arquivo CSV," +
                        "\n5. Gravar em outro arquivo CSV apenas filmes que estão na lista, mas de um determinado gênero," +
                        "\n6. Sair,\n");
                opcao = leitor.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o id do filme:");
                        idFilme = leitor.nextInt();

                        System.out.println("Digite o nome do filme:");
                        nome = leitorNL.nextLine();

                        System.out.println("Digite a nota do filme:");
                        nota = leitor.nextDouble();

                        System.out.println("Digite o genero do filme:");
                        genero = leitorNL.nextLine();

                        System.out.println("Digite a idade para assistir o filme:");
                        idade = leitor.nextInt();

                        lista.adiciona(new Filme(idFilme, nome, nota, genero, idade));
                        break;

                    case 2:
                        lista.exibe();
                        break;

                    case 3:
                        gravaArquivoCsv(lista, "filmes");
                        break;

                    case 4:
                        leExibeArquivoCsv("filmes");
                        break;

                    case 5:
                        // Falta coisa ainda não consegui terminar
                        if (lista == null) {
                            System.out.println("\nLista está vazia. Não há nada a gravar");
                        }
                        else {
                            System.out.println("Digite o nome do arquivo a ser gravado");
                            nomeArq = leitorNL.nextLine();
                            gravaArquivoCsv(lista, nomeArq);
                        }
                        break;

                    case 6:
                        fim = true;
                        break;

                    default:
                        System.out.println("Digite um valor válido!");
                }
            }
    }
}
