package es.cursonoruego.model;

public class AudioJson {
    
    private Long id;

    private String fileName;

    private boolean qualityApprovedVilde, qualityApprovedHenrik, qualityApprovedLiv;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean isQualityApprovedVilde() {
        return qualityApprovedVilde;
    }

    public void setQualityApprovedVilde(boolean qualityApprovedVilde) {
        this.qualityApprovedVilde = qualityApprovedVilde;
    }

    public boolean isQualityApprovedHenrik() {
        return qualityApprovedHenrik;
    }

    public void setQualityApprovedHenrik(boolean qualityApprovedHenrik) {
        this.qualityApprovedHenrik = qualityApprovedHenrik;
    }

    public boolean isQualityApprovedLiv() {
        return qualityApprovedLiv;
    }

    public void setQualityApprovedLiv(boolean qualityApprovedLiv) {
        this.qualityApprovedLiv = qualityApprovedLiv;
    }
}
