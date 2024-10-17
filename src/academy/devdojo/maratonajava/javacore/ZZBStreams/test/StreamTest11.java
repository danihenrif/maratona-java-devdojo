package academy.devdojo.maratonajava.javacore.ZZBStreams.test;

import academy.devdojo.maratonajava.javacore.ZZBStreams.domain.Category;
import academy.devdojo.maratonajava.javacore.ZZBStreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//groupby
public class StreamTest11 {
    private static List<LightNovel> lightNovels = new ArrayList<LightNovel>(List.of(
            new LightNovel("L1",1.5D, Category.FANTASY),
            new LightNovel("L2", 4D, Category.FANTASY),
            new LightNovel("L3",1D, Category.FANTASY),
            new LightNovel("L4",2D, Category.DRAMA),
            new LightNovel("L5",3.5D, Category.ROMANCE)));

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> map = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCateory()){
                case DRAMA -> drama.add(lightNovel);
                case FANTASY -> fantasy.add(lightNovel);
                case ROMANCE -> romance.add(lightNovel);
            }
        }

        map.put(Category.DRAMA, drama);
        map.put(Category.FANTASY, fantasy);
        map.put(Category.ROMANCE, romance);

        //Com streams
        lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCateory));
    }
}
