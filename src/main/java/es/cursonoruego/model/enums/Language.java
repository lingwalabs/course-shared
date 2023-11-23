package es.cursonoruego.model.enums;

/**
 * User's preferred language as specified by 
 * <a href="http://www.w3.org/WAI/ER/IG/ert/iso639.htm">ISO639</a>
 */
public enum Language {

    en,
    es,
    no;
    
    public Country getCountry() {
    	if (this == es) {
    		return Country.ES;
    	} else if (this == no) {
    		return Country.NO;
    	} else {
    		return Country.UK;
    	}
    }
}
