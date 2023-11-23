package es.cursonoruego.model;

public class AdjectiveJson {
    
    private Long id;

    private String masculine;
    
    private String masculineEs;

    private String feminine;

    private String neutro;

    private String plural;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMasculine() {
        return masculine;
    }

    public void setMasculine(String masculine) {
        this.masculine = masculine;
    }

    public String getMasculineEs() {
        return masculineEs;
    }

    public void setMasculineEs(String masculineEs) {
        this.masculineEs = masculineEs;
    }

    public String getFeminine() {
        return feminine;
    }

    public void setFeminine(String feminine) {
        this.feminine = feminine;
    }

    public String getNeutro() {
        return neutro;
    }

    public void setNeutro(String neutro) {
        this.neutro = neutro;
    }

    public String getPlural() {
        return plural;
    }

    public void setPlural(String plural) {
        this.plural = plural;
    }
}
