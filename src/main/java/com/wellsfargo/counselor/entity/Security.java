package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {
    @Id
    @GeneratedValue
    private long securityId;

    @JoinColumn(name = "portfolioId")
    private Portfolio portfolio;

    public long getSecurityId() {
        return securityId;
    }

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Double purChasePrice;

    @Column(nullable = false)
    private String purChaseDate;

    @Column(nullable = false)
    private long quantity;

    public String getName() {
        return name;
    }

    public Security(Portfolio portfolio, String name, String category, Double purChasePrice, String purChaseDate, long quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purChasePrice = purChasePrice;
        this.purChaseDate = purChaseDate;
        this.quantity = quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPurChasePrice() {
        return purChasePrice;
    }

    public void setPurChasePrice(Double purChasePrice) {
        this.purChasePrice = purChasePrice;
    }

    public String getPurChaseDate() {
        return purChaseDate;
    }

    public void setPurChaseDate(String purChaseDate) {
        this.purChaseDate = purChaseDate;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

}
