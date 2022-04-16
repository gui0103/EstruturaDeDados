import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/*
Uma opção desafio será adicionar um novo item à lista, num determinado índice (e não no final).
Implemente a opção que adiciona no índice. Essa opção deve funcionar como a opção de adiciona normal,
mas deve solicitar que o usuário digite o índice desejado, onde quer inserir e chamar o método
adicionaNoIndice (explicação abaixo).

c) (Desafio) Implemente na classe ListaObj um novo método void chamado adicionaNoIndice,
que recebe um índice (onde é para inserir o objeto) e um objeto a ser adicionado no índice especificado.
Se a lista estiver cheia, exiba mensagem de "Lista cheia". Se o índice for inválido,
exiba uma mensagem de "Índice inválido". Caso contrário, adicione o novo elemento no índice desejado da lista.
Mas atenção, antes de adicionar, deve-se "abrir um espaço no índice desejado" para receber o novo elemento.
Dica: faça um for de trás para frente, a partir do último elemento colocado no vetor, até o índice desejado,
copiando cada elemento para a posição seguinte, de forma a "abrir esse espaço".
Não é para usar outro vetor para fazer esse deslocamento dos valores.
Por exemplo, se a lista fosse de ints, se na lista tiver 10, 20, 30, os índices ocupados são 0, 1 e 2,
e nessa situação, nroElem = 3. Se a lista estiver assim, os índices válidos para chamar esse método
são 0, 1, 2, 3. Qualquer valor além desses é inválido.
Se o usuário chamar lista.adicionaNoIndice(1, 40), o método deverá adicionar o 40 no índice 1 da lista,
mas para isso tem que deslocar o 20 e o 30 "uma posição pra frente".
Ao final da execução desse método, a lista ficará 10, 40, 20, 30 e nroElem = 4.
 */
