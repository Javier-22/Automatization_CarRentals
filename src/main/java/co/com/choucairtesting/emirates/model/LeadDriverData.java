package co.com.choucairtesting.emirates.model;

public class LeadDriverData {
    private String first_name,surname,e_mail,country_code,phone,country_region,city,address,card_number,name,card_expiration_date,security_code;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry_region() {
        return country_region;
    }

    public void setCountry_region(String country_region) {
        this.country_region = country_region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCard_expiration_date() {
        return card_expiration_date;
    }

    public void setCard_expiration_date(String card_expiration_date) {
        this.card_expiration_date = card_expiration_date;
    }

    public String getSecurity_code() {
        return security_code;
    }

    public void setSecurity_code(String security_code) {
        this.security_code = security_code;
    }

    public LeadDriverData(String first_name, String surname, String e_mail, String country_code, String phone, String country_region, String city, String address, String card_number, String name, String card_expiration_date, String security_code) {
        this.first_name = first_name;
        this.surname = surname;
        this.e_mail = e_mail;
        this.country_code = country_code;
        this.phone = phone;
        this.country_region = country_region;
        this.city = city;
        this.address = address;
        this.card_number = card_number;
        this.name = name;
        this.card_expiration_date = card_expiration_date;
        this.security_code = security_code;
    }
}
