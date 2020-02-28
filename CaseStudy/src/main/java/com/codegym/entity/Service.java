package com.codegym.entity;

public class Service {
    private Long   id;
    private String serviceName;
    private String serviceStatus;
    private int    areaUsed;
    private int    numberOfFloors;
    private int    numberMaxPeople;
    private int    rentalCosts;

    public Service() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public int getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(int areaUsed) {
        this.areaUsed = areaUsed;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberMaxPeople() {
        return numberMaxPeople;
    }

    public void setNumberMaxPeople(int numberMaxPeople) {
        this.numberMaxPeople = numberMaxPeople;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }
}
