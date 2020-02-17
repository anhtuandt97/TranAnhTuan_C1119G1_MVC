package Cus;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public String nameCustomer;
    public String birthDay;
    public String address;
    public String picture;
    public static List<Customer> cus;

    static {
        cus = new ArrayList<>();
        cus.add(new Customer("Tuan","06/12/1997","Ha Tinh","img/img1.jpg"));
        cus.add(new Customer("Hien","06/12/1997","Ha Tinh","img/img2.jpg"));
        cus.add(new Customer("Dung","06/12/1997","Ha Tinh","img/img3.jpg"));
        cus.add(new Customer("Son","06/12/1997","Ha Tinh","img/img4.jpg"));
        cus.add(new Customer("Nam","06/12/1997","Ha Tinh","img/img5.jpg"));
    }

    public Customer() {
    }

    public static List<Customer> getCus() {
        return cus;
    }


    public Customer(String nameCustomer, String birthDay, String address, String picture) {
        this.nameCustomer = nameCustomer;
        this.birthDay = birthDay;
        this.address = address;
        this.picture = picture;
    }
    public Customer(String nameCustomer, String birthDay, String address) {
        this.nameCustomer = nameCustomer;
        this.birthDay = birthDay;
        this.address = address;
    }
    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }


}
