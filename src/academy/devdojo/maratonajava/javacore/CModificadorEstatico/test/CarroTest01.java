package academy.devdojo.maratonajava.javacore.CModificadorEstatico.test;

import academy.devdojo.maratonajava.javacore.CModificadorEstatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        /*
        * Ao mudar aqui mudará de todas as instâncias
        */
        c1.setVelLimite(180);

        Carro.velLimite = 150;

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
    }
}
