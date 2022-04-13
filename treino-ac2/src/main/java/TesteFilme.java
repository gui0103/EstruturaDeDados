import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

// c) Crie uma classe chamada TesteFilme. Configure para que essa classe tenha o método main.
public class TesteFilme {

    public static void gravaArquivoCsv(ListaObj<Filme> lista, String nomeArq) {
        FileWriter arq = null; // arq é o objeto que corresponde ao arquivo
        Formatter saida = null; // obj que será usado para escrever no arquivo
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

            // Percorro a lista de filmes
            for (int i = 0; i < lista.getTamanho(); i++) {

                Filme filme = lista.getElemento(i);

                saida.format("%d;%s;%.2f;%s;%d\n",
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
            System.out.printf("%d %-s %-.2f %-s %-d\n", "CODIGO", "NOME", "NOTA", "GENERO", "IDADE");
            while (entrada.hasNext()) {
                Integer IdFilme = entrada.nextInt();
                String nome = entrada.next();
                Double nota = entrada.nextDouble();
                String genero = entrada.next();
                Integer idade = entrada.nextInt();
                System.out.printf("%d %-s %-.2f %-s %-d\n",IdFilme,nome,nota, genero, idade);
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

        // Crie um objeto de ListaObj chamado lista para ser uma lista de Filme.
        ListaObj lista = new ListaObj<>(10);

        // Fique num loop, enquanto o usuário não escolher a opção Sair

        Integer opcao = 0;
        do {
            /*
            Exiba o menu de opções e peça que o usuário escolha uma das opções:

            1. Adicionar um filme
            2. Exibir a lista
            3. Gravar a lista em arquivo CSV
            4. Ler e exibir um arquivo CSV
            5. Gravar em outro arquivo CSV apenas filmes que estão na lista, mas de um determinado gênero
            6. Sair
             */
            Scanner leitorInt = new Scanner(System.in);

            Scanner leitorString = new Scanner(System.in);
            Scanner leitorDouble = new Scanner(System.in);

            System.out.println("\nEscolha uma opção: ");

            System.out.println("\n1. Adicionar um filme\n" +
                    "2. Exibir a lista\n" +
                    "3. Gravar a lista em arquivo CSV\n" +
                    "4. Ler e exibir um arquivo CSV\n" +
                    "5. Gravar em outro arquivo CSV apenas filmes que estão na lista, mas de um determinado gênero\n" +
                    "6. Sair");

            // Leia a opção digitada pelo usuário
            opcao = leitorInt.nextInt();

            /*

            Opção 2: Se a lista estiver vazia, exibe a mensagem "Lista está vazia", senão, exiba os dados de cada filme que está na lista.

            Opção 3: Verifique se a lista está vazia e nesse caso, exiba a mensagem “Lista está vazia. Não há nada a gravar”.
            Senão, grave num arquivo filme.csv os dados de cada filme que está na lista.

            Opção 4: Solicite que o usuário digite o nome do arquivo a ser lido. Leia o nome do arquivo.
            Leia o arquivo desejado e exiba os dados de cada filme, com cada atributo em uma coluna separada. (não se esqueça dos títulos das colunas)

            Opção 5: Verifique se a lista está vazia e nesse caso, exiba a mensagem “Lista está vazia. Não há nada a gravar”.
            Senão, solicite que o usuário digite o nome do arquivo a ser gravado e o gênero desejado. Leia o nome do arquivo e o gênero.
            Grave nesse arquivo apenas os filmes que estão na lista e que são do gênero desejado. Se não houver na lista filmes desse gênero,
            exiba a mensagem “Não há filmes deste gênero na lista”.

            Opção 6: Sinalize que é o fim do loop.

            Exiba também opção inválida, caso a opção digitada seja diferente de 1 a 6.
             */

            // Utilizando switch case, execute a opção escolhida pelo usuário.
            switch (opcao) {

                // Opção 1: Solicite que o usuário digite os valores dos atributos de Filme e leia os valores digitados.
                // Crie um objeto Filme com esses valores. Adicione esse objeto à lista.
                case 1:
                    System.out.println("\nDigite o código do filme: ");
                    Integer idFilme = leitorInt.nextInt();

                    System.out.println("\nDigite o nome do filme: ");
                    String nome = leitorString.nextLine();

                    System.out.println("\nDigite a nota do filme(0 a 10): ");
                    Double nota = leitorDouble.nextDouble();

                    while (nota < 0 || nota > 10) {
                        System.out.println("\nVocê digitou um valor inválido" +
                                "\nDigite uma nota de filme(0 a 10): ");
                        nota = leitorDouble.nextDouble();
                    }

                    System.out.println("\nDigite o gênero do filme: ");
                    String genero = leitorString.nextLine();

                    System.out.println("\nDigite a idade mínima para assistir o filme: ");
                    Integer idade = leitorInt.nextInt();

                    lista.adiciona(new Filme(idFilme, nome, nota, genero, idade));
                    break;

                // Opção 2: Se a lista estiver vazia, exibe a mensagem "Lista está vazia", senão, exiba os dados de cada filme que está na lista.
                case 2:
                    lista.exibe();
                    break;

                // Opção 3: Verifique se a lista está vazia e nesse caso, exiba a mensagem “Lista está vazia. Não há nada a gravar”.
                // Senão, grave num arquivo filme.csv os dados de cada filme que está na lista.


                // Opção 4: Solicite que o usuário digite o nome do arquivo a ser lido. Leia o nome do arquivo.
                // Leia o arquivo desejado e exiba os dados de cada filme, com cada atributo em uma coluna separada. (não se esqueça dos títulos das colunas)

                // Opção 5: Verifique se a lista está vazia e nesse caso, exiba a mensagem “Lista está vazia. Não há nada a gravar”.
                // Senão, solicite que o usuário digite o nome do arquivo a ser gravado e o gênero desejado. Leia o nome do arquivo e o gênero.
                // Grave nesse arquivo apenas os filmes que estão na lista e que são do gênero desejado. Se não houver na lista filmes desse gênero,
                // exiba a mensagem “Não há filmes deste gênero na lista”.

                // Opção 6: Sinalize que é o fim do loop.
            }

        }while (opcao != 6);
    }
}
