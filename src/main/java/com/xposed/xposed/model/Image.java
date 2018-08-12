package com.xposed.xposed.model;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Image extends AbstractEntity {

    private String name;
    private String path;

    @ManyToOne
    private Gallery gallery;

    public Image() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Gallery getGallery() {
        return gallery;
    }

    public void setGallery(Gallery gallery) {
        this.gallery = gallery;
    }
}
