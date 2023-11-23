package es.cursonoruego.model.enums;

import java.util.TimeZone;

/**
 * User's country of residence as specified by 
 * <a href="http://www.iso.org/iso/en/prods-services/iso3166ma/index.html">ISO3166</a>
 */
public enum Country {

    NO("Oslo"),
    ES("Madrid"),
    UK("London");

    private String capital;

    private Country(String capital) {
        this.capital = capital;
    }

    public String getCapital() {
        return capital;
    }

    public TimeZone getTimeZone() {
        return TimeZone.getTimeZone("Europe/" + capital);
    }
}
