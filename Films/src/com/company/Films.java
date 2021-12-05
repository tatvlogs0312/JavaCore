package com.company;

import java.util.Scanner;

public class Films {
    private int id;
    private String name;
    private String category;
    private int lengthOfFilm;
    private String producer;
    private int releaseYear;

    public Films(int id, String name, String category, int lengthOfFilm, String producer, int releaseYear) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.lengthOfFilm = lengthOfFilm;
        this.producer = producer;
        this.releaseYear = releaseYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getLengthOfFilm() {
        return lengthOfFilm;
    }

    public void setLengthOfFilm(int lengthOfFilm) {
        this.lengthOfFilm = lengthOfFilm;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Films{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", lengthOfFilm=" + lengthOfFilm +
                ", producer='" + producer + '\'' +
                ", releaseYear=" + releaseYear +
                '}' + "\n";
    }
}


