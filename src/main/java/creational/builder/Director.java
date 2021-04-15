package creational.builder;

public class Director {
    public void setBuilder(WebSiteBuilder builder) {
        this.builder = builder;
    }

    WebSiteBuilder builder;
    WebSite builderWebSite() {
        builder.createWebSite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        return builder.getWebSite();
    }


}
