package academy.devdojo.maratonajava.javacore.IClassesAbstratas.domain;

// Funcionário "não existe" é um TEMPLATE, o que existe é dentista, médico...
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //Não pode ser instanciado e pode ou deve ser sobrescrito pelas classes que estendem Funcionario
    public abstract void calculaBonus();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    /*
    * Caso uma classe abstrata tenha um método abstrato
    * e outra classe abstrata extenda essa classe, esta classe
    * não precisará implementar o método abstrato pelo fato de ser abstrata;
    * Mas a classe concreta  que extender ela tem!
    * */
}
