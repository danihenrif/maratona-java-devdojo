package academy.devdojo.maratonajava.javacore.NWrappers;

public class WrapperTest01 {
    byte bt = 1;
    short sht = 1;
    int it = 1;
    long lt = 1;
    float ft = 1.0f;
    double dt = 1.0d;
    char ct = 'a';
    boolean bl = true;

    Byte btW = 1;
    Short shtW = 1;
    Integer itW = 1;//autobixing
    Long ltW = Long.valueOf(1);
    Float ftW = 1.0f;
    Double dtW = 1.0d;
    Character ctW = 'a';
    Boolean blW = true;

    int aux = itW;//unboxing
    Integer intW2 = Integer.parseInt("1");
}
