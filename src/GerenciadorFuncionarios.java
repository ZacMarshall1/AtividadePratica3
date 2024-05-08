import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorFuncionarios 
{
    private ArrayList<Funcionario> listaFuncionarios;
    private Scanner scanner;

    public GerenciadorFuncionarios() {
        this.listaFuncionarios = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void adicionarFuncionario(Funcionario funcionario) 
    {
        listaFuncionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) 
    {
        listaFuncionarios.remove(funcionario);
    }

    public void listarFuncionarios() 
    {
        for (Funcionario funcionario : listaFuncionarios) 
        {
            System.out.println(funcionario.getNome());
        }
    }

    public void criarFuncionario() 
    {
        System.out.println("Digite o tipo de funcionário a ser criado (1 - Programador, 2 - Gerente, 3 - Estagiário):");
        int tipoFuncionario = scanner.nextInt();
        scanner.nextLine();

        switch (tipoFuncionario) 
        {
            case 1:
                criarProgramador();
                break;
            case 2:
                criarGerente();
                break;
            case 3:
                criarEstagiario();
                break;
            default:
                System.out.println("Tipo de funcionário inválido.");
        }
    }

    public void criarProgramador() 
    {
        System.out.println("Digite a matrícula do programador:");
        int matricula = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do programador:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do programador:");
        int idade = scanner.nextInt();

        System.out.println("Digite o valor da hora do programador:");
        float valorHora = scanner.nextFloat();

        System.out.println("Digite as tecnologias em que o programador se especializa (separadas por vírgula):");
        scanner.nextLine();
        String tecnologiasInput = scanner.nextLine();
        String[] tecnologias = tecnologiasInput.split(",");

        Programador novoProgramador = new Programador();
        novoProgramador.setMatricula(matricula);
        novoProgramador.setNome(nome);
        novoProgramador.setIdade(idade);
        novoProgramador.setValorHora(valorHora);
        novoProgramador.setTecnologias(tecnologias);

        adicionarFuncionario(novoProgramador);

        System.out.println("Programador criado com sucesso!");
    }

    public void criarGerente() {
        System.out.println("Digite a matrícula do gerente:");
        int matricula = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do gerente:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do gerente:");
        int idade = scanner.nextInt();

        System.out.println("Digite o valor da hora do gerente:");
        float valorHora = scanner.nextFloat();

        System.out.println("Digite o bônus anual do gerente:");
        float bonusAnual = scanner.nextFloat();

        Gerente novoGerente = new Gerente();
        novoGerente.setMatricula(matricula);
        novoGerente.setNome(nome);
        novoGerente.setIdade(idade);
        novoGerente.setValorHora(valorHora);
        novoGerente.setBonusAnual(bonusAnual);

        adicionarFuncionario(novoGerente);

        System.out.println("Gerente criado com sucesso!");
    }

    public void criarEstagiario() 
    {
        System.out.println("Digite a matrícula do estagiário:");
        int matricula = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do estagiário:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do estagiário:");
        int idade = scanner.nextInt();

        System.out.println("Digite o valor da hora do estagiário:");
        float valorHora = scanner.nextFloat();

        System.out.println("Digite o número de horas trabalhadas do estagiário:");
        int horasTrabalhadas = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do supervisor do estagiário:");
        String supervisor = scanner.nextLine();

        Estagiario novoEstagiario = new Estagiario();
        novoEstagiario.setMatricula(matricula);
        novoEstagiario.setNome(nome);
        novoEstagiario.setIdade(idade);
        novoEstagiario.setValorHora(valorHora);
        novoEstagiario.setHorasTrabalhadas(horasTrabalhadas);
        novoEstagiario.setSupervisor(supervisor);

        adicionarFuncionario(novoEstagiario);

        System.out.println("Estagiário criado com sucesso!");
    }

    public void calcularSalarioFuncionario() 
    {
        System.out.println("Digite a matrícula do funcionário:");
        int matricula = scanner.nextInt();
        scanner.nextLine();

        Funcionario funcionario = buscarFuncionarioPorMatricula(matricula);
        if (funcionario != null) 
        {
            float salario = CalculadoraSalario.calcularSalario(funcionario);
            System.out.println("O salário do funcionário " + funcionario.getNome() + " é: R$" + salario);
        } else 
        {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public Funcionario buscarFuncionarioPorMatricula(int matricula) {

        for (Funcionario funcionario : listaFuncionarios) 
        {
            if (funcionario.getMatricula() == matricula) 
            {
                return funcionario;
            }
        }
        return null;
    }

    public ArrayList<Funcionario> getListaFuncionarios() 
    {
        return listaFuncionarios;
    }
}
