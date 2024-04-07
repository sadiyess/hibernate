package com.hb02.embeddable;

/*
 * Adress icin ayri bir tablo olusmasin, Ama Adress sinifindaki degiskenler ,
 * Student tablosunda kolon olarak eklenmesini sagliyor
 */


import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String street;
    private String city;
    private String country;
    private String zipCode;

    //POJO SINIFI - GETTER SETTER


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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    //NOT: toString**************


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