public class Teste {
    public static void gravaLista(ListaObj<Tenis> lista, String nomeArq) {
        FileWriter arq = null;		// objeto FileWriter - representa o arquivo
        Formatter saida = null;		// objeto Formatter para executar saída formatada
        boolean deuRuim = false;	// indica se deu erro

        nomeArq += ".csv";	        // acrescenta extensão .csv

        /* Abre o arquivo para escrita e de forma
         * que grave sempre no final do arquivo, sem apagar o que
         * já está gravado no arquivo (append)
         *
         * Vamos tratar esse arquivo como um objeto Formatter
         * para poder gravar usando format
         */
        try {
            arq = new FileWriter(nomeArq);  // true indica que vai fazer "append"
            saida = new Formatter(arq);
        }
        catch (IOException erro) {
            System.err.println("Erro ao abrir arquivo");
            System.exit(1);  // encerra o programa, com status de erro
        }

        // Grava no arquivo os dados dos objetos Tenis que estão na lista
        try {
            // percorre a lista de objetos Tenis
            for (int i=0; i< lista.getTamanho(); i++) {
                Tenis tenis = lista.getElemento(i);
                // Grava os atributos do objeto tenis no arquivo
                saida.format("%d;%s;%s;%d;%d;%.2f\n",tenis.getIdTenis(), tenis.getNome(),tenis.getMarca(),
                        tenis.getNumeracao(), tenis.getAnoLancamento(), tenis.getPreco());

            }
        }
        catch (FormatterClosedException erro) {
            System.err.println("Erro ao gravar no arquivo");
            deuRuim= true;
        }
        finally { // bloco finally é executado independente de dar erro ou não
            // usado para fechar os objetos saida e close.
            saida.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.err.println("Erro ao fechar arquivo.");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    /* Método leExibeArquivo - lê e exibe os registros de um arquivo
     * Recebe true se o arquivo a ser lido é o tenis.csv e false se for o tenis.txt
     */
    public static void leExibeArquivo(String nomeArq) {
        FileReader arq= null;		// objeto FileReader - representa o arquivo a ser lido
        Scanner entrada = null;		// objeto Scanner - para ler do arquivo
        boolean deuRuim= false;		// indica se deu erro

        nomeArq += ".csv";	        // acrescenta extensão .csv

        // Abre o arquivo para leitura
        try {
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        }
        catch (FileNotFoundException erro) {
            System.err.println("Arquivo não encontrado");
            System.exit(1); // encerra o programa, com status de erro
        }

        // Lê os registros do arquivo e exibe os dados lidos na console
        try {
            // Exibe na console os títulos das colunas
            System.out.printf("%5s %-15s %-10s %9s %17s %7s\n",
                    "ID","NOME","MARCA", "NUMERAÇÃO", "ANO DE LANÇAMENTO", "PREÇO" );

            // Enquanto tem registro a ser lido
            while (entrada.hasNext()) {
                Integer idTenis = entrada.nextInt();
                String nome = entrada.next();
                String marca = entrada.next();
                Integer numeracao = entrada.nextInt();
                Integer anoLancamento = entrada.nextInt();
                Double preco = entrada.nextDouble();
                System.out.printf("%5d %-15s %-10s %9d %17d %7.2f\n",idTenis,nome,marca, numeracao, anoLancamento, preco);
            }
        }
        catch (NoSuchElementException erro)
        {
            System.err.println("Arquivo com problemas.");
            deuRuim = true;
        }
        catch (IllegalStateException erro)
        {
            System.err.println("Erro na leitura do arquivo.");
            deuRuim = true;
        }
        finally {
            entrada.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.err.println("Erro ao fechar arquivo.");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    // Crie a classe Teste, que deverá ser executável.
    public static void main(String[] args) {

        // Crie uma lista que deverá ser objeto da ListaObj<classe escolhida como tema>.
        ListaObj<Tenis> lista = new ListaObj<>(10);

        // Usada no loop
        Boolean sair = false;

        // Scanners
        Scanner leitorNextLine = new Scanner(System.in);
        Scanner leitorGeral = new Scanner(System.in);

        // Implemente dentro do main aquela lógica de ficar num loop exibindo opções ao usuário.
        // Trate as opções através do switch/case. A numeração e ordem das opções fica a seu critério.
        while (!sair) {

            System.out.println("\nEscolha uma opção: ");
            System.out.println(
                    "\n1- Adicionar um novo tênis." +
                    "\n2- Exibir todos os tênis." +
                    "\n3- Gravar um arquivo CSV com todos os tênis." +
                    "\n4- Ler o arquivo CSV com todos os tênis." +
                    "\n5- Alterar preço de um tênis." +
                    "\n6- Sair.");
            Integer opcao = leitorGeral.nextInt();

            while (opcao < 1 || opcao > 6) {

                System.out.println("\nVocê digitou uma opção inválida!" + "\nEscolha uma opção de 1 a 6: ");
                System.out.println(
                        "\n1- Adicionar um novo tênis." +
                        "\n2- Exibir todos os tênis." +
                        "\n3- Gravar um arquivo CSV com todos os tênis." +
                        "\n4- Ler o arquivo CSV com todos os tênis." +
                        "\n5- Alterar preço de um tênis." +
                        "\n6- Sair.");
                opcao = leitorGeral.nextInt();
            }

            switch (opcao) {

                // Uma das opções deverá ser adicionar objeto à lista.
                case 1:
                    System.out.println("\nDigite o ID do tênis: ");
                    Integer idTenis = leitorGeral.nextInt();

                    System.out.println("\nDigite o nome do tênis: ");
                    String nome = leitorNextLine.nextLine();

                    System.out.println("\nDigite a marca do tênis: ");
                    String marca = leitorNextLine.nextLine();

                    System.out.println("\nDigite a numeração do tênis: ");
                    Integer numeracao = leitorGeral.nextInt();

                    System.out.println("\nDigite o ano de lançamento do tênis: ");
                    Integer anoLancamento = leitorGeral.nextInt();

                    System.out.println("\nDigite preço do tênis: ");
                    Double preco = leitorGeral.nextDouble();

                    lista.adiciona(new Tenis(idTenis, nome, marca, numeracao, anoLancamento, preco));

                    break;

                // Outra opção deverá ser exibir a lista.
                case 2:
                    lista.exibe();
                    break;

                // Uma das opções deverá ser para gravar o arquivo CSV a partir dessa lista.
                // Você pode deixar um nome padrão para este arquivo ou pedir para que o usuário digite o nome.
                // Esse arquivo deverá ser gravado na pasta do projeto.
                // O arquivo CSV gerado deverá ser entregue zipado juntamente com o projeto.
                case 3:
                    gravaLista(lista, "tenis");
                    break;

                // Outra opção deverá ser para ler o arquivo CSV e exibir de forma que os dados fiquem em colunas,
                // bem alinhados, levando em consideração que números são alinhados para a direita e textos
                // são alinhados para a esquerda. Não se esqueça dos títulos das colunas. O nome do arquivo
                // pode ser padrão ou você pode solicitar que o usuário digite o nome do arquivo.
                case 4:
                    leExibeArquivo("tenis");
                    break;

                // Outra opção deverá ser para atualizar o valor de um atributo de
                // um objeto de um determinado id
                // (atenção: é o atributo id, e não o índice). Fixe um atributo da sua classe para ser alterado.
                // (Por exemplo, no caso da classe Filme, poderia ser a idade.
                // Nesse caso, o usuário digitaria o id do filme e a nova idade mínima do filme desejado.
                // A opção do menu, nesse caso, seria Alterar a idade de um filme).
                // Solicite ao usuário para digitar o valor do id desejado e o novo valor do atributo.
                // Busque esse id na lista. Se encontrar, altere o valor do atributo conforme
                // solicitado pelo usuário. Se não encontrar, exiba uma mensagem informando.
                case 5:
                    System.out.println("\nDigite o ID do tênis que deseja alterar o preço: ");
                    Integer idSelecionado = leitorGeral.nextInt();

                    System.out.println("\nDigite o novo preço do tênis selecionado: ");
                    Double novoPreco = leitorGeral.nextDouble();

                    lista.alteraPreco(idSelecionado, novoPreco);
                    break;

                // A última opção deverá ser Fim do programa.
                case 6:
                    System.out.println("\nFim do programa. Tchau Tchau!");
                    sair = true;
                    break;
            }
        }
    }
}
