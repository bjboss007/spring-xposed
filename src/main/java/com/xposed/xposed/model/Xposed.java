package com.xposed.xposed.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Xposed extends AbstractEntity {


    private String firstName;

    private String middleName;

    private String lastName;

    private String location;

    private Image profileImage;

    private Image fullImage;

    private Image portraitImage;


    public Xposed(){

    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation(){
        return location;
    }

    public Image getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(Image profileImage) {
        this.profileImage = profileImage;
    }

    public Image getFullImage() {
        return fullImage;
    }

    public void setFullImage(Image fullImage) {
        this.fullImage = fullImage;
    }

    public Image getPortraitImage() {
        return portraitImage;
    }

    public void setPortraitImage(Image portraitImage) {
        this.portraitImage = portraitImage;
    }
}