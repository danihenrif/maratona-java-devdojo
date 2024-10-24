package academy.devdojo.maratonajava.javacore.ZZBStreams.test;

import academy.devdojo.maratonajava.javacore.ZZBStreams.domain.Category;
import academy.devdojo.maratonajava.javacore.ZZBStreams.domain.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZBStreams.domain.PROMOTION;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//groupby
public class StreamTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<LightNovel>(List.of(
            new LightNovel("L1",1.5D, Category.FANTASY),
            new LightNovel("L2", 4D, Category.FANTASY),
            new LightNovel("L3",1D, Category.FANTASY),
            new LightNovel("L4",2D, Category.DRAMA),
            new LightNovel("L5",3.5D, Category.ROMANCE)));

    public static void main(String[] args) {
        Map<PROMOTION, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(lightNovel -> {
            return getPromotion(lightNovel, 6);
        }));
        System.out.println(collect);

        Map<Category, Map<PROMOTION, List<LightNovel>>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCateory, Collectors.groupingBy(ln -> {
            return getPromotion(ln, 3);
        })));
        System.out.println(collect1);

    }

    private static PROMOTION getPromotion(LightNovel ln, int x) {
        return ln.getPrice() < x ? PROMOTION.UNDER_PROMOTION : PROMOTION.NORMAL_PRICE;
    }
}
