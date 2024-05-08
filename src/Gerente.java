import java.util.ArrayList;

public class Gerente extends Funcionario
{
    private float bonusAnual;
    private ArrayList<Funcionario> equipe;

    public Gerente (int matricula, String nome, int idade, float valorHora, float bonusAnual)
    {
        super(matricula, nome, idade, valorHora);
        this.bonusAnual = bonusAnual;
        this.equipe = new ArrayList<>();
    }

    public float getBonusAnual()
    {
        return bonusAnual;
    }

    public void setBonusAnual(float bonusAnual)
    {
        this.bonusAnual = bonusAnual;
    }

    public ArrayList<Funcionario> getEquipe()
    {
        return equipe;
    }

    public void setEquipe(ArrayList<Funcionario> equipe)
    {
        this.equipe = equipe;
    }

    public void adicionarFuncionario(Funcionario funcionario)
    {
        equipe.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario)
    {
        equipe.remove(funcionario);
    }

    @Override
    public void trabalhar() 
    {
        System.out.println("O gerente está coordenando a equipe e tomando decisões.");
    }

    @Override
    public void relatarProgresso() 
    {
        System.out.println("O gerente está relatando o progresso da equipe.");
    }
}
