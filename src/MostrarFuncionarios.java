import java.util.ArrayList;

public class MostrarFuncionarios {
    public static void mostrar(ArrayList<Funcionario> funcionarios) 
    {
        System.out.println("Lista de Funcionários:");
        for (Funcionario funcionario : funcionarios) 
        {
            System.out.println("Matrícula: " + funcionario.getMatricula() + ", Nome: " + funcionario.getNome());
        }
    }
}
