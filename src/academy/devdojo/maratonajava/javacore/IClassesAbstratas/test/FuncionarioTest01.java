package academy.devdojo.maratonajava.javacore.IClassesAbstratas.test;

import academy.devdojo.maratonajava.javacore.IClassesAbstratas.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.IClassesAbstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        //Uma classe abstrata não pode ter uma instância
        //Funcionario funcionario = new Funcionario("Zoro", 2000);
        Funcionario gerente = new Gerente("Nami", 2000);
        System.out.println(gerente);
    }
}
