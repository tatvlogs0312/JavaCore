package com.company;

import java.util.Arrays;

public class Book {
    private int ID;
    private String name;
    private String[] category;

    public Book(int ID, String name, String[] category) {
        this.ID = ID;
        this.name = name;
        this.category = category;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "id = " + ID +
                ", tên = '" + name + '\'' +
                ", thể loại = '" + Arrays.toString(getCategory())
                + '\'' ;
    }
}
