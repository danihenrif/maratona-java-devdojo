package academy.devdojo.maratonajava.javacore.ZZBStreams.test;


import academy.devdojo.maratonajava.javacore.ZZBStreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//1. Ordenar os Light Novel por título
//2. Trazer os 3 primeiros Light Novel com preço menor que 4
public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<LightNovel>(List.of(
            new LightNovel("L1",1.5D),
            new LightNovel("L2", 4D),
            new LightNovel("L3",1D),
            new LightNovel("L4",2D),
            new LightNovel("L5",3.5D)));


    public static void main(String[] args) {


        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));

        int counter = 0 ;
        List<LightNovel> ln = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (counter == 3){
                break;
            }
            if (lightNovel.getPrice() < 4D){
                counter++;
                ln.add(lightNovel);
            }
        }
        System.out.println(ln);
    }
}
