package academy.devdojo.maratonajava.javacore.ZZBStreams.domain;

public class LightNovel {
    private String title;
    private Double price;
    private Category cateory;

    @Override
    public String toString() {
        return "LightNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", cateory=" + cateory +
                '}';
    }

    public LightNovel(String title, Double price, Category cateory) {
        this.title = title;
        this.price = price;
        this.cateory = cateory;
    }

    public LightNovel(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public Category getCateory() {
        return cateory;
    }
}
