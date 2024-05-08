import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorFuncionarios gerenciador = new GerenciadorFuncionarios();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Remover Funcionário");
            System.out.println("3. Listar Funcionários");
            System.out.println("4. Calcular Salário de um Funcionário");
            System.out.println("5. Mostrar Funcionários");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção:");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) 
            {
                case 1:
                    gerenciador.criarFuncionario();
                    break;
                case 2:
                    // Implemente a remoção de funcionário
                    break;
                case 3:
                    gerenciador.listarFuncionarios();
                    break;
                case 4:
                    gerenciador.calcularSalarioFuncionario();
                    break;
                case 5:
                    MostrarFuncionarios.mostrar(gerenciador.getListaFuncionarios());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

