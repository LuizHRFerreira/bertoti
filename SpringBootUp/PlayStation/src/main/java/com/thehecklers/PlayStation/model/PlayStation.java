package com.thehecklers.PlayStation.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "playstation_table")
public class PlayStation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private BigDecimal preco;

    public PlayStation(String name, BigDecimal preco) {
        this.name = name;
        this.preco = preco;
    }

    public PlayStation() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
