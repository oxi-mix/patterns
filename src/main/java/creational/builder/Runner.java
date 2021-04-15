package creational.builder;

public class Runner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new EnterPriseWebSiteBuilder());

        WebSite webSite = director.builderWebSite();

        System.out.println(webSite);
    }
}
