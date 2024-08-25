package academy.devdojo.maratonajava.javacore.CModificadorEstatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMax;
    /*
    * A velocidade limite pertence a classe carro
    * e não as instâncias(objetos).
    */
    private static double velLimite = 250;

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Velocidade Máxima: " + velocidadeMax);
        System.out.println("Velocidade Limite: " + velLimite);
    }

    public String getNome() {
        return nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    /*
    * Método estático pertence a classe, sem necessidade de uma instância para chamá-lo
    * Ele existe antes do objeto ser criado
    * Não há como referenciar atributos não estáticos dentro de um método estático
    */
    public static void setVelLimite(double velLimite) {
        /*
        * Se referencia um atributo static com "Nome_da_classe".
        */
        Carro.velLimite = velLimite;
        //this.velLimite = velLimite;
    }

    public double getVelLimite() {
        return velLimite;
    }
}
