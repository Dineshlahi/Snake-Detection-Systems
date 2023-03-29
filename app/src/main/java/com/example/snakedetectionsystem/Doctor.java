package com.example.snakedetectionsystem;

public class Doctor {

    int Image;
    String Name;
    String Details;

    String Contacts;

    public Doctor(int image, String name, String details, String contacts) {
        Image = image;
        Name = name;
        Details = details;
        Contacts = contacts;
    }

    public int getImage() {
        return Image;
    }

    public String getName() {
        return Name;
    }

    public String getDetails() {
        return Details;
    }

    public String getContacts() {
        return Contacts;
    }

    public void setImage(int image) {
        Image = image;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDetails(String details) {
        Details = details;
    }

    public void setContacts(String contacts) {
        Contacts = contacts;
    }
}
