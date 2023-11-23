package es.cursonoruego.model.enums;

public enum Gender {

	MALE("en"),
        FEMALE("ei"),
        NEUTRAL("et");
        
        private String article;
        
        private Gender(String article) {
            this.article = article;
        }

        public String getArticle() {
            return article;
        }
}
