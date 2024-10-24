package academy.devdojo.maratonajava.javacore.EHerança.test;

import academy.devdojo.maratonajava.javacore.EHerança.dominio.Funcionario;

public class HerancaTest02 {

    /*
     *----------------- Independente de objeto---------------------------------------
     * 0.  Bloco de inicialização estático da super classe é carregado quando a JVM carrega a classe pai
     * 0.1 Bloco de inicialização estático da sub classe é carregado quando a JVM carrega a classe filha
     * ---------------- Dependentes de objeto ---------------------------------------
     * 1. É alocado um espaço de memória para o objeto da superclasse
     * 2. Cada atributo de classe é criado e inicializado com os calores (ou default)
     * 3. Bloco de inicialização da superclasse é executado
     * 4. Construtor da superclasse é executado
     * 5. É alocado um espaço de memória para o objeto da subclasse
     *
     * 6. Cada atributo de subclasse é criado e inicializado com os calores (ou default)
     * 7. Bloco de inicialização da sublasse é executado
     * 8. Construtor da subclasse é executado
     */

    /*
    * Construtor                        - Chamado toda x q uma instância é criada
    * Bloco de inicialização            - Chamado toda x q uma instância é criada
    *                                   pode ser útil para colocar código comum entre construtores
    * Bloco de inicialização etático    - Chamado apenas uma x no carregamento da classe pela JVM
    *                                   - ùtil para alocar valores estáticos e economia computacional
    */
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Rabicó");
    }
}

