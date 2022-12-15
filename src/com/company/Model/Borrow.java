package com.company.Model;

public class Borrow {

    private Long Id;
    private Member member;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Borrow(long Id, Member member) {
    }

    public void addBook(Book book) {

    }

    public void removeBook(Book book) {

    }

    public Book[] requestesToBorrow() {
        return null;
    }

    public void addItem(Book book){
    }
    public void removeItem(Book book){

    }

    public Book[] getItems() {
        return null;
    }

}
