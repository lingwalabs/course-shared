package es.cursonoruego.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import es.cursonoruego.model.enums.CourseLevel;
import es.cursonoruego.model.enums.Language;
import es.cursonoruego.model.enums.LearningReason;
import es.cursonoruego.model.enums.LevelCefr;
import es.cursonoruego.model.enums.PaymentPlan;
import es.cursonoruego.model.enums.Provider;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class UserProfileJson {

    private String email;

    private Provider provider;
    
    private String providerId;
    
    private LevelCefr levelCefr;
    
    private CourseLevel courseLevel;
    
    private LearningReason learningReason;
    
    private String name;
    
    private String firstName;
    
    private String lastName;

    private String occupation;

    private String imageUrl;
    
    private Language preferredLanguage;
    
    private Calendar registrationDate;
    
    private Boolean isCreatedOnAndroid;
    
    private String gcmRegistrationId;
    
    private PaymentPlan paymentPlan;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public LevelCefr getLevelCefr() {
        return levelCefr;
    }

    public void setLevelCefr(LevelCefr levelCefr) {
        this.levelCefr = levelCefr;
    }

    public CourseLevel getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(CourseLevel courseLevel) {
        this.courseLevel = courseLevel;
    }

    public LearningReason getLearningReason() {
        return learningReason;
    }

    public void setLearningReason(LearningReason learningReason) {
        this.learningReason = learningReason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Language getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(Language preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public Calendar getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Calendar registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Boolean isIsCreatedOnAndroid() {
        return isCreatedOnAndroid;
    }

    public void setIsCreatedOnAndroid(Boolean isCreatedOnAndroid) {
        this.isCreatedOnAndroid = isCreatedOnAndroid;
    }

    public String getGcmRegistrationId() {
        return gcmRegistrationId;
    }

    public void setGcmRegistrationId(String gcmRegistrationId) {
        this.gcmRegistrationId = gcmRegistrationId;
    }

    public PaymentPlan getPaymentPlan() {
        return paymentPlan;
    }

    public void setPaymentPlan(PaymentPlan paymentPlan) {
        this.paymentPlan = paymentPlan;
    }
}
