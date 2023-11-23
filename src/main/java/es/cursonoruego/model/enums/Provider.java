package es.cursonoruego.model.enums;

public enum Provider {

    FACEBOOK("Facebook"),
    GOOGLE("Google"),
    LINKEDIN("LinkedIn"),
    TWITTER("Twitter");
    
    public String name;

    private Provider(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
