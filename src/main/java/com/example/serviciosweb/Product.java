package com.example.serviciosweb;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {

    private int pid;
    private String name;
    private double priceFinal;
    private String description;

    public Product() {
    }


    @JsonCreator
    public Product(@JsonProperty("id") int id,
                   @JsonProperty("title") String title,
                   @JsonProperty("price") double price,
                   @JsonProperty("description") String description) {
        this.pid = id;
        this.name = title;
        this.priceFinal = price;
        this.description = description;
    }



    @JsonProperty("pid")
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("priceFinal")
    public double getPriceFinal() {
        return priceFinal;
    }

    public void setPriceFinal(double priceFinal) {
        this.priceFinal = priceFinal;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
