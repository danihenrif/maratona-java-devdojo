package academy.devdojo.maratonajava.javacore.HEnum.domain;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.1;
        }
    },CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.05;
        }
    };

    //Criado apenas para ser sobrescrito
    public abstract double calcularDesconto(double valor);
}
