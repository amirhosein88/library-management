package com.company.Model;

public class Member {

    private String name;
    private Integer Id;
    private Address address;

    public Member(String name, Long Id , Address address) {
    }
    public Member(String name, Long id){
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getNumBorrows(){
        return getNumBorrows();
    }
    public void addBorrow(Borrow borrow){

    }

    public Borrow[] getTotalBorrows(){
        return null;
    }
    public Member getMember(int id){
        return null;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", address=" + address +
                '}';
    }
}
