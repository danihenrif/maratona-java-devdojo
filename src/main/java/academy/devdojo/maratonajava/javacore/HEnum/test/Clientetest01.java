package academy.devdojo.maratonajava.javacore.HEnum.test;

import academy.devdojo.maratonajava.javacore.HEnum.domain.Cliente;
import academy.devdojo.maratonajava.javacore.HEnum.domain.TipoCliente;
import academy.devdojo.maratonajava.javacore.HEnum.domain.TipoPagamento;

public class Clientetest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jota", TipoCliente.PESSOA_FISICA );
        Cliente cliente1 = new Cliente("Dabliu", TipoCliente.PESSOA_JURIDICA);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(20));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(20));

        System.out.println(cliente1.toString());
    }
}
