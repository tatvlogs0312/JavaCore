package com.company;

import java.time.LocalDate;

public class Magazine extends Book{
    private String office;
    private LocalDate publishingDay;
    private int pageNumber;
    private int quantily;

    public Magazine(int ID, String name, String[] category, String office, LocalDate publishingDay, int pageNumber, int quantily) {
        super(ID, name, category);
        this.office = office;
        this.publishingDay = publishingDay;
        this.pageNumber = pageNumber;
        this.quantily = quantily;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public LocalDate getPublishingDay() {
        return publishingDay;
    }

    public void setPublishingDay(LocalDate publishingDay) {
        this.publishingDay = publishingDay;
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
        return "Magazine{" + super.toString() +
                ", tòa soạn = '" + office + '\'' +
                ", ngày xuất bản = " + publishingDay +
                ", số trang = " + pageNumber +
                ", số lượng = " + quantily +
                '}';
    }
}
