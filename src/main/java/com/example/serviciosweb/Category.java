package com.example.serviciosweb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {

    private int cid;
    private String title;


    public Category() {
    }

    @JsonCreator
    public Category(
            @JsonProperty("id") int id,
            @JsonProperty("name") String name
    )
    {
        this.cid = id;
        this.title = name;

    }

    @JsonProperty("cid")
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title= title;
    }




}
