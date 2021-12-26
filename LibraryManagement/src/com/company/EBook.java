package com.company;

import java.time.LocalDate;

public class EBook extends Book{
    private String author;
    private int publishingYear;
    private LocalDate uploadDate;
    private double cache;
    private long downloads;

    public EBook(int ID, String name, String[] category, String author, int publishingYear, LocalDate uploadDate, double cache, long downloads) {
        super(ID, name, category);
        this.author = author;
        this.publishingYear = publishingYear;
        this.uploadDate = uploadDate;
        this.cache = cache;
        this.downloads = downloads;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public LocalDate getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDate uploadDate) {
        this.uploadDate = uploadDate;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public long getDownloads() {
        return downloads;
    }

    public void setDownloads(long downloads) {
        this.downloads = downloads;
    }

    @Override
    public String toString() {
        return "EBook{" + super.toString() +
                ", tác giả = '" + author + '\'' +
                ", năm xuất bản = '" + publishingYear + '\'' +
                ", ngày upload = " + uploadDate +
                ", dung lượng = " + cache +
                ", lượt tải = " + downloads +
                '}';
    }
}
