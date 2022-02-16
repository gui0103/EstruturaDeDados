import java.util.Scanner;

public class TestaCarrinho
{
    public static void main(String[] args)
    {
        Carrinho c = new Carrinho();

        Scanner r = new Scanner(System.in);


        Integer resposta;


        do {
            System.out.println(
                "\n\n\n\n" +
                "1. Adicionar livro,\n" +
                "2. Adicionar DVD,\n" +
                "3. Adicionar Serviço,\n" +
                "4. Exibir Itens do Carrinho,\n" +
                "5. Exibir Total de Venda, \n" +
                "6. Fim. \n\n" +
                "Por favor, escolha uma opção:"
            );

            resposta = r.nextInt();

            switch (resposta) {
                case 1 :
                    System.out.println("Digite os dados do livro que deseja adicionar:\n");
                    System.out.println("Codigo do Livro:\n");
                    Integer codigoLivro = r.nextInt();
                    r.nextLine();
                    System.out.println("Custo do Livro:\n");
                    Double custoLivro = r.nextDouble();
                    r.nextLine();
                    System.out.println("Nome do Livro:\n");
                    String nomeLivro = r.nextLine();
                    System.out.println("Nome do Autor:\n");
                    String autor = r.nextLine();
                    System.out.println("Ibsn:\n");
                    String ibsn = r.nextLine();
                    Livro l = new Livro(codigoLivro, custoLivro, nomeLivro, autor, ibsn);
                    c.adicionaVendavel(l);
                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite os dados do DVD que você deseja adicionar:\n");
                    System.out.println("Código do DVD:\n");
                    Integer codigoDVD = r.nextInt();
                    r.nextLine();
                    System.out.println("Custo do DVD:\n");
                    Double custoDVD = r.nextDouble();
                    System.out.println("Nome do DVD:\n");
                    String nomeDVD = r.nextLine();
                    System.out.println("Nome da gravadora:\n");
                    String gravadora = r.nextLine();
                    DVD d = new DVD(codigoDVD,custoDVD,nomeDVD,gravadora);
                    System.out.println("DVD adicionado com sucesso!");
                    c.adicionaVendavel(d);
                    break;

                case 3:
                    System.out.println("Digite os dados do Serviço que você deseja adicionar:\n");
                    System.out.println("Descrição:\n");
                    String descricao = r.nextLine();
                    System.out.println("Código do Serviço:\n");
                    Integer codigoServico = r.nextInt();
                    r.nextLine();
                    System.out.println("Quantidade de horas:\n");
                    Integer qtdHoras = r.nextInt();
                    r.nextLine();
                    System.out.println("Valor pago pela hora:");
                    Double valorHora = r.nextDouble();
                    r.nextLine();
                    Servico s = new Servico(descricao,codigoServico,qtdHoras,valorHora);
                    c.adicionaVendavel(s);
                    break;

                case 4:
                    c.exibeItensCarrinho();
                    break;

                case 5:
                    System.out.printf("Valor total obtido pelas vendas: R$ %.2f", c.calculaTotalVenda());
                    break;

                case 6:
                    System.out.println("Tchau Tchau!");
                    break;

                default:
                    System.out.println("Por favor, escolha um número válido!");
                    break;
            }
        } while (resposta != 6);


    }
}
