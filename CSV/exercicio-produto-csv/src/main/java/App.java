import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {

    public static void gravaArquivoCsv(ListaObj<Produto> lista, String nomeArq) {
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
            // Percorro a lista de produto
            for (int i = 0; i < lista.getTamanho(); i++) {
                Produto produto = lista.getElemento(i);
                saida.format("%d;%s;%.2f;%s;%d\n",
                        produto.getCodProduto(), produto.getNome(), produto.getPreco(), produto.getAvaliacao(), produto.getQntdVendida()); // uma linha do arquivo
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
            System.out.printf("%-6s %-14s %7s %7s %14s\n", "CODIGO", "NOME", "PRECO", "NOTA", "FATURAMENTO");
            while (entrada.hasNext()) {
                Integer codProduto = entrada.nextInt();
                String nome = entrada.next();
                Double preco = entrada.nextDouble();
                String avaliacao = entrada.next();
                Integer qtdVendida = entrada.nextInt();
                System.out.printf("%-6s %-14s %7s %7s %14s\n",codProduto,nome,preco,avaliacao,qtdVendida);
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

        ListaObj<Produto> lista = new ListaObj<>(5);

        lista.adiciona(new Produto(123, "Celular", 2000.0, "***"));
        lista.adiciona(new Produto(456, "Notebook", 1000.0, "****"));
        lista.adiciona(new Produto(789, "Geladeira", 3000.0, "***"));
        lista.adiciona(new Produto(101, "CPU", 1000.0, "*"));
        lista.adiciona(new Produto(112, "Mouse", 57.1, "**"));

       gravaArquivoCsv(lista, "produtos");
       leExibeArquivoCsv("produtos");

    }
}
