package com.company.Model;

public class Book {

    private String name;
    private Integer Id;
    private Writer[] writers;
    private int year;

    public Book(String name, Integer id, Writer[] writers, int year) {
        this.name = name;
        Id = id;
        this.writers = writers;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Writer[] getWriters() {
        return writers;
    }

    public void setWriters(Writer[] writers) {
        this.writers = writers;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
