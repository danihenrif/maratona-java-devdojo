package academy.devdojo.maratonajava.javacore.IClassesAbstratas.domain;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    //Cada classe tem o seu calculaBonus
    @Override
    public void calculaBonus() {
        this.salario = this.salario * 0.5;
    }
}
