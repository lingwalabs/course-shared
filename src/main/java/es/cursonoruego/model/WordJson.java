package es.cursonoruego.model;

import es.cursonoruego.model.enums.PlaceHolder;

public class WordJson {

    private Long id;

    private String text;

    private WordJson wordAlternative;

    private String phonetics;

    private PlaceHolder placeHolder;

    private Integer frequencyOrder;

    private VerbJson verb;

    private NounJson noun;

    private AdjectiveJson adjective;

    private AudioJson audio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public WordJson getWordAlternative() {
        return wordAlternative;
    }

    public void setWordAlternative(WordJson wordAlternative) {
        this.wordAlternative = wordAlternative;
    }

    public String getPhonetics() {
        return phonetics;
    }

    public void setPhonetics(String phonetics) {
        this.phonetics = phonetics;
    }

    public PlaceHolder getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(PlaceHolder placeHolder) {
        this.placeHolder = placeHolder;
    }

    public Integer getFrequencyOrder() {
        return frequencyOrder;
    }

    public void setFrequencyOrder(Integer frequencyOrder) {
        this.frequencyOrder = frequencyOrder;
    }

    public VerbJson getVerb() {
        return verb;
    }

    public void setVerb(VerbJson verb) {
        this.verb = verb;
    }

    public NounJson getNoun() {
        return noun;
    }

    public void setNoun(NounJson noun) {
        this.noun = noun;
    }

    public AdjectiveJson getAdjective() {
        return adjective;
    }

    public void setAdjective(AdjectiveJson adjective) {
        this.adjective = adjective;
    }

    public AudioJson getAudio() {
        return audio;
    }

    public void setAudio(AudioJson audio) {
        this.audio = audio;
    }
}
