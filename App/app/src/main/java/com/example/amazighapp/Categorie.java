package com.example.amazighapp;

public class Categorie {
    private String title;

    public Categorie(String title, String desc, String image) {
        this.title = title;
        this.desc = desc;
        this.image = image;
    }

    private String desc;
    private String image;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
public Categorie(){

}



}
