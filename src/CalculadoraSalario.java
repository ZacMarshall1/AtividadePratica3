public class CalculadoraSalario 
{

    public static float calcularSalario(Funcionario funcionario) 
    {
        float salario = funcionario.getValorHora() * calcularHorasTrabalhadas(funcionario);
        if (funcionario instanceof Gerente) 
        {
            salario += calcularBonusGerente((Gerente) funcionario);
        }
        return salario;
    }

    private static int calcularHorasTrabalhadas(Funcionario funcionario) 
    {
        if (funcionario instanceof Estagiario) 
        {
            return ((Estagiario) funcionario).getHorasTrabalhadas();
        } else 
        {
            return 0;
        }
    }

    private static float calcularBonusGerente(Gerente gerente) 
    {
        float salarioAnual = gerente.getValorHora() * 8 * 22 * 12; // Considerando 8 horas por dia e 22 dias úteis por mês
        return salarioAnual * 0.1f; // 10% do salário anual
    }
}

