package academy.devdojo.maratonajava.javacore.EHerança.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario() {

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
