package com.xposed.xposed.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Gallery extends AbstractEntity {

    @OneToMany(cascade = CascadeType.ALL)
    private List<Image> photos;

    public List<Image> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Image> photos) {
        this.photos = photos;
    }
}
