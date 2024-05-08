public class Funcionario implements Trabalhavel
{
    private int matricula;
    private String nome;
    private int idade;
    private float valorHora;

    public Funcionario (int matricula, String nome, int idade, float valorHora)
    {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.valorHora = valorHora;
    }

    public int getMatricula()
    {
        return matricula;
    }

    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }

    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public float getValorHora()
    {
        return valorHora;
    }

    public void setValorHora(float valorHora)
    {
        this.valorHora = valorHora;
    }

    @Override
    public void trabalhar() 
    {
        System.out.println("O funcionário está trabalhando.");
    }

    @Override
    public void relatarProgresso() 
    {
        System.out.println("O funcionário está relatando seu progresso.");
    }
}



