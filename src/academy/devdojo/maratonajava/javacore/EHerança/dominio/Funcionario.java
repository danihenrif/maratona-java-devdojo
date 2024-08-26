package academy.devdojo.maratonajava.javacore.EHerança.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Construtor de funcionario");
    }

    static {
        System.out.println("Static de funcionario");
    }

    {
        System.out.println("Inicializacao de funcionario 1");
    }
    {
        System.out.println("Inicializacao de funcionario 2");
    }

    //Sobrescrita
    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Salário" + "= " + salario);
    }

    public void relatorioPagamento(){
        System.out.println(this.nome + " " + salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
