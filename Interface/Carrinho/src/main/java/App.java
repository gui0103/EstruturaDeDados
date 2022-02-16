import java.util.Scanner;

public class App {

        public static void main(String[] args)
        {
            Carrinho carrinho1 = new Carrinho();

            Scanner leitor = new Scanner(System.in);

            Scanner leitorNextLine = new Scanner(System.in);


            Integer resposta;


            do {
                System.out.println(
                                "\n\n1 -> Adicionar livro,\n" +
                                "2 -> Adicionar DVD,\n" +
                                "3 -> Adicionar Serviço,\n" +
                                "4 -> Exibir Itens do Carrinho,\n" +
                                "5 -> Exibir Total de Venda, \n" +
                                "6 -> Fim. \n\n" +
                                "Por favor, escolha uma opção:"
                );

                resposta = leitor.nextInt();

                switch (resposta) {
                    case 1 :
                        System.out.println("Digite os dados do livro que deseja adicionar abaixo = \n");

                        System.out.println("Codigo do Livro:\n");

                        Integer codigoLivro = leitor.nextInt();

                        leitorNextLine.nextLine();

                        System.out.println("Custo do Livro:\n");

                        Double custoLivro = leitor.nextDouble();

                        leitorNextLine.nextLine();

                        System.out.println("Nome do Livro:\n");

                        String nomeLivro = leitorNextLine.nextLine();

                        System.out.println("Nome do Autor:\n");

                        String autor = leitorNextLine.nextLine();

                        System.out.println("Ibsn:\n");

                        String ibsn = leitorNextLine.nextLine();

                        Livro livro1 = new Livro(nomeLivro,codigoLivro, custoLivro, autor, ibsn);

                        carrinho1.adicionaVendavel(livro1);

                        System.out.println("Livro adicionado com sucesso!");

                        break;

                    case 2:
                        System.out.println("Digite os dados do DVD que você deseja adicionar:\n");

                        System.out.println("Código do DVD:\n");

                        Integer codigoDVD = leitor.nextInt();

                        leitorNextLine.nextLine();

                        System.out.println("Custo do DVD:\n");

                        Double custoDVD = leitor.nextDouble();

                        System.out.println("Nome do DVD:\n");

                        String nomeDVD = leitorNextLine.nextLine();

                        System.out.println("Nome da gravadora:\n");

                        String gravadora = leitorNextLine.nextLine();

                        DVD dvd1 = new DVD(nomeDVD,codigoDVD,custoDVD,gravadora);

                        System.out.println("DVD adicionado com sucesso!");

                        carrinho1.adicionaVendavel(dvd1);

                        break;

                    case 3:
                        System.out.println("Digite os dados do Serviço que você deseja adicionar:\n");

                        System.out.println("Descrição:\n");

                        String descricao = leitorNextLine.nextLine();

                        System.out.println("Código do Serviço:\n");

                        Integer codigoServico = leitor.nextInt();

                        leitorNextLine.nextLine();

                        System.out.println("Quantidade de horas:\n");

                        Integer qtdHoras = leitor.nextInt();

                        leitorNextLine.nextLine();

                        System.out.println("Valor pago por hora:");

                        Double valorHora = leitor.nextDouble();

                        leitorNextLine.nextLine();

                        Servico servico1 = new Servico(descricao,codigoServico,qtdHoras,valorHora);

                        carrinho1.adicionaVendavel(servico1);

                        break;

                    case 4:
                        carrinho1.exibeTodos();

                        break;

                    case 5:
                        System.out.printf("Valor total obtido pelas vendas: R$ %.2f", carrinho1.calculaTotal());

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
