package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long PortfolioId;

    @ManyToOne
    @JoinColumn(name = "client_id",nullable = false)
    private Client client;
    @Column(nullable = false)
    private LocalDate creationDate;


    public Portfolio() {
    }

    public Portfolio(Client client, LocalDate creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }


    public long getPortfolioId() {
        return PortfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
