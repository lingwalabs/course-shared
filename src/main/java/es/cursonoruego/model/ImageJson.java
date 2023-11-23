package es.cursonoruego.model;

public class ImageJson {
    
    private Long id;

    private boolean isAnimatedGif;
    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAnimatedGif() {
        return isAnimatedGif;
    }

    public void setIsAnimatedGif(boolean isAnimatedGif) {
        this.isAnimatedGif = isAnimatedGif;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
