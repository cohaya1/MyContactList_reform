package com.example.mycontactlistreform;

import android.graphics.Bitmap;

import java.util.Calendar;



public class Contact {


    private int contactID;

    private String contactName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String cellNumber;
    private String eMail;
    private Calendar birthday;
    private int bestFriend;
    private Bitmap picture;
    public Contact() {
        contactID = -1;
        birthday = Calendar.getInstance();
        bestFriend =0;
    }

    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public int isBestFriend() {
        return bestFriend;
    }

    public void setAsBestFriend(int num) {
        this.bestFriend = num;
    }

    public void setPicture(Bitmap b) {
        picture = b;
    }
    public Bitmap getPicture() {
        return picture;
    }
}
