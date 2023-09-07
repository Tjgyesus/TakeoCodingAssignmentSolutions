package com.takeo.address;

public class Address {
    private int flatNo;
    private String street;
    private String city;
    private String country;


    public Address(int flatNo, String street, String city, String country) {
        this.flatNo = flatNo;
        this.street = street;
        this.city = city;
        this.country = country;
    }


    public int getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void addressInfo(){
        System.out.println("Address Information");
        System.out.println("Stree \t\t Apt No \t City \t State");
        System.out.println(getStreet()+" apt"+getFlatNo()+" "+getCity()+" "+getCountry());
    }



}
