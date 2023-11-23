package es.cursonoruego.model;

import es.cursonoruego.model.enums.Gender;

public class NounJson {
    
    private Long id;

    private Gender gender;

    private String singularIndet;

    private String singularIndetEs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getSingularIndet() {
        return singularIndet;
    }

    public void setSingularIndet(String singularIndet) {
        this.singularIndet = singularIndet;
    }

    public String getSingularIndetEs() {
        return singularIndetEs;
    }

    public void setSingularIndetEs(String singularIndetEs) {
        this.singularIndetEs = singularIndetEs;
    }
}
