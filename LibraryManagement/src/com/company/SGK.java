package com.company;

public class SGK extends Book{
    private String author;
    private String publishingCompany;
    private int publishingYear;
    private int pageNumber;
    private int quantily;

    public SGK(int ID, String name, String[] category, String author, String publishingCompany, int publishingYear, int pageNumber, int quantily) {
        super(ID, name, category);
        this.author = author;
        this.publishingCompany = publishingCompany;
        this.publishingYear = publishingYear;
        this.pageNumber = pageNumber;
        this.quantily = quantily;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }

    @Override
    public String toString() {
        return "SGK{" + super.toString() +
                ", tác giả = '" + author + '\'' +
                ", nhà xuất bản = '" + publishingCompany + '\'' +
                ", năm xuất bản = " + publishingYear +
                ", số trang = " + pageNumber +
                ", số lượng = " + quantily +
                '}';
    }
}
