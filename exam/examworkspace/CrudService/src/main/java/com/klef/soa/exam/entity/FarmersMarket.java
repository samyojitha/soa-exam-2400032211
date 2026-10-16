package com.klef.soa.exam.entity;

import jakarta.persistence.*;

@Entity
public class FarmersMarket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marketName;
    private String location;
    private Integer stallCount;
    private String marketDay;

    public FarmersMarket() 
    {
    	
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getStallCount() {
        return stallCount;
    }

    public void setStallCount(Integer stallCount) {
        this.stallCount = stallCount;
    }

    public String getMarketDay() {
        return marketDay;
    }

    public void setMarketDay(String marketDay) {
        this.marketDay = marketDay;
    }

    @Override
    public String toString() {
        return "FarmersMarket [id=" + id
                + ", marketName=" + marketName
                + ", location=" + location
                + ", stallCount=" + stallCount
                + ", marketDay=" + marketDay + "]";
    }
}