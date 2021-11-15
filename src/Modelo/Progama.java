package Modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Progama {

    public static void main(String[] args) {
        Integer opcao = -1;
        Scanner sc = new Scanner(System.in);
        List<Livro> livros = new ArrayList<>();
        List<Locação> emprestimos = new ArrayList<>();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        do {

            System.out.println("\n** M E N U **\n");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Consultar Livro");
            System.out.println("3 - Listar todos os livros");
            System.out.println("4 - Realizar locação");
            System.out.println("5 - Realizar devolução");
            System.out.println("6 - Livros com devolução em aberto");
            System.out.println("7 - Livros alugados por período");
            System.out.println("0 - Sair");
            System.out.println("\nOpção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
            case 1:
                System.out.println("Digite o nome do livro:");
                String titulo = sc.nextLine();
                System.out.println("Digite número de páginas:");
                Integer paginas = sc.nextInt();
                System.out.println("Digite o autor do livro");
                String autor = sc.nextLine();
                System.out.println("Digite o código do livro:");
                Integer codigo = sc.nextInt();

                Livro livro = new Livro(titulo, paginas, autor, codigo);
                livros.add(livro);

                break;
            case 2:
                if (livros.equals(null)) {
                    System.out.println("\nNão há livros cadrastados.");

                } else if (!livros.equals(null)) {
                    System.out.println("Digite o nome do livro:");
                    String livroProcura = sc.nextLine();

                    if (livros.stream().filter(p -> p.getTituloLivro().equalsIgnoreCase(livroProcura)) != null) {
                        livros.forEach(System.out::println);

                    } else
                        System.out.printf("\nLivro %s não registrado\n");
                }
                break;
            case 3:
                System.out.println("\n\n");
                for (Livro l : livros) {
                    System.out.println(l);
                }
                break;
            case 4:
                if (livros.equals(null)) {
                    System.out.println("\nNão há livros cadrastados.");

                } else if (!livros.equals(null)) {
                    System.out.println("Digite o livro que irá em locação:");
                    String livroLocacao = sc.nextLine();

                    if (livros.stream().filter(p -> p.getTituloLivro().equalsIgnoreCase(livroLocacao)) != null) {
                        livros.forEach(System.out::println);
                        System.out.printf("\nLivro encontardo\n");
                        System.out.printf("\nRealizando locação\n");
                        System.out.println("Digite se o livro está disponível(Sim)ou(Não):");
                        Boolean statusDevolucao = sc.nextBoolean();

                        if (statusDevolucao.equals("Sim")) {
                            System.out.println("Digite a data de locação[DD/MM/AAAA]:");
                            String dataLocacao = sc.nextLine();
                            System.out.println("Digite a data de devolução[DD/MM/AAAA]:");
                            String dataDevolucao = sc.nextLine();
                            System.out.println("Digite o CPF do cliente");
                            Integer cpfCliente = sc.nextInt();
                            System.out.println("Digite o código do livro:");
                            Integer codigoL = sc.nextInt();
                            livros.removeIf(a -> a.getTituloLivro().equalsIgnoreCase(livroLocacao));
                            System.out.printf("\nAção concluida com sucesso\n");

                            Locação locação = new Locação(LocalDate.parse(dataLocacao, df),
                                    LocalDate.parse(dataDevolucao, df), cpfCliente, codigoL, statusDevolucao);
                            emprestimos.add(locação);

                        } else if (statusDevolucao.equals("Não")) {
                            System.out.printf("\nLivro não disponível\n");
                        }

                    } else
                        System.out.printf("\nLivro %s não registrado\n");
                }
                break;
            case 5:
                if (emprestimos.equals(null)) {
                    System.out.println("\nNão houve locações.");

                } else if (!emprestimos.equals(null)) {
                    System.out.println("Digite a data de locação[DD/MM/AAAA]:");
                    String livrodevolucao = sc.nextLine();

                    if (emprestimos.stream()
                            .filter(p -> p.getDataLocacao().equals(LocalDate.parse(livrodevolucao, df))) != null) {
                        emprestimos.forEach(System.out::println);
                        System.out.printf("\nLocação encontarda\n");
                        System.out.printf("\nRealizando devolução\n");
                        System.out.println("Digite se está tudo certo para devolução(Sim)ou(Não):");
                        Boolean statusDevolucao = sc.nextBoolean();

                        if (statusDevolucao.equals("Sim")) {
                            System.out.println("Digite a data de devolução[DD/MM/AAAA]:");
                            String dataDevolucao = sc.nextLine();
                            System.out.println("Digite a data de locação[DD/MM/AAAA]:");
                            String dataLocacao = sc.nextLine();
                            System.out.println("Digite o nome do livro:");
                            String titulo1 = sc.nextLine();
                            System.out.println("Digite número de páginas:");
                            Integer paginas1 = sc.nextInt();
                            System.out.println("Digite o autor do livro");
                            String autor1 = sc.nextLine();
                            System.out.println("Digite o código do livro:");
                            Integer codigo1 = sc.nextInt();

                            Livro livroDevolucao = new Livro(titulo1, paginas1, autor1, codigo1);
                            livros.add(livroDevolucao);

                        } else if (statusDevolucao.equals("Não")) {
                            System.out.printf("\nRetorne quando estiver tudo certo\n");
                        }

                    } else
                        System.out.printf("\nData não registrada ou incorreta\n");
                }
                break;
            case 6:
                System.out.println("\n\n");
                for (Locação e : emprestimos) {
                    System.out.println(e);
                }
                break;
            case 7:
                if (emprestimos.equals(null)) {
                    System.out.println("\nNão foram alugados nenhum livros.");

                } else if (!emprestimos.equals(null)) {
                    System.out.println("Informe a data de locação[DD/MM/AAAA]: ");
                    String dataLocacao = sc.nextLine();
                    if (emprestimos.stream()
                            .filter(p -> p.getDataLocacao().equals(LocalDate.parse(dataLocacao, df))) != null) {
                        emprestimos.forEach(System.out::println);

                    } else
                        System.out.printf("\nData não registrada ou incorreta\n");

                }
                break;
            case 0:
                System.out.println("Fim do programa!");
                break;

            default:
                System.out.println("Opção inválida.");
                break;

            }
        } while (opcao != 0);

        sc.close();
    }
}