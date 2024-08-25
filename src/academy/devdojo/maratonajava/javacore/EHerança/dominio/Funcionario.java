package academy.devdojo.maratonajava.javacore.EHerança.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario() {

    }

    public void imprime(){
        super.imprime();
        System.out.println("Salário" + "= " + salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
