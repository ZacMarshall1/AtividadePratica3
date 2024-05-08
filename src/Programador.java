public class Programador extends Funcionario
{
    private String[] tecnologias;

    public Programador(int matricula, String nome, int idade, float valorHora, String[]tecnologias)
    {
        super(matricula, nome, idade, valorHora);
        this.tecnologias = tecnologias;
    }

    public String[] getTecnologias()
    {
        return tecnologias;
    }

    public void setTecnologias(String[] tecnologias)
    {
        this.tecnologias = tecnologias;
    }

    @Override
    public void trabalhar() 
    {
        System.out.println("O programador está desenvolvendo código em suas tecnologias especializadas.");
    }

    @Override
    public void relatarProgresso() 
    {
        System.out.println("O programador está relatando o progresso do desenvolvimento de software.");
    }
}
