public class Estagiario extends Funcionario 
{
    private int horasTrabalhadas;
    private String supervisor;

    public Estagiario(int matricula, String nome, int idade, float valorHora, int horasTrabalhadas, String supervisor) 
    {
        super(matricula, nome, idade, valorHora);
        this.horasTrabalhadas = horasTrabalhadas;
        this.supervisor = supervisor;
    }

    public int getHorasTrabalhadas() 
    {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) 
    {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getSupervisor() 
    {
        return supervisor;
    }

    public void setSupervisor(String supervisor) 
    {
        this.supervisor = supervisor;
    }

    @Override
    public void trabalhar() 
    {
        System.out.println("O estagiário está aprendendo e realizando tarefas sob supervisão.");
    }

    @Override
    public void relatarProgresso() 
    {
        System.out.println("O estagiário está relatando seu progresso e recebendo feedback.");
    }
}

