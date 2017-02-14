package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String first_name;
    private final String last_name;
    private final String adress;
    private final String home_number;
    private final String mobile;
    private final String year;
    private final String email;

    public ContactData(String first_name, String Last_name, String adress, String home_number, String mobile, String year, String email) {
        this.first_name = first_name;
        last_name = Last_name;
        this.adress = adress;
        this.home_number = home_number;
        this.mobile = mobile;
        this.year = year;
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getAdress() {
        return adress;
    }

    public String getHome_number() {
        return home_number;
    }

    public String getMobile() {
        return mobile;
    }

    public String getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }
}
