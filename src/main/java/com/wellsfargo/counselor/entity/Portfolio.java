package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private long portfolioId;

   @ManyToOne
    private Client client;

   @Column(nullable = false)
    private long creationDate;

    protected Portfolio(){

    }

    public Portfolio(Client client, long creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }
}
