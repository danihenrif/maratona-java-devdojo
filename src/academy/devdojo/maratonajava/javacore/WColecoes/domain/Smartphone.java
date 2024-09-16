package academy.devdojo.maratonajava.javacore.WColecoes.domain;

public class Smartphone {
    private String serialNumber;
    private String marca;


    //reflexivo x.equals(x) tem q ser true para tudo diferente de null
    //simétrico x.equals(y) == true <=> y.equals(x) == true
    //transitivo para to do x,y,z != null => se x.equals(y) == true e y.equals(z) == true
    //entao x.equals(z) == true
    //consistente x.equals(x) sempre retorna true se x for diferente de null
    //tem tudo na documentação :)
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smart = (Smartphone) obj;
        return this.serialNumber != null && this.serialNumber.equals(smart.serialNumber);
    }

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
